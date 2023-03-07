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
 * <p>ReportEnumeratedType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="reading"/>
 *     &lt;enumeration value="usage"/>
 *     &lt;enumeration value="demand"/>
 *     &lt;enumeration value="setPoint"/>
 *     &lt;enumeration value="deltaUsage"/>
 *     &lt;enumeration value="deltaSetPoint"/>
 *     &lt;enumeration value="deltaDemand"/>
 *     &lt;enumeration value="baseline"/>
 *     &lt;enumeration value="deviation"/>
 *     &lt;enumeration value="avgUsage"/>
 *     &lt;enumeration value="avgDemand"/>
 *     &lt;enumeration value="operatingState"/>
 *     &lt;enumeration value="upRegulationCapacityAvailable"/>
 *     &lt;enumeration value="downRegulationCapacityAvailable"/>
 *     &lt;enumeration value="regulationSetpoint"/>
 *     &lt;enumeration value="storedEnergy"/>
 *     &lt;enumeration value="targetEnergyStorage"/>
 *     &lt;enumeration value="availableEnergyStorage"/>
 *     &lt;enumeration value="price"/>
 *     &lt;enumeration value="level"/>
 *     &lt;enumeration value="powerFactor"/>
 *     &lt;enumeration value="percentUsage"/>
 *     &lt;enumeration value="percentDemand"/>
 *     &lt;enumeration value="x-resourceStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportEnumeratedType")
@XmlEnum
public enum ReportEnumeratedType {


    /**
     * Report indicates a reading, as from a meter. Readings are moments in time-changes over time can be computed from the difference between successive readings. Payload type is float
     * 
     */
    @XmlEnumValue("reading")
    READING("reading"),

    /**
     * Report indicates an amount of units (denominated in ItemBase or in the EMIX Product) over a period. Payload type is Quantity. A typical ItemBase is Real Energy.
     * 
     */
    @XmlEnumValue("usage")
    USAGE("usage"),

    /**
     * Report indicates an amount of units (denominated in ItemBase or in the EMIX Product). Payload type is Quantity. A typical ItemBase is Real Power.
     * 
     */
    @XmlEnumValue("demand")
    DEMAND("demand"),

    /**
     * Report indicates the amount (denominated in ItemBase or in the EMIX Product) currently set. May be a confirmation/return of the setpoint control value sent from the VTN. Payload type is Quantity. A typical ItemBase is Real Power.
     * 
     */
    @XmlEnumValue("setPoint")
    SET_POINT("setPoint"),

    /**
     * Change in usage as compared to the baseline. See usage for more information
     * 
     */
    @XmlEnumValue("deltaUsage")
    DELTA_USAGE("deltaUsage"),

    /**
     * Changes in setpoint from previous schedule.
     * 
     */
    @XmlEnumValue("deltaSetPoint")
    DELTA_SET_POINT("deltaSetPoint"),

    /**
     * Change in demand as compared to the baseline. See demand for more information
     * 
     */
    @XmlEnumValue("deltaDemand")
    DELTA_DEMAND("deltaDemand"),

    /**
     * Can be demand or usage, as indicated by ItemBase. Indicates what [measurement] would be if not for the event or regulation. Report is of the format Baseline.
     * 
     */
    @XmlEnumValue("baseline")
    BASELINE("baseline"),

    /**
     * Difference between some instruction and actual state.
     * 
     */
    @XmlEnumValue("deviation")
    DEVIATION("deviation"),

    /**
     * Average usage over the duration indicated by the Granularity. See usage for more information.
     * 
     */
    @XmlEnumValue("avgUsage")
    AVG_USAGE("avgUsage"),

    /**
     * Average usage over the duration indicated by the Granularity. See demand for more information.
     * 
     */
    @XmlEnumValue("avgDemand")
    AVG_DEMAND("avgDemand"),

    /**
     * Generalized state of a resource such as on/off, occupancy of building, etc. No ItemBase is relevant. Requires an Application Specific Payload Extension.
     * 
     */
    @XmlEnumValue("operatingState")
    OPERATING_STATE("operatingState"),

    /**
     * Up Regulation capacity available for dispatch, expressed in EMIX Real Power. Payload is always expressed as positive Quantity.
     * 
     */
    @XmlEnumValue("upRegulationCapacityAvailable")
    UP_REGULATION_CAPACITY_AVAILABLE("upRegulationCapacityAvailable"),

    /**
     * Down Regulation capacity available for dispatch, expressed in EMIX Real Power. Payload is always expressed as positive Quantity.
     * 
     */
    @XmlEnumValue("downRegulationCapacityAvailable")
    DOWN_REGULATION_CAPACITY_AVAILABLE("downRegulationCapacityAvailable"),

    /**
     * Regulation setpoint as instructed as part of regulation services
     * 
     */
    @XmlEnumValue("regulationSetpoint")
    REGULATION_SETPOINT("regulationSetpoint"),

    /**
     * Stored Energy is expressed as Real Energy and Payload is expressed as a Quantity.
     * 
     */
    @XmlEnumValue("storedEnergy")
    STORED_ENERGY("storedEnergy"),

    /**
     * Target Energy is expressed as Real Energy and Payload is expressed as a Quantity.
     * 
     */
    @XmlEnumValue("targetEnergyStorage")
    TARGET_ENERGY_STORAGE("targetEnergyStorage"),

    /**
     * Capacity available for further energy storage, perhaps to get to Target Energy Storage
     * 
     */
    @XmlEnumValue("availableEnergyStorage")
    AVAILABLE_ENERGY_STORAGE("availableEnergyStorage"),

    /**
     * Price per ItemBase at each Interval
     * 
     */
    @XmlEnumValue("price")
    PRICE("price"),

    /**
     * Simple level from market at each Interval. Itembase is not relevant.
     * 
     */
    @XmlEnumValue("level")
    LEVEL("level"),

    /**
     * Power factor for the resource.
     * 
     */
    @XmlEnumValue("powerFactor")
    POWER_FACTOR("powerFactor"),

    /**
     * Percentage of usage.
     * 
     */
    @XmlEnumValue("percentUsage")
    PERCENT_USAGE("percentUsage"),

    /**
     * Percentage of demand
     * 
     */
    @XmlEnumValue("percentDemand")
    PERCENT_DEMAND("percentDemand"),

    /**
     * Percentage of demand
     * 
     */
    @XmlEnumValue("x-resourceStatus")
    X_RESOURCE_STATUS("x-resourceStatus");
    private final String value;

    ReportEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportEnumeratedType fromValue(String v) {
        for (ReportEnumeratedType c: ReportEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
