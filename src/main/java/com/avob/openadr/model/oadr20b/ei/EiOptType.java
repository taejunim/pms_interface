//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.oadr.OadrCreateOptType;
import com.avob.openadr.model.oadr20b.xcal.VavailabilityType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Opts are used by the VEN to temporarily override the pre-existing agreement. For example, a VEN may opt in to events during the evening, or opt out from events during the world series.
 * 
 * <p>EiOptType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EiOptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optReason"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}vavailability" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://docs.oasis-open.org/ns/energyinterop/201110}schemaVersion"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiOptType", propOrder = {
    "optID",
    "optType",
    "optReason",
    "marketContext",
    "venID",
    "vavailability",
    "createdDateTime"
})
@XmlSeeAlso({
    OadrCreateOptType.class
})
public class EiOptType {

    @XmlElement(required = true)
    protected String optID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected OptTypeType optType;
    @XmlElement(required = true)
    protected String optReason;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    @XmlSchemaType(name = "anyURI")
    protected String marketContext;
    @XmlElement(required = true)
    protected String venID;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected VavailabilityType vavailability;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * optID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptID() {
        return optID;
    }

    /**
     * optID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptID(String value) {
        this.optID = value;
    }

    /**
     * optType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OptTypeType }
     *     
     */
    public OptTypeType getOptType() {
        return optType;
    }

    /**
     * optType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OptTypeType }
     *     
     */
    public void setOptType(OptTypeType value) {
        this.optType = value;
    }

    /**
     * optReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptReason() {
        return optReason;
    }

    /**
     * optReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptReason(String value) {
        this.optReason = value;
    }

    /**
     * marketContext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * marketContext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

    /**
     * venID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenID() {
        return venID;
    }

    /**
     * venID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenID(String value) {
        this.venID = value;
    }

    /**
     * vavailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VavailabilityType }
     *     
     */
    public VavailabilityType getVavailability() {
        return vavailability;
    }

    /**
     * vavailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VavailabilityType }
     *     
     */
    public void setVavailability(VavailabilityType value) {
        this.vavailability = value;
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

    /**
     * schemaVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * schemaVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
