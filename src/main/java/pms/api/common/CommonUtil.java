package pms.api.common;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

public class CommonUtil {

    public String convertHex(String string) {

        char[] chars = string.toCharArray();

        for (char getChar : chars) {
            System.out.println(Integer.toHexString(getChar));
        }

        System.out.println(Integer.toHexString(2));
        byte[] stringBytes = string.getBytes(StandardCharsets.UTF_8);
        System.out.println(DatatypeConverter.printHexBinary(stringBytes));

        return "";
    }
}
