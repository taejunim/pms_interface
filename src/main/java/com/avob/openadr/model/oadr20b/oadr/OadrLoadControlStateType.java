//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>oadrLoadControlStateType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrLoadControlStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrCapacity" type="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlStateTypeType" minOccurs="0"/>
 *         &lt;element name="oadrLevelOffset" type="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlStateTypeType" minOccurs="0"/>
 *         &lt;element name="oadrPercentOffset" type="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlStateTypeType" minOccurs="0"/>
 *         &lt;element name="oadrSetPoint" type="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlStateTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrLoadControlStateType", propOrder = {
    "oadrCapacity",
    "oadrLevelOffset",
    "oadrPercentOffset",
    "oadrSetPoint"
})
public class OadrLoadControlStateType {

    protected OadrLoadControlStateTypeType oadrCapacity;
    protected OadrLoadControlStateTypeType oadrLevelOffset;
    protected OadrLoadControlStateTypeType oadrPercentOffset;
    protected OadrLoadControlStateTypeType oadrSetPoint;

    /**
     * oadrCapacity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public OadrLoadControlStateTypeType getOadrCapacity() {
        return oadrCapacity;
    }

    /**
     * oadrCapacity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public void setOadrCapacity(OadrLoadControlStateTypeType value) {
        this.oadrCapacity = value;
    }

    /**
     * oadrLevelOffset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public OadrLoadControlStateTypeType getOadrLevelOffset() {
        return oadrLevelOffset;
    }

    /**
     * oadrLevelOffset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public void setOadrLevelOffset(OadrLoadControlStateTypeType value) {
        this.oadrLevelOffset = value;
    }

    /**
     * oadrPercentOffset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public OadrLoadControlStateTypeType getOadrPercentOffset() {
        return oadrPercentOffset;
    }

    /**
     * oadrPercentOffset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public void setOadrPercentOffset(OadrLoadControlStateTypeType value) {
        this.oadrPercentOffset = value;
    }

    /**
     * oadrSetPoint 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public OadrLoadControlStateTypeType getOadrSetPoint() {
        return oadrSetPoint;
    }

    /**
     * oadrSetPoint 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlStateTypeType }
     *     
     */
    public void setOadrSetPoint(OadrLoadControlStateTypeType value) {
        this.oadrSetPoint = value;
    }

}
