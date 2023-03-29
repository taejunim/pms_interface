//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.emix.ItemBaseType;
import com.avob.openadr.model.oadr20b.oadr.*;
import com.avob.openadr.model.oadr20b.power.*;
import com.avob.openadr.model.oadr20b.strm.Intervals;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>eiEventSignalType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="eiEventSignalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}intervals"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}signalName"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}signalType"/>
 *         &lt;element name="signalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}itemBase" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}currentValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiEventSignalType", propOrder = {
    "intervals",
    "eiTarget",
    "signalName",
    "signalType",
    "signalID",
    "itemBase",
    "currentValue"
})
public class EiEventSignalType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", required = true)
    protected Intervals intervals;
    protected EiTargetType eiTarget;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String signalName;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    @XmlSchemaType(name = "token")
    protected SignalTypeEnumeratedType signalType;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String signalID;
    @XmlElementRef(name = "itemBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ItemBaseType> itemBase;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected CurrentValueType currentValue;

    /**
     * intervals 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Intervals }
     *     
     */
    public Intervals getIntervals() {
        return intervals;
    }

    /**
     * intervals 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Intervals }
     *     
     */
    public void setIntervals(Intervals value) {
        this.intervals = value;
    }

    /**
     * Optionally identifies the device class associated with the signal. Only the endDeviceAsset subelement is used
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

    /**
     * Descriptive name for signal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalName() {
        return signalName;
    }

    /**
     * signalName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalName(String value) {
        this.signalName = value;
    }

    /**
     * signalType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SignalTypeEnumeratedType }
     *     
     */
    public SignalTypeEnumeratedType getSignalType() {
        return signalType;
    }

    /**
     * signalType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalTypeEnumeratedType }
     *     
     */
    public void setSignalType(SignalTypeEnumeratedType value) {
        this.signalType = value;
    }

    /**
     * signalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalID() {
        return signalID;
    }

    /**
     * signalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalID(String value) {
        this.signalID = value;
    }

    /**
     * This is the unit of the signal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     
     */
    public JAXBElement<? extends ItemBaseType> getItemBase() {
        return itemBase;
    }

    /**
     * itemBase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     
     */
    public void setItemBase(JAXBElement<? extends ItemBaseType> value) {
        this.itemBase = value;
    }

    /**
     * currentValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurrentValueType }
     *     
     */
    public CurrentValueType getCurrentValue() {
        return currentValue;
    }

    /**
     * currentValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentValueType }
     *     
     */
    public void setCurrentValue(CurrentValueType value) {
        this.currentValue = value;
    }

}
