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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>eiEventSignalsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="eiEventSignalsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEventSignal" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiEventBaseline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventSignalsType", propOrder = {
    "eiEventSignal",
    "eiEventBaseline"
})
public class EiEventSignalsType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected List<EiEventSignalType> eiEventSignal;
    protected EiEventBaselineType eiEventBaseline;

    /**
     * Interval data for an event Gets the value of the eiEventSignal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eiEventSignal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEiEventSignal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EiEventSignalType }
     * 
     * 
     */
    public List<EiEventSignalType> getEiEventSignal() {
        if (eiEventSignal == null) {
            eiEventSignal = new ArrayList<EiEventSignalType>();
        }
        return this.eiEventSignal;
    }

    /**
     * Interval data for a baseline
     * 
     * @return
     *     possible object is
     *     {@link EiEventBaselineType }
     *     
     */
    public EiEventBaselineType getEiEventBaseline() {
        return eiEventBaseline;
    }

    /**
     * eiEventBaseline 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiEventBaselineType }
     *     
     */
    public void setEiEventBaseline(EiEventBaselineType value) {
        this.eiEventBaseline = value;
    }

}
