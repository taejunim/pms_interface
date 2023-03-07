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
 * <p>ReadingTypeEnumeratedType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadingTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Direct Read"/>
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="Allocated"/>
 *     &lt;enumeration value="Estimated"/>
 *     &lt;enumeration value="Summed"/>
 *     &lt;enumeration value="Derived"/>
 *     &lt;enumeration value="Mean"/>
 *     &lt;enumeration value="Peak"/>
 *     &lt;enumeration value="Hybrid"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Projected"/>
 *     &lt;enumeration value="x-RMS"/>
 *     &lt;enumeration value="x-notApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadingTypeEnumeratedType")
@XmlEnum
public enum ReadingTypeEnumeratedType {


    /**
     * Reading is read from a device that increases monotonically, and usage must be computed from pairs of start and stop readings.
     * 
     */
    @XmlEnumValue("Direct Read")
    DIRECT_READ("Direct Read"),

    /**
     * Meter or [resource] prepares its own calculation of total use over time.
     * 
     */
    @XmlEnumValue("Net")
    NET("Net"),

    /**
     * Meter covers several [resources] and usage is inferred through some sort of pro data computation.
     * 
     */
    @XmlEnumValue("Allocated")
    ALLOCATED("Allocated"),

    /**
     * Used when a reading is absent in a series in which most readings are present.
     * 
     */
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated"),

    /**
     * Several meters together provide the reading for this [resource]. This is specifically a different than aggregated, which refers to multiple [resources] in the same payload. See also Hybrid.
     * 
     */
    @XmlEnumValue("Summed")
    SUMMED("Summed"),

    /**
     * Usage is inferred through knowledge of run-time, normal operation, etc.
     * 
     */
    @XmlEnumValue("Derived")
    DERIVED("Derived"),

    /**
     * Reading is the mean value over the period indicated in Granularity
     * 
     */
    @XmlEnumValue("Mean")
    MEAN("Mean"),

    /**
     * Reading is Peak (highest) value over the period indicated in granularity. For some measurements, it may make more sense as the lowest value. May not be consistent with aggregate readings. Only valid for flow-rate Item Bases, i.e., Power not Energy.
     * 
     */
    @XmlEnumValue("Peak")
    PEAK("Peak"),

    /**
     * If aggregated, refers to different reading types in the aggregate number.
     * 
     */
    @XmlEnumValue("Hybrid")
    HYBRID("Hybrid"),

    /**
     * Indicates reading is pro forma, i.e., is reported at agreed upon rates
     * 
     */
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),

    /**
     * Indicates reading is in the future, and has not yet been measured.
     * 
     */
    @XmlEnumValue("Projected")
    PROJECTED("Projected"),

    /**
     * Root Mean Square
     * 
     */
    @XmlEnumValue("x-RMS")
    X_RMS("x-RMS"),

    /**
     * Not Applicable
     * 
     */
    @XmlEnumValue("x-notApplicable")
    X_NOT_APPLICABLE("x-notApplicable");
    private final String value;

    ReadingTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadingTypeEnumeratedType fromValue(String v) {
        for (ReadingTypeEnumeratedType c: ReadingTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
