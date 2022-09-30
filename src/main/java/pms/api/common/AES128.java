package pms.api.common;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AES128 {
    private final String secretKey; //Secret Key (16자) - 사업자별 제공 받은 후 변경 예정
    private static final Charset ENCODING_TYPE = StandardCharsets.UTF_8;    //인코딩 종류 (UTF-8)
    private static final String INSTANCE_MODE = "AES/CBC/NoPadding"; //인스턴스 (암호화 방식/운용 모드/패딩 방식)

    private Cipher cipher;  //암복화 기능 클래스

    public AES128(String secretKey) {
        this.secretKey = secretKey;

        try {
            cipher = Cipher.getInstance(INSTANCE_MODE); //Cipher 클래스 인스턴스화
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
            System.out.println("Exception : " + e.getLocalizedMessage());
        }
    }

    /**
     * Secret Key Byte 배열 변환
     *
     * @return Secret Key Byte 배열
     */
    private byte[] getKeyBytes() {
        return secretKey.getBytes(ENCODING_TYPE);
    }

    /**
     * Secret Key Spec 클래스 변환
     *
     * @return Secret Key Spec
     */
    private SecretKeySpec getSecretKey() {
        return new SecretKeySpec(getKeyBytes(), "AES"); //Secret key 생성
    }

    /**
     * IV Parameter Spec 클래스 변환
     *
     * @return IV Parameter Spec
     */
    private IvParameterSpec getIvParameter() {
        return new IvParameterSpec(getKeyBytes());
    }

    /**
     * 데이터 암호화
     *
     * @param encodeData 암호화할 데이터
     * @return 암호화된 문자열
     * @throws Exception Exception
     */
    public String encrypt(String encodeData) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(), getIvParameter()); //암호화 모드 초기화
        byte[] encryptedBytes = cipher.doFinal(encodeData.getBytes(ENCODING_TYPE)); //암호화된 Byte 배열

        return new String(Base64.getEncoder().encode(encryptedBytes), ENCODING_TYPE);   //암호화된 Byte 배열을 String 형식으로 변환
    }

    /**
     * 데이터 복호화
     *
     * @param decodeData 복호화할 데이터
     * @return 복호화된 문자열
     * @throws Exception Exception
     */
    public String decrypt(String decodeData) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, getSecretKey(), getIvParameter()); //복호화 모드 초기화
        byte[] encryptedBytes = Base64.getDecoder().decode(decodeData.getBytes(ENCODING_TYPE)); //복호화된 Byte 배열

        return new String(cipher.doFinal(encryptedBytes), ENCODING_TYPE);   //복호화된 Byte 배열을 String 형식으로 변환
    }

    /**
     * Byte 배열의 길이(16 Bytes) 확인
     *
     * @param bytes 확인할 Byte 배열
     * @return Byte 배열 길이 확인 여부
     */
    public boolean checkBytesLength(byte[] bytes) {
        return bytes.length == 16;
    }

    public byte[] encryptBytes(byte[] encodeBytes) throws Exception {
        byte[] bytes = {
                (byte) 0x00, (byte) 0x0C, (byte) 0x00, (byte) 0x10,
                (byte) 0x00, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF,
                (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
        };

        cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(), getIvParameter()); //암호화 모드 초기화
        byte[] encryptedBytes = cipher.doFinal(bytes); //암호화된 Byte 배열

        for (byte getByte : bytes) {
            System.out.println(getByte);
        }

        return encryptedBytes;
    }

    public byte[] decryptBytes() throws Exception {
        return new byte[0];
    }
}