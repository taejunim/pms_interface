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
@XmlType(name = "SignalTypeEnumeratedType")
@XmlEnum
public enum SignalTypeEnumeratedType {


    /**
     * Signal indicates the amount to change from what one would have used without the signal.
     * 
     */
    @XmlEnumValue("delta")
    DELTA("delta"),

    /**
     * Signal indicates a program level.
     * 
     */
    @XmlEnumValue("level")
    LEVEL("level"),

    /**
     * Signal indicates a multiplier applied to the current rate of  delivery or usage from what one would have used without the signal.
     * 
     */
    @XmlEnumValue("multiplier")
    MULTIPLIER("multiplier"),

    /**
     * Signal indicates the price.
     * 
     */
    @XmlEnumValue("price")
    PRICE("price"),

    /**
     * Signal indicates the price multiplier. Extended price is the computed price value multiplied by the number of units.
     * 
     */
    @XmlEnumValue("priceMultiplier")
    PRICE_MULTIPLIER("priceMultiplier"),

    /**
     * Signal indicates the relative price.
     * 
     */
    @XmlEnumValue("priceRelative")
    PRICE_RELATIVE("priceRelative"),

    /**
     * Signal indicates a target amount of units.
     * 
     */
    @XmlEnumValue("setpoint")
    SETPOINT("setpoint"),

    /**
     * This is an instruction for the load controller to operate at a level that is some percentage of its maximum load consumption capacity. This can be mapped to specific load controllers to do things like duty cycling. Note that 1.0 refers to 100% consumption. In the case of simple ON/OFF type devices then 0 = OFF and 1 = ON.
     * 
     */
    @XmlEnumValue("x-loadControlCapacity")
    X_LOAD_CONTROL_CAPACITY("x-loadControlCapacity"),

    /**
     * Discrete integer levels that are relative to normal operations where 0 is normal operations.
     * 
     */
    @XmlEnumValue("x-loadControlLevelOffset")
    X_LOAD_CONTROL_LEVEL_OFFSET("x-loadControlLevelOffset"),

    /**
     * Percentage change from normal load control operations.
     * 
     */
    @XmlEnumValue("x-loadControlPercentOffset")
    X_LOAD_CONTROL_PERCENT_OFFSET("x-loadControlPercentOffset"),

    /**
     * Load controller set points.
     * 
     */
    @XmlEnumValue("x-loadControlSetpoint")
    X_LOAD_CONTROL_SETPOINT("x-loadControlSetpoint");
    private final String value;

    SignalTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignalTypeEnumeratedType fromValue(String v) {
        for (SignalTypeEnumeratedType c: SignalTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
