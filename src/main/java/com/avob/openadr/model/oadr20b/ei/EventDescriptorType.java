//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>eventDescriptorType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="eventDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationNumber"/>
 *         &lt;element name="modificationDateTime" type="{urn:ietf:params:xml:ns:icalendar-2.0}DateTimeType" minOccurs="0"/>
 *         &lt;element name="modificationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="eiMarketContext">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventStatus"/>
 *         &lt;element name="testEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vtnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventDescriptorType", propOrder = {
    "eventID",
    "modificationNumber",
    "modificationDateTime",
    "modificationReason",
    "priority",
    "eiMarketContext",
    "createdDateTime",
    "eventStatus",
    "testEvent",
    "vtnComment"
})
public class EventDescriptorType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String eventID;
    @XmlSchemaType(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "unsignedInt")
    protected long modificationNumber;
    @XmlSchemaType(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "dateTime")
    protected XMLGregorianCalendar modificationDateTime;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String modificationReason;
    @XmlSchemaType(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "unsignedInt")
    protected Long priority;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiMarketContext eiMarketContext;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    @XmlSchemaType(name = "token")
    protected EventStatusEnumeratedType eventStatus;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String testEvent;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String vtnComment;

    /**
     * eventID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * eventID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * modificationNumber 속성의 값을 가져옵니다.
     * 
     */
    public long getModificationNumber() {
        return modificationNumber;
    }

    /**
     * modificationNumber 속성의 값을 설정합니다.
     * 
     */
    public void setModificationNumber(long value) {
        this.modificationNumber = value;
    }

    /**
     * modificationDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDateTime() {
        return modificationDateTime;
    }

    /**
     * modificationDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDateTime(XMLGregorianCalendar value) {
        this.modificationDateTime = value;
    }

    /**
     * modificationReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * modificationReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
    }

    /**
     * priority 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * priority 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * eiMarketContext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiMarketContext }
     *     
     */
    public EiMarketContext getEiMarketContext() {
        return eiMarketContext;
    }

    /**
     * eiMarketContext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiMarketContext }
     *     
     */
    public void setEiMarketContext(EiMarketContext value) {
        this.eiMarketContext = value;
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
     * An indication of the event state: far, near, active, canceled, completed
     * 
     * @return
     *     possible object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    public EventStatusEnumeratedType getEventStatus() {
        return eventStatus;
    }

    /**
     * eventStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusEnumeratedType }
     *     
     */
    public void setEventStatus(EventStatusEnumeratedType value) {
        this.eventStatus = value;
    }

    /**
     * testEvent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEvent() {
        return testEvent;
    }

    /**
     * testEvent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEvent(String value) {
        this.testEvent = value;
    }

    /**
     * vtnComment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtnComment() {
        return vtnComment;
    }

    /**
     * vtnComment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnComment(String value) {
        this.vtnComment = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marketContext"
    })
    public static class EiMarketContext {

        @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String marketContext;

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

    }

}
