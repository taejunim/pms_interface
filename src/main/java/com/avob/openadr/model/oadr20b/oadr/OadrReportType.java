//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.strm.StreamBaseType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

/**
 * eiReport is a Stream of [measurements] recorded over time and delivered to the requestor periodically. The readings may be actual, computed, summed if derived in some other manner.
 * 
 * <p>oadrReportType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiReportID" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrReportDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportRequestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifierID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportName" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportType", propOrder = {
    "eiReportID",
    "oadrReportDescription",
    "reportRequestID",
    "reportSpecifierID",
    "reportName",
    "createdDateTime"
})
public class OadrReportType
    extends StreamBaseType
{

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String eiReportID;
    protected List<OadrReportDescriptionType> oadrReportDescription;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportRequestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportSpecifierID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String reportName;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;

    /**
     * reference ID to this report.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEiReportID() {
        return eiReportID;
    }

    /**
     * eiReportID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEiReportID(String value) {
        this.eiReportID = value;
    }

    /**
     * Define data points the implementation is capable of reporting on. Only used in Metadata report Gets the value of the oadrReportDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrReportDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrReportDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrReportDescriptionType }
     * 
     * 
     */
    public List<OadrReportDescriptionType> getOadrReportDescription() {
        if (oadrReportDescription == null) {
            oadrReportDescription = new ArrayList<OadrReportDescriptionType>();
        }
        return this.oadrReportDescription;
    }

    /**
     * Reference to the oadrCreateReport request that defined this report.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRequestID() {
        return reportRequestID;
    }

    /**
     * reportRequestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRequestID(String value) {
        this.reportRequestID = value;
    }

    /**
     * Reference to Metadata report from which this report was derived.
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
     * Name possibly for use in a user interface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * reportName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * createdDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * createdDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

}
