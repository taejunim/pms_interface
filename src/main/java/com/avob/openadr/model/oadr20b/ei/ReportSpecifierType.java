//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.xcal.DurationPropType;
import com.avob.openadr.model.oadr20b.xcal.WsCalendarIntervalType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Parameters that define the content of a Report Stream
 * 
 * <p>ReportSpecifierType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ReportSpecifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifierID"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}granularity"/>
 *         &lt;element name="reportBackDuration" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *         &lt;element name="reportInterval" type="{urn:ietf:params:xml:ns:icalendar-2.0}WsCalendarIntervalType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}specifierPayload" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecifierType", propOrder = {
    "reportSpecifierID",
    "granularity",
    "reportBackDuration",
    "reportInterval",
    "specifierPayload"
})
public class ReportSpecifierType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportSpecifierID;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected DurationPropType granularity;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected DurationPropType reportBackDuration;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected WsCalendarIntervalType reportInterval;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected List<SpecifierPayloadType> specifierPayload;

    /**
     * reportSpecifierID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSpecifierID() {
        return reportSpecifierID;
    }

    /**
     * reportSpecifierID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSpecifierID(String value) {
        this.reportSpecifierID = value;
    }

    /**
     * How frequently the [measurement] is to be recorded.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getGranularity() {
        return granularity;
    }

    /**
     * granularity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setGranularity(DurationPropType value) {
        this.granularity = value;
    }

    /**
     * reportBackDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getReportBackDuration() {
        return reportBackDuration;
    }

    /**
     * reportBackDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setReportBackDuration(DurationPropType value) {
        this.reportBackDuration = value;
    }

    /**
     * reportInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WsCalendarIntervalType }
     *     
     */
    public WsCalendarIntervalType getReportInterval() {
        return reportInterval;
    }

    /**
     * reportInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCalendarIntervalType }
     *     
     */
    public void setReportInterval(WsCalendarIntervalType value) {
        this.reportInterval = value;
    }

    /**
     * Gets the value of the specifierPayload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifierPayload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifierPayload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifierPayloadType }
     * 
     * 
     */
    public List<SpecifierPayloadType> getSpecifierPayload() {
        if (specifierPayload == null) {
            specifierPayload = new ArrayList<SpecifierPayloadType>();
        }
        return this.specifierPayload;
    }

}
