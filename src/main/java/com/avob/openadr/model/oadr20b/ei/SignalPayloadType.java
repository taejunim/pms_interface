//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.avob.PayloadAvobVenServiceRequestType;
import com.avob.openadr.model.oadr20b.avob.PayloadKeyTokenType;
import com.avob.openadr.model.oadr20b.oadr.OadrPayloadResourceStatusType;
import com.avob.openadr.model.oadr20b.strm.StreamPayloadBaseType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>signalPayloadType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="signalPayloadType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0:stream}StreamPayloadBaseType">
 *       &lt;choice>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}payloadBase"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signalPayloadType", propOrder = {
    "payloadBase"
})
public class SignalPayloadType
    extends StreamPayloadBaseType
{

    @XmlElementRef(name = "payloadBase", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PayloadBaseType> payloadBase;

    /**
     * payloadBase 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayloadFloatType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadKeyTokenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrPayloadResourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadAvobVenServiceRequestType }{@code >}
     *     
     */
    public JAXBElement<? extends PayloadBaseType> getPayloadBase() {
        return payloadBase;
    }

    /**
     * payloadBase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayloadFloatType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadKeyTokenType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrPayloadResourceStatusType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PayloadAvobVenServiceRequestType }{@code >}
     *     
     */
    public void setPayloadBase(JAXBElement<? extends PayloadBaseType> value) {
        this.payloadBase = value;
    }

}
