package com.avob.openadr.model.oadr20b.xmlsignature;

import javax.xml.crypto.*;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import java.security.Key;
import java.security.KeyException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

public class KeyValueKeySelector extends KeySelector {

	private static class SimpleKeySelectorResult implements KeySelectorResult {
		private PublicKey pk;

		SimpleKeySelectorResult(PublicKey pk) {
			this.pk = pk;
		}

		@Override
		public Key getKey() {
			return pk;
		}
	}

	@Override
	public KeySelectorResult select(KeyInfo keyInfo, Purpose purpose, AlgorithmMethod method,
			XMLCryptoContext context) throws KeySelectorException {
		if (keyInfo == null) {
			throw new KeySelectorException("Null KeyInfo object!");
		}
		SignatureMethod sm = (SignatureMethod) method;
		List<?> list = keyInfo.getContent();

		for (int i = 0; i < list.size(); i++) {
			XMLStructure xmlStructure = (XMLStructure) list.get(i);
			if (xmlStructure instanceof KeyValue) {
				PublicKey pk = null;
				try {
					pk = ((KeyValue) xmlStructure).getPublicKey();
				} catch (KeyException ke) {
					throw new KeySelectorException(ke);
				}
				// make sure algorithm is compatible with method
				if (algEquals(sm.getAlgorithm(), pk.getAlgorithm())) {
					return new SimpleKeySelectorResult(pk);
				}
			} else if (xmlStructure instanceof X509Data) {
				X509Data x509Data = (X509Data) xmlStructure;
				Iterator<?> xi = x509Data.getContent().iterator();
				while (xi.hasNext()) {
					Object o = xi.next();
					if (!(o instanceof X509Certificate)) {
						continue;
					}
					final PublicKey key = ((X509Certificate) o).getPublicKey();
					// Make sure the algorithm is compatible
					// with the method.
					if (algEquals(method.getAlgorithm(), key.getAlgorithm())) {
						return new KeySelectorResult() {
							@Override
							public Key getKey() {
								return key;
							}
						};
					}
				}

			}
		}
		throw new KeySelectorException("No KeyValue element found!");
	}

	static boolean algEquals(String algURI, String algName) {
		boolean equals = false;
		if ("DSA".equalsIgnoreCase(algName) && algURI.equalsIgnoreCase(SignatureMethod.DSA_SHA1)) {
			equals = true;
		} else if ("RSA".equalsIgnoreCase(algName) && algURI.equalsIgnoreCase(SignatureMethod.RSA_SHA1)) {
			equals = true;
		} else if ("RSA".equalsIgnoreCase(algName)
				&& algURI.equalsIgnoreCase(OadrXMLSignatureHandler.RSA_SHA256_ALGORITHM)) {
			equals = true;
		} else if (algName.equalsIgnoreCase("EC")
				&& algURI.equalsIgnoreCase(OadrXMLSignatureHandler.ECDSA_SHA256_ALGORITHM)) {
			return true;
		}
		return equals;
	}
}