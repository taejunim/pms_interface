//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.greenbutton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Characteristics associated with all Readings included in a MeterReading.
 * 
 * <p>ReadingType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReadingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="accumulationBehaviour" type="{http://naesb.org/espi}AccumulationKind" minOccurs="0"/>
 *         &lt;element name="commodity" type="{http://naesb.org/espi}CommodityKind" minOccurs="0"/>
 *         &lt;element name="consumptionTier" type="{http://naesb.org/espi}Int16" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://naesb.org/espi}Currency" minOccurs="0"/>
 *         &lt;element name="dataQualifier" type="{http://naesb.org/espi}DataQualifierKind" minOccurs="0"/>
 *         &lt;element name="defaultQuality" type="{http://naesb.org/espi}QualityOfReading" minOccurs="0"/>
 *         &lt;element name="flowDirection" type="{http://naesb.org/espi}FlowDirectionKind" minOccurs="0"/>
 *         &lt;element name="intervalLength" type="{http://naesb.org/espi}UInt32" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://naesb.org/espi}MeasurementKind" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://naesb.org/espi}PhaseCodeKind" minOccurs="0"/>
 *         &lt;element name="powerOfTenMultiplier" type="{http://naesb.org/espi}UnitMultiplierKind" minOccurs="0"/>
 *         &lt;element name="timeAttribute" type="{http://naesb.org/espi}TimePeriodOfInterest" minOccurs="0"/>
 *         &lt;element name="tou" type="{http://naesb.org/espi}Int16" minOccurs="0"/>
 *         &lt;element name="uom" type="{http://naesb.org/espi}UnitSymbolKind" minOccurs="0"/>
 *         &lt;element name="cpp" type="{http://naesb.org/espi}Int16" minOccurs="0"/>
 *         &lt;element name="interharmonic" type="{http://naesb.org/espi}ReadingInterharmonic" minOccurs="0"/>
 *         &lt;element name="measuringPeriod" type="{http://naesb.org/espi}TimeAttributeKind" minOccurs="0"/>
 *         &lt;element name="argument" type="{http://naesb.org/espi}RationalNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingType", propOrder = {
    "accumulationBehaviour",
    "commodity",
    "consumptionTier",
    "currency",
    "dataQualifier",
    "defaultQuality",
    "flowDirection",
    "intervalLength",
    "kind",
    "phase",
    "powerOfTenMultiplier",
    "timeAttribute",
    "tou",
    "uom",
    "cpp",
    "interharmonic",
    "measuringPeriod",
    "argument"
})
public class ReadingType
    extends IdentifiedObject
{

    protected String accumulationBehaviour;
    protected String commodity;
    protected Short consumptionTier;
    protected String currency;
    protected String dataQualifier;
    protected String defaultQuality;
    protected String flowDirection;
    @XmlSchemaType(name = "unsignedInt")
    protected Long intervalLength;
    protected String kind;
    protected String phase;
    protected String powerOfTenMultiplier;
    protected String timeAttribute;
    protected Short tou;
    protected String uom;
    protected Short cpp;
    protected ReadingInterharmonic interharmonic;
    protected String measuringPeriod;
    protected RationalNumber argument;

    /**
     * accumulationBehaviour 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulationBehaviour() {
        return accumulationBehaviour;
    }

    /**
     * accumulationBehaviour 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulationBehaviour(String value) {
        this.accumulationBehaviour = value;
    }

    /**
     * commodity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * commodity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * consumptionTier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getConsumptionTier() {
        return consumptionTier;
    }

    /**
     * consumptionTier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setConsumptionTier(Short value) {
        this.consumptionTier = value;
    }

    /**
     * currency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * currency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * dataQualifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataQualifier() {
        return dataQualifier;
    }

    /**
     * dataQualifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataQualifier(String value) {
        this.dataQualifier = value;
    }

    /**
     * defaultQuality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultQuality() {
        return defaultQuality;
    }

    /**
     * defaultQuality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultQuality(String value) {
        this.defaultQuality = value;
    }

    /**
     * flowDirection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowDirection() {
        return flowDirection;
    }

    /**
     * flowDirection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowDirection(String value) {
        this.flowDirection = value;
    }

    /**
     * intervalLength 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntervalLength() {
        return intervalLength;
    }

    /**
     * intervalLength 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntervalLength(Long value) {
        this.intervalLength = value;
    }

    /**
     * kind 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * kind 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * phase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * phase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * powerOfTenMultiplier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerOfTenMultiplier() {
        return powerOfTenMultiplier;
    }

    /**
     * powerOfTenMultiplier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOfTenMultiplier(String value) {
        this.powerOfTenMultiplier = value;
    }

    /**
     * timeAttribute 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAttribute() {
        return timeAttribute;
    }

    /**
     * timeAttribute 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAttribute(String value) {
        this.timeAttribute = value;
    }

    /**
     * tou 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTou() {
        return tou;
    }

    /**
     * tou 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTou(Short value) {
        this.tou = value;
    }

    /**
     * uom 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * uom 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * cpp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCpp() {
        return cpp;
    }

    /**
     * cpp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCpp(Short value) {
        this.cpp = value;
    }

    /**
     * interharmonic 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReadingInterharmonic }
     *     
     */
    public ReadingInterharmonic getInterharmonic() {
        return interharmonic;
    }

    /**
     * interharmonic 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingInterharmonic }
     *     
     */
    public void setInterharmonic(ReadingInterharmonic value) {
        this.interharmonic = value;
    }

    /**
     * measuringPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasuringPeriod() {
        return measuringPeriod;
    }

    /**
     * measuringPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasuringPeriod(String value) {
        this.measuringPeriod = value;
    }

    /**
     * argument 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RationalNumber }
     *     
     */
    public RationalNumber getArgument() {
        return argument;
    }

    /**
     * argument 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RationalNumber }
     *     
     */
    public void setArgument(RationalNumber value) {
        this.argument = value;
    }

}
