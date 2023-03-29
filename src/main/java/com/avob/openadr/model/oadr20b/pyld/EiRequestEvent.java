//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.pyld;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}replyLimit" minOccurs="0"/>
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
    "requestID",
    "venID",
    "replyLimit"
})
@XmlRootElement(name = "eiRequestEvent")
public class EiRequestEvent {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String venID;
    @XmlSchemaType(name = "unsignedInt")
    protected Long replyLimit;

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
     * Limit the number of events contained in the oadrDistributeEvent payload
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReplyLimit() {
        return replyLimit;
    }

    /**
     * replyLimit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReplyLimit(Long value) {
        this.replyLimit = value;
    }

}
