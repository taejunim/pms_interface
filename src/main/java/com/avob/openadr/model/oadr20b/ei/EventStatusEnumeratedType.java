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
 * <p>EventStatusEnumeratedType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="EventStatusEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="far"/>
 *     &lt;enumeration value="near"/>
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="completed"/>
 *     &lt;enumeration value="cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventStatusEnumeratedType")
@XmlEnum
public enum EventStatusEnumeratedType {


    /**
     * No event pending
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Event pending in the far future. The exact definition of how far in the future this refers is dependent upon the market context, but typically means the next day.
     * 
     */
    @XmlEnumValue("far")
    FAR("far"),

    /**
     * Event pending in the near future. The exact definition of how near in the future the pending event is active is dependent on the market context.
     * 
     */
    @XmlEnumValue("near")
    NEAR("near"),

    /**
     * The event has been initiated and is currently active.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The event has completed.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The event has been canceled.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final String value;

    EventStatusEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventStatusEnumeratedType fromValue(String v) {
        for (EventStatusEnumeratedType c: EventStatusEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
