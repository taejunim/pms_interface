//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="eventResponse" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseCode"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseDescription" minOccurs="0"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID"/>
 *                   &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "eventResponse"
})
@XmlRootElement(name = "eventResponses")
public class EventResponses {

    protected List<EventResponse> eventResponse;

    /**
     * Gets the value of the eventResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventResponse }
     * 
     * 
     */
    public List<EventResponse> getEventResponse() {
        if (eventResponse == null) {
            eventResponse = new ArrayList<EventResponse>();
        }
        return this.eventResponse;
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
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseCode"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseDescription" minOccurs="0"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID"/>
     *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
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
        "responseCode",
        "responseDescription",
        "requestID",
        "qualifiedEventID",
        "optType"
    })
    public static class EventResponse {

        @XmlElement(required = true)
        protected String responseCode;
        protected String responseDescription;
        @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
        protected String requestID;
        @XmlElement(required = true)
        protected QualifiedEventIDType qualifiedEventID;
        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected OptTypeType optType;

        /**
         * responseCode 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseCode() {
            return responseCode;
        }

        /**
         * responseCode 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseCode(String value) {
            this.responseCode = value;
        }

        /**
         * responseDescription 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseDescription() {
            return responseDescription;
        }

        /**
         * responseDescription 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseDescription(String value) {
            this.responseDescription = value;
        }

        /**
         * requestID 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestID() {
            return requestID;
        }

        /**
         * requestID 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

        /**
         * qualifiedEventID 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedEventIDType }
         *     
         */
        public QualifiedEventIDType getQualifiedEventID() {
            return qualifiedEventID;
        }

        /**
         * qualifiedEventID 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedEventIDType }
         *     
         */
        public void setQualifiedEventID(QualifiedEventIDType value) {
            this.qualifiedEventID = value;
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

    }

}
