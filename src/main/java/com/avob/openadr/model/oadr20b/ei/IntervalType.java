//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.oadr.OadrGBStreamPayloadBase;
import com.avob.openadr.model.oadr20b.oadr.OadrReportPayloadType;
import com.avob.openadr.model.oadr20b.strm.StreamPayloadBaseType;
import com.avob.openadr.model.oadr20b.xcal.Dtstart;
import com.avob.openadr.model.oadr20b.xcal.DurationPropType;
import com.avob.openadr.model.oadr20b.xcal.Uid;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>IntervalType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IntervalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uid" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}streamPayloadBase" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalType", propOrder = {
    "dtstart",
    "duration",
    "uid",
    "streamPayloadBase"
})
public class IntervalType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Dtstart dtstart;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DurationPropType duration;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Uid uid;
    @XmlElementRef(name = "streamPayloadBase", namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", type = JAXBElement.class)
    protected List<JAXBElement<? extends StreamPayloadBaseType>> streamPayloadBase;

    /**
     * dtstart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Dtstart }
     *     
     */
    public Dtstart getDtstart() {
        return dtstart;
    }

    /**
     * dtstart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Dtstart }
     *     
     */
    public void setDtstart(Dtstart value) {
        this.dtstart = value;
    }

    /**
     * duration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDuration() {
        return duration;
    }

    /**
     * duration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDuration(DurationPropType value) {
        this.duration = value;
    }

    /**
     * uid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Uid }
     *     
     */
    public Uid getUid() {
        return uid;
    }

    /**
     * uid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Uid }
     *     
     */
    public void setUid(Uid value) {
        this.uid = value;
    }

    /**
     * Gets the value of the streamPayloadBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamPayloadBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamPayloadBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OadrReportPayloadType }{@code >}
     * {@link JAXBElement }{@code <}{@link StreamPayloadBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link OadrGBStreamPayloadBase }{@code >}
     * {@link JAXBElement }{@code <}{@link SignalPayloadType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends StreamPayloadBaseType>> getStreamPayloadBase() {
        if (streamPayloadBase == null) {
            streamPayloadBase = new ArrayList<JAXBElement<? extends StreamPayloadBaseType>>();
        }
        return this.streamPayloadBase;
    }

}