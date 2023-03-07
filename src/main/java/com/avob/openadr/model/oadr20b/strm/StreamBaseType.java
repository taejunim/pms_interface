//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.strm;

import com.avob.openadr.model.oadr20b.oadr.OadrReportType;
import com.avob.openadr.model.oadr20b.xcal.Dtstart;
import com.avob.openadr.model.oadr20b.xcal.DurationPropType;

import javax.xml.bind.annotation.*;

/**
 * abstract base for communication of schedules for signals and observations
 * 
 * <p>StreamBaseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="StreamBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}intervals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamBaseType", propOrder = {
    "dtstart",
    "duration",
    "intervals"
})
@XmlSeeAlso({
    OadrReportType.class
})
public abstract class StreamBaseType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Dtstart dtstart;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DurationPropType duration;
    protected Intervals intervals;

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

}
