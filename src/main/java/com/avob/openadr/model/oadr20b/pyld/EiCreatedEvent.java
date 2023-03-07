//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.pyld;

import com.avob.openadr.model.oadr20b.ei.EiResponseType;
import com.avob.openadr.model.oadr20b.ei.EventResponses;

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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiResponse"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventResponses" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID"/>
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
    "eiResponse",
    "eventResponses",
    "venID"
})
@XmlRootElement(name = "eiCreatedEvent")
public class EiCreatedEvent {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiResponseType eiResponse;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EventResponses eventResponses;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String venID;

    /**
     * eiResponse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiResponseType }
     *     
     */
    public EiResponseType getEiResponse() {
        return eiResponse;
    }

    /**
     * eiResponse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiResponseType }
     *     
     */
    public void setEiResponse(EiResponseType value) {
        this.eiResponse = value;
    }

    /**
     * eventResponses 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EventResponses }
     *     
     */
    public EventResponses getEventResponses() {
        return eventResponses;
    }

    /**
     * eventResponses 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResponses }
     *     
     */
    public void setEventResponses(EventResponses value) {
        this.eventResponses = value;
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

}
