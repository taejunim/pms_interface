//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>oadrDataQualityType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="oadrDataQualityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="No Quality - No Value"/>
 *     &lt;enumeration value="No New Value - Previous Value Used"/>
 *     &lt;enumeration value="Quality Bad - Non Specific"/>
 *     &lt;enumeration value="Quality Bad - Configuration Error"/>
 *     &lt;enumeration value="Quality Bad - Not Connected"/>
 *     &lt;enumeration value="Quality Bad - Device Failure"/>
 *     &lt;enumeration value="Quality Bad - Sensor Failure"/>
 *     &lt;enumeration value="Quality Bad - Last Known Value"/>
 *     &lt;enumeration value="Quality Bad - Comm Failure"/>
 *     &lt;enumeration value="Quality Bad - Out of Service"/>
 *     &lt;enumeration value="Quality Uncertain - Non Specific"/>
 *     &lt;enumeration value="Quality Uncertain - Last Usable Value"/>
 *     &lt;enumeration value="Quality Uncertain - Sensor Not Accurate"/>
 *     &lt;enumeration value="Quality Uncertain - EU Units Exceeded"/>
 *     &lt;enumeration value="Quality Uncertain - Sub Normal"/>
 *     &lt;enumeration value="Quality Good - Non Specific"/>
 *     &lt;enumeration value="Quality Good - Local Override"/>
 *     &lt;enumeration value="Quality Limit - Field/Not"/>
 *     &lt;enumeration value="Quality Limit - Field/Low"/>
 *     &lt;enumeration value="Quality Limit - Field/High"/>
 *     &lt;enumeration value="Quality Limit - Field/Constant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oadrDataQualityType")
@XmlEnum
public enum OadrDataQualityType {

    @XmlEnumValue("No Quality - No Value")
    NO_QUALITY_NO_VALUE("No Quality - No Value"),
    @XmlEnumValue("No New Value - Previous Value Used")
    NO_NEW_VALUE_PREVIOUS_VALUE_USED("No New Value - Previous Value Used"),
    @XmlEnumValue("Quality Bad - Non Specific")
    QUALITY_BAD_NON_SPECIFIC("Quality Bad - Non Specific"),
    @XmlEnumValue("Quality Bad - Configuration Error")
    QUALITY_BAD_CONFIGURATION_ERROR("Quality Bad - Configuration Error"),
    @XmlEnumValue("Quality Bad - Not Connected")
    QUALITY_BAD_NOT_CONNECTED("Quality Bad - Not Connected"),
    @XmlEnumValue("Quality Bad - Device Failure")
    QUALITY_BAD_DEVICE_FAILURE("Quality Bad - Device Failure"),
    @XmlEnumValue("Quality Bad - Sensor Failure")
    QUALITY_BAD_SENSOR_FAILURE("Quality Bad - Sensor Failure"),
    @XmlEnumValue("Quality Bad - Last Known Value")
    QUALITY_BAD_LAST_KNOWN_VALUE("Quality Bad - Last Known Value"),
    @XmlEnumValue("Quality Bad - Comm Failure")
    QUALITY_BAD_COMM_FAILURE("Quality Bad - Comm Failure"),
    @XmlEnumValue("Quality Bad - Out of Service")
    QUALITY_BAD_OUT_OF_SERVICE("Quality Bad - Out of Service"),
    @XmlEnumValue("Quality Uncertain - Non Specific")
    QUALITY_UNCERTAIN_NON_SPECIFIC("Quality Uncertain - Non Specific"),
    @XmlEnumValue("Quality Uncertain - Last Usable Value")
    QUALITY_UNCERTAIN_LAST_USABLE_VALUE("Quality Uncertain - Last Usable Value"),
    @XmlEnumValue("Quality Uncertain - Sensor Not Accurate")
    QUALITY_UNCERTAIN_SENSOR_NOT_ACCURATE("Quality Uncertain - Sensor Not Accurate"),
    @XmlEnumValue("Quality Uncertain - EU Units Exceeded")
    QUALITY_UNCERTAIN_EU_UNITS_EXCEEDED("Quality Uncertain - EU Units Exceeded"),
    @XmlEnumValue("Quality Uncertain - Sub Normal")
    QUALITY_UNCERTAIN_SUB_NORMAL("Quality Uncertain - Sub Normal"),
    @XmlEnumValue("Quality Good - Non Specific")
    QUALITY_GOOD_NON_SPECIFIC("Quality Good - Non Specific"),
    @XmlEnumValue("Quality Good - Local Override")
    QUALITY_GOOD_LOCAL_OVERRIDE("Quality Good - Local Override"),
    @XmlEnumValue("Quality Limit - Field/Not")
    QUALITY_LIMIT_FIELD_NOT("Quality Limit - Field/Not"),
    @XmlEnumValue("Quality Limit - Field/Low")
    QUALITY_LIMIT_FIELD_LOW("Quality Limit - Field/Low"),
    @XmlEnumValue("Quality Limit - Field/High")
    QUALITY_LIMIT_FIELD_HIGH("Quality Limit - Field/High"),
    @XmlEnumValue("Quality Limit - Field/Constant")
    QUALITY_LIMIT_FIELD_CONSTANT("Quality Limit - Field/Constant");
    private final String value;

    OadrDataQualityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OadrDataQualityType fromValue(String v) {
        for (OadrDataQualityType c: OadrDataQualityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
