//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.greenbutton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Summary of usage for a billing period
 * 
 * <p>ElectricPowerUsageSummary complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ElectricPowerUsageSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="billingPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="billLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="billToDate" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="costAdditionalLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="costAdditionalDetailLastPeriod" type="{http://naesb.org/espi}LineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://naesb.org/espi}Currency" minOccurs="0"/>
 *         &lt;element name="overallConsumptionLastPeriod" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentBillingPeriodOverAllConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayLastYearNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="currentDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="peakDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayLastYearOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="previousDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="qualityOfReading" type="{http://naesb.org/espi}QualityOfReading" minOccurs="0"/>
 *         &lt;element name="ratchetDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/>
 *         &lt;element name="ratchetDemandPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="statusTimeStamp" type="{http://naesb.org/espi}TimeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricPowerUsageSummary", propOrder = {
    "billingPeriod",
    "billLastPeriod",
    "billToDate",
    "costAdditionalLastPeriod",
    "costAdditionalDetailLastPeriod",
    "currency",
    "overallConsumptionLastPeriod",
    "currentBillingPeriodOverAllConsumption",
    "currentDayLastYearNetConsumption",
    "currentDayNetConsumption",
    "currentDayOverallConsumption",
    "peakDemand",
    "previousDayLastYearOverallConsumption",
    "previousDayNetConsumption",
    "previousDayOverallConsumption",
    "qualityOfReading",
    "ratchetDemand",
    "ratchetDemandPeriod",
    "statusTimeStamp"
})
public class ElectricPowerUsageSummary
    extends IdentifiedObject
{

    protected DateTimeInterval billingPeriod;
    protected Long billLastPeriod;
    protected Long billToDate;
    protected Long costAdditionalLastPeriod;
    protected List<LineItem> costAdditionalDetailLastPeriod;
    protected String currency;
    protected SummaryMeasurement overallConsumptionLastPeriod;
    protected SummaryMeasurement currentBillingPeriodOverAllConsumption;
    protected SummaryMeasurement currentDayLastYearNetConsumption;
    protected SummaryMeasurement currentDayNetConsumption;
    protected SummaryMeasurement currentDayOverallConsumption;
    protected SummaryMeasurement peakDemand;
    protected SummaryMeasurement previousDayLastYearOverallConsumption;
    protected SummaryMeasurement previousDayNetConsumption;
    protected SummaryMeasurement previousDayOverallConsumption;
    protected String qualityOfReading;
    protected SummaryMeasurement ratchetDemand;
    protected DateTimeInterval ratchetDemandPeriod;
    protected long statusTimeStamp;

    /**
     * billingPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * billingPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setBillingPeriod(DateTimeInterval value) {
        this.billingPeriod = value;
    }

    /**
     * billLastPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillLastPeriod() {
        return billLastPeriod;
    }

    /**
     * billLastPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillLastPeriod(Long value) {
        this.billLastPeriod = value;
    }

    /**
     * billToDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillToDate() {
        return billToDate;
    }

    /**
     * billToDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillToDate(Long value) {
        this.billToDate = value;
    }

    /**
     * costAdditionalLastPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostAdditionalLastPeriod() {
        return costAdditionalLastPeriod;
    }

    /**
     * costAdditionalLastPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostAdditionalLastPeriod(Long value) {
        this.costAdditionalLastPeriod = value;
    }

    /**
     * Gets the value of the costAdditionalDetailLastPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costAdditionalDetailLastPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostAdditionalDetailLastPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem }
     * 
     * 
     */
    public List<LineItem> getCostAdditionalDetailLastPeriod() {
        if (costAdditionalDetailLastPeriod == null) {
            costAdditionalDetailLastPeriod = new ArrayList<LineItem>();
        }
        return this.costAdditionalDetailLastPeriod;
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
     * overallConsumptionLastPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getOverallConsumptionLastPeriod() {
        return overallConsumptionLastPeriod;
    }

    /**
     * overallConsumptionLastPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setOverallConsumptionLastPeriod(SummaryMeasurement value) {
        this.overallConsumptionLastPeriod = value;
    }

    /**
     * currentBillingPeriodOverAllConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentBillingPeriodOverAllConsumption() {
        return currentBillingPeriodOverAllConsumption;
    }

    /**
     * currentBillingPeriodOverAllConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentBillingPeriodOverAllConsumption(SummaryMeasurement value) {
        this.currentBillingPeriodOverAllConsumption = value;
    }

    /**
     * currentDayLastYearNetConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayLastYearNetConsumption() {
        return currentDayLastYearNetConsumption;
    }

    /**
     * currentDayLastYearNetConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayLastYearNetConsumption(SummaryMeasurement value) {
        this.currentDayLastYearNetConsumption = value;
    }

    /**
     * currentDayNetConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayNetConsumption() {
        return currentDayNetConsumption;
    }

    /**
     * currentDayNetConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayNetConsumption(SummaryMeasurement value) {
        this.currentDayNetConsumption = value;
    }

    /**
     * currentDayOverallConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayOverallConsumption() {
        return currentDayOverallConsumption;
    }

    /**
     * currentDayOverallConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayOverallConsumption(SummaryMeasurement value) {
        this.currentDayOverallConsumption = value;
    }

    /**
     * peakDemand 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPeakDemand() {
        return peakDemand;
    }

    /**
     * peakDemand 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPeakDemand(SummaryMeasurement value) {
        this.peakDemand = value;
    }

    /**
     * previousDayLastYearOverallConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayLastYearOverallConsumption() {
        return previousDayLastYearOverallConsumption;
    }

    /**
     * previousDayLastYearOverallConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayLastYearOverallConsumption(SummaryMeasurement value) {
        this.previousDayLastYearOverallConsumption = value;
    }

    /**
     * previousDayNetConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayNetConsumption() {
        return previousDayNetConsumption;
    }

    /**
     * previousDayNetConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayNetConsumption(SummaryMeasurement value) {
        this.previousDayNetConsumption = value;
    }

    /**
     * previousDayOverallConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayOverallConsumption() {
        return previousDayOverallConsumption;
    }

    /**
     * previousDayOverallConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayOverallConsumption(SummaryMeasurement value) {
        this.previousDayOverallConsumption = value;
    }

    /**
     * qualityOfReading 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityOfReading() {
        return qualityOfReading;
    }

    /**
     * qualityOfReading 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityOfReading(String value) {
        this.qualityOfReading = value;
    }

    /**
     * ratchetDemand 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getRatchetDemand() {
        return ratchetDemand;
    }

    /**
     * ratchetDemand 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setRatchetDemand(SummaryMeasurement value) {
        this.ratchetDemand = value;
    }

    /**
     * ratchetDemandPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getRatchetDemandPeriod() {
        return ratchetDemandPeriod;
    }

    /**
     * ratchetDemandPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setRatchetDemandPeriod(DateTimeInterval value) {
        this.ratchetDemandPeriod = value;
    }

    /**
     * statusTimeStamp 속성의 값을 가져옵니다.
     * 
     */
    public long getStatusTimeStamp() {
        return statusTimeStamp;
    }

    /**
     * statusTimeStamp 속성의 값을 설정합니다.
     * 
     */
    public void setStatusTimeStamp(long value) {
        this.statusTimeStamp = value;
    }

}
