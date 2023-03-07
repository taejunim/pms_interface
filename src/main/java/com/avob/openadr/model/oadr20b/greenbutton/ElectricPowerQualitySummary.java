//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.greenbutton;

import javax.xml.bind.annotation.*;


/**
 * A summary of power quality events. This information represents a summary of power quality information typically required by customer facility energy management systems. It is not intended to satisfy the detailed requirements of power quality monitoring. All values are as defined by measurementProtocol during the period. The standards typically also give ranges of allowed values; the information attributes are the raw measurements, not the "yes/no" determination by the various standards. See referenced standards for definition, measurement protocol and period.
 * 
 * <p>ElectricPowerQualitySummary complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ElectricPowerQualitySummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="flickerPlt" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="flickerPst" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="harmonicVoltage" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="longInterruptions" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="mainsVoltage" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="measurementProtocol" type="{http://naesb.org/espi}UInt8" minOccurs="0"/>
 *         &lt;element name="powerFrequency" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="rapidVoltageChanges" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="shortInterruptions" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="summaryInterval" type="{http://naesb.org/espi}DateTimeInterval"/>
 *         &lt;element name="supplyVoltageDips" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="supplyVoltageImbalance" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="supplyVoltageVariations" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="tempOvervoltage" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricPowerQualitySummary", propOrder = {
    "flickerPlt",
    "flickerPst",
    "harmonicVoltage",
    "longInterruptions",
    "mainsVoltage",
    "measurementProtocol",
    "powerFrequency",
    "rapidVoltageChanges",
    "shortInterruptions",
    "summaryInterval",
    "supplyVoltageDips",
    "supplyVoltageImbalance",
    "supplyVoltageVariations",
    "tempOvervoltage"
})
public class ElectricPowerQualitySummary
    extends IdentifiedObject
{

    protected Long flickerPlt;
    protected Long flickerPst;
    protected Long harmonicVoltage;
    protected Long longInterruptions;
    protected Long mainsVoltage;
    @XmlSchemaType(name = "unsignedByte")
    protected Short measurementProtocol;
    protected Long powerFrequency;
    protected Long rapidVoltageChanges;
    protected Long shortInterruptions;
    @XmlElement(required = true)
    protected DateTimeInterval summaryInterval;
    protected Long supplyVoltageDips;
    protected Long supplyVoltageImbalance;
    protected Long supplyVoltageVariations;
    protected Long tempOvervoltage;

    /**
     * flickerPlt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlickerPlt() {
        return flickerPlt;
    }

    /**
     * flickerPlt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlickerPlt(Long value) {
        this.flickerPlt = value;
    }

    /**
     * flickerPst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlickerPst() {
        return flickerPst;
    }

    /**
     * flickerPst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlickerPst(Long value) {
        this.flickerPst = value;
    }

    /**
     * harmonicVoltage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHarmonicVoltage() {
        return harmonicVoltage;
    }

    /**
     * harmonicVoltage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHarmonicVoltage(Long value) {
        this.harmonicVoltage = value;
    }

    /**
     * longInterruptions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongInterruptions() {
        return longInterruptions;
    }

    /**
     * longInterruptions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongInterruptions(Long value) {
        this.longInterruptions = value;
    }

    /**
     * mainsVoltage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainsVoltage() {
        return mainsVoltage;
    }

    /**
     * mainsVoltage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainsVoltage(Long value) {
        this.mainsVoltage = value;
    }

    /**
     * measurementProtocol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeasurementProtocol() {
        return measurementProtocol;
    }

    /**
     * measurementProtocol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeasurementProtocol(Short value) {
        this.measurementProtocol = value;
    }

    /**
     * powerFrequency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPowerFrequency() {
        return powerFrequency;
    }

    /**
     * powerFrequency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPowerFrequency(Long value) {
        this.powerFrequency = value;
    }

    /**
     * rapidVoltageChanges 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRapidVoltageChanges() {
        return rapidVoltageChanges;
    }

    /**
     * rapidVoltageChanges 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRapidVoltageChanges(Long value) {
        this.rapidVoltageChanges = value;
    }

    /**
     * shortInterruptions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShortInterruptions() {
        return shortInterruptions;
    }

    /**
     * shortInterruptions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShortInterruptions(Long value) {
        this.shortInterruptions = value;
    }

    /**
     * summaryInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getSummaryInterval() {
        return summaryInterval;
    }

    /**
     * summaryInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setSummaryInterval(DateTimeInterval value) {
        this.summaryInterval = value;
    }

    /**
     * supplyVoltageDips 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyVoltageDips() {
        return supplyVoltageDips;
    }

    /**
     * supplyVoltageDips 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyVoltageDips(Long value) {
        this.supplyVoltageDips = value;
    }

    /**
     * supplyVoltageImbalance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyVoltageImbalance() {
        return supplyVoltageImbalance;
    }

    /**
     * supplyVoltageImbalance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyVoltageImbalance(Long value) {
        this.supplyVoltageImbalance = value;
    }

    /**
     * supplyVoltageVariations 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplyVoltageVariations() {
        return supplyVoltageVariations;
    }

    /**
     * supplyVoltageVariations 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplyVoltageVariations(Long value) {
        this.supplyVoltageVariations = value;
    }

    /**
     * tempOvervoltage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTempOvervoltage() {
        return tempOvervoltage;
    }

    /**
     * tempOvervoltage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTempOvervoltage(Long value) {
        this.tempOvervoltage = value;
    }

}
