package pms.api.dr;

import com.avob.openadr.model.oadr20b.Oadr20bFactory;
import com.avob.openadr.model.oadr20b.Oadr20bUrlPath;
import com.avob.openadr.model.oadr20b.builders.Oadr20bEiRegisterPartyBuilders;
import com.avob.openadr.model.oadr20b.exception.Oadr20bException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bHttpLayerException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bXMLSignatureException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bXMLSignatureValidationException;
import com.avob.openadr.model.oadr20b.oadr.OadrPayload;
import com.avob.openadr.model.oadr20b.oadr.OadrQueryRegistrationType;
import pms.api.dr.openadr.OadrHttpClient;
import pms.api.dr.openadr.OadrHttpClient20b;
import pms.api.dr.openadr.OadrHttpClientBuilder;
import pms.api.dr.openadr.OadrSecurityException;

import javax.net.ssl.SSLContext;
import javax.xml.bind.JAXBException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SSLTest {

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

    OadrHttpClient oadrHttpClient;

    OadrHttpClient20b oadrHttpClient20b;

    public void test()  {

        String[] certs = { rsaTrustedRootCertificate };

        try {
            oadrHttpClient = new OadrHttpClientBuilder().withProtocol(protocols, ciphers)
                    .withX509Authentication(rsaPrivateKeyPemFilePath, rsaClientCertPemFilePath)
                    .withTrustedCertificate(Arrays.asList(certs))
                    .withHeader("Content-Type","application/xml")
                    .withHeader("Accept","*/*")
                    .enableHttp(true).withTimeout(TIMEOUT).build();

            oadrHttpClient20b = new OadrHttpClient20b(oadrHttpClient, rsaPrivateKeyPemFilePath, rsaClientCertPemFilePath, null, true);

            OadrQueryRegistrationType oadrQueryRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bQueryRegistrationBuilder("metis02").build();

            OadrPayload request = Oadr20bFactory.createOadrPayload("mypayload", oadrQueryRegistrationType);


            OadrPayload oadrPayload = oadrHttpClient20b.post(Oadr20bFactory.createOadrPayload(request),Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);
            System.out.println("---------------------------------------------------\nVTN ->");
            System.out.println(oadrPayload);
            System.out.println("---------------------------------------------------");
        } catch (OadrSecurityException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        }
    }
}
