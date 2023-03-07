//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>eiEventType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="eiEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventDescriptor"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiActivePeriod"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEventSignals"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventType", propOrder = {
    "eventDescriptor",
    "eiActivePeriod",
    "eiEventSignals",
    "eiTarget"
})
public class EiEventType {

    @XmlElement(required = true)
    protected EventDescriptorType eventDescriptor;
    @XmlElement(required = true)
    protected EiActivePeriodType eiActivePeriod;
    @XmlElement(required = true)
    protected EiEventSignalsType eiEventSignals;
    @XmlElement(required = true)
    protected EiTargetType eiTarget;

    /**
     * eventDescriptor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EventDescriptorType }
     *     
     */
    public EventDescriptorType getEventDescriptor() {
        return eventDescriptor;
    }

    /**
     * eventDescriptor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDescriptorType }
     *     
     */
    public void setEventDescriptor(EventDescriptorType value) {
        this.eventDescriptor = value;
    }

    /**
     * eiActivePeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiActivePeriodType }
     *     
     */
    public EiActivePeriodType getEiActivePeriod() {
        return eiActivePeriod;
    }

    /**
     * eiActivePeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiActivePeriodType }
     *     
     */
    public void setEiActivePeriod(EiActivePeriodType value) {
        this.eiActivePeriod = value;
    }

    /**
     * eiEventSignals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiEventSignalsType }
     *     
     */
    public EiEventSignalsType getEiEventSignals() {
        return eiEventSignals;
    }

    /**
     * eiEventSignals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiEventSignalsType }
     *     
     */
    public void setEiEventSignals(EiEventSignalsType value) {
        this.eiEventSignals = value;
    }

    /**
     * eiTarget 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getEiTarget() {
        return eiTarget;
    }

    /**
     * eiTarget 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setEiTarget(EiTargetType value) {
        this.eiTarget = value;
    }

}
