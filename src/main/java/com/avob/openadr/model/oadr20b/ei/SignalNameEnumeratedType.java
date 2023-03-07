//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SignalTypeEnumeratedType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="SignalTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="delta"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="multiplier"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="priceMultiplier"/>
 *     &lt;enumeration value="priceRelative"/>
 *     &lt;enumeration value="setpoint"/>
 *     &lt;enumeration value="x-loadControlCapacity"/>
 *     &lt;enumeration value="x-loadControlLevelOffset"/>
 *     &lt;enumeration value="x-loadControlPercentOffset"/>
 *     &lt;enumeration value="x-loadControlSetpoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignalNameEnumeratedType")
@XmlEnum
public enum SignalNameEnumeratedType {

    @XmlEnumValue("SIMPLE")
    SIMPLE("SIMPLE"),

    /*@XmlEnumValue("simple")
    simple("simple"),*/

    @XmlEnumValue("ELECTRICITY_PRICE")
    ELECTRICITY_PRICE("ELECTRICITY_PRICE"),

    @XmlEnumValue("ENERGY_PRICE")
    ENERGY_PRICE("ENERGY_PRICE"),


    @XmlEnumValue("DEMAND_CHARGE")
    DEMAND_CHARGE("DEMAND_CHARGE"),

    @XmlEnumValue("BID_PRICE")
    BID_PRICE("BID_PRICE"),

    @XmlEnumValue("BID_LOAD")
    BID_LOAD("BID_LOAD"),

    @XmlEnumValue("BID_ENERGY")
    BID_ENERGY("BID_ENERGY"),

    @XmlEnumValue("CHARGE_STATE")
    CHARGE_STATE("CHARGE_STATE"),

    @XmlEnumValue("LOAD_DISPATCH")
    LOAD_DISPATCH("LOAD_DISPATCH"),

    @XmlEnumValue("LOAD_CONTROL")
    LOAD_CONTROL("LOAD_CONTROL");

    private final String value;

    SignalNameEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignalNameEnumeratedType fromValue(String v) {
        for (SignalNameEnumeratedType c: SignalNameEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
