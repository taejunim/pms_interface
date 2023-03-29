package pms.api.dr;

import pms.api.dr.openadr.OadrHttpClient;
import pms.api.dr.openadr.OadrHttpClient20b;
import pms.api.dr.openadr.OadrHttpClientBuilder;
import pms.api.dr.openadr.OadrSecurityException;

import javax.net.ssl.SSLContext;
import javax.xml.bind.JAXBException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class DrConfig {

    private static final String rsaTrustedRootCertificate = "src/main/resources/KPX_DR_CA_2016.crt";
    private static final String rsaPrivateKeyPemFilePath = "src/main/resources/20200500002642.key";
    private static final String rsaClientCertPemFilePath = "src/main/resources/20200500002642.crt";
    private static final String[] protocols = new String[] { "TLSv1.2" };
    private static final String[] ciphers;

    static {
        try {
            ciphers = SSLContext.getDefault().getDefaultSSLParameters().getCipherSuites();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static final int TIMEOUT = 5000;

    OadrHttpClient20b oadrHttpClient20b;

    public OadrHttpClient20b initOadrHttpClient20b() {

        try {

            String[] certs = { rsaTrustedRootCertificate };

            OadrHttpClient oadrHttpClient = new OadrHttpClientBuilder().withProtocol(protocols, ciphers)
                    .withX509Authentication(rsaPrivateKeyPemFilePath, rsaClientCertPemFilePath)
                    .withTrustedCertificate(Arrays.asList(certs))
                    .withHeader("Content-Type","application/xml")
                    .withHeader("Accept","*/*")
                    .enableHttp(true).withTimeout(TIMEOUT).build();

            return oadrHttpClient20b = new OadrHttpClient20b(oadrHttpClient, rsaPrivateKeyPemFilePath, rsaClientCertPemFilePath, null, true);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (OadrSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
