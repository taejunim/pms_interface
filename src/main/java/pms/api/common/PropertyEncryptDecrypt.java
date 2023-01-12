package pms.api.common;

import com.penta.issacweb.IssacWebJNIServer;
import com.penta.issacweb.IssacWebServer;
import com.penta.sdk.bs.IssacBASE64;
import com.penta.sdk.bs.IssacInitialize;
import com.penta.sdk.bs.IssacSDKException;
import com.penta.sdk.se.IssacSECONTEXT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Component
public class PropertyEncryptDecrypt {

    //로그 설정
    private static final Logger logger = LoggerFactory.getLogger(PropertyEncryptDecrypt.class);

    //docker container 내부 기본 경로
    private static String filePath    = "webapps" + File.separator + "ROOT" + File.separator + "WEB-INF" + File.separator + "classes" + File.separator;
    //API 관련 properties
    private static String apiFilePath = filePath + "interface.properties";
    //DB properties
    private static String dbFilePath  = filePath + "application.properties";

    //암복호화 모듈 관련 변수
    public static IssacInitialize.Result initResult;
    public static IssacWebServer iw;
    public static byte[] derivedKey;
    public static String password;
    public static byte[] salt;
    public static byte[] iiv;

    //운영서버에서만 암호화를 진행하기 위한 변수 (application.properties - spring.profiles.active)
    public static String environment;
    @Value("${spring.profiles.active}")
    private void setEnvironment(String environment){
        PropertyEncryptDecrypt.environment = environment;
    }

    //프로그램 실행시 한번 수행됨. 실서버 반영하는 상황에만 암호화 수행.
    public static void encryptProcess() {

        if(environment.equals("svc")) {
            logger.debug("보안 모듈 초기화를 진행합니다.");
            initializeModule();
            if (derivedKey != null && derivedKey.length == 16 && initResult == IssacInitialize.Result.Success) {
               logger.debug("보안 모듈 초기화에 성공하였습니다. properties 암호화를 진행합니다.");
               doEncrypt(apiFilePath);
               doEncrypt(dbFilePath);
            } else {
               logger.error("모듈 초기화에 실패하였습니다. 암호화를 진행하지 않습니다.");
            }
        } else if(environment.equals("dev")) {
            logger.debug("개발 환경에서는 암복호화를 진행하지 않습니다.");
        } else logger.error("spring.profiles.active 설정 필요");
    }

    //보안모듈 초기화
    public static void initializeModule() {

        try {
            //라이브러리 초기화
            //KCMVP 인증 요구사항 중 초기화 과정에서 자가시험을 진행하도록 되어 있기 때문에 필요한 과정
            initResult = IssacInitialize.initializeModule();
            if (initResult != IssacInitialize.Result.Success) {
                logger.error("[ERROR] " + initResult.name());
                logger.error("[ERROR] 라이브러리 초기화에 실패하였습니다.");
                return;
            }

            //PBKDF2 약속된 값들을 설정 후 나온 키값 설정
            iw = new IssacWebJNIServer("pmsInterface", 1024);
            password = iw.issacweb_get_pubkey();
            salt = IssacSECONTEXT.MakeRandom(20);

            derivedKey = IssacSECONTEXT.PBKDF2_GetKey(16, password, salt, 1000, IssacSECONTEXT.SHA1);
            if (derivedKey == null || derivedKey.length != 16) {
                throw new IssacSDKException("IssacSECONTEXT.PBKDF2_GetKey() failed");
            }
            iiv = IssacSECONTEXT.MakeRandom(16);

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    //실제 암호화 수행하는 메소드
    public static void doEncrypt(String filePath) {

        try {
            //Set ENCRYPT
            IssacSECONTEXT encipher = new IssacSECONTEXT();
            encipher.Set(derivedKey, iiv, IssacSECONTEXT.ISSACAPI_SE_CBC_MODE, IssacSECONTEXT.ISSACAPI_AES128);

            File interfaceProperties = new File(filePath);
            Properties properties = new Properties();

            FileInputStream fis = new FileInputStream(interfaceProperties);

            //인코딩 설정 (UTF-8)
            properties.load(new InputStreamReader(fis, StandardCharsets.UTF_8));
            fis.close();

            //API 서비스키 및 DB 접속 정보 properties 찾기
            for (String propertyName : properties.stringPropertyNames()) {
                if (propertyName.contains("serviceKey") || propertyName.contains("jdbc-url") || propertyName.contains("username") || propertyName.contains("password")) {
                    String encryptResult     = IssacBASE64.Encode(encipher.Encrypt(properties.getProperty(propertyName).getBytes()));
                    logger.debug(propertyName + " 암호화 결과 : " + encryptResult);
                    properties.setProperty(propertyName, encryptResult);
                }
            }

            FileOutputStream fos = new FileOutputStream(interfaceProperties);
            properties.store(fos, "API KEY ENCRYPTION");

            fos.close();
            encipher.close();
        } catch (Exception e) {
           logger.error(e.getMessage());
           e.printStackTrace();
        }
    }
}
