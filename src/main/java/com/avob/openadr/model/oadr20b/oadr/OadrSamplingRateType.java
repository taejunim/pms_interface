//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>oadrSamplingRateType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrSamplingRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrMinPeriod" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType"/>
 *         &lt;element name="oadrMaxPeriod" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType"/>
 *         &lt;element name="oadrOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrSamplingRateType", propOrder = {
    "oadrMinPeriod",
    "oadrMaxPeriod",
    "oadrOnChange"
})
public class OadrSamplingRateType {

    @XmlElement(required = true)
    protected String oadrMinPeriod;
    @XmlElement(required = true)
    protected String oadrMaxPeriod;
    protected boolean oadrOnChange;

    /**
     * oadrMinPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrMinPeriod() {
        return oadrMinPeriod;
    }

    /**
     * oadrMinPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrMinPeriod(String value) {
        this.oadrMinPeriod = value;
    }

    /**
     * oadrMaxPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrMaxPeriod() {
        return oadrMaxPeriod;
    }

    /**
     * oadrMaxPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrMaxPeriod(String value) {
        this.oadrMaxPeriod = value;
    }

    /**
     * oadrOnChange 속성의 값을 가져옵니다.
     * 
     */
    public boolean isOadrOnChange() {
        return oadrOnChange;
    }

    /**
     * oadrOnChange 속성의 값을 설정합니다.
     * 
     */
    public void setOadrOnChange(boolean value) {
        this.oadrOnChange = value;
    }

}
