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
 * <p>oadrLoadControlStateTypeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrLoadControlStateTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oadrMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="oadrMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="oadrCurrent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="oadrNormal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrLoadControlStateTypeType", propOrder = {
    "oadrMin",
    "oadrMax",
    "oadrCurrent",
    "oadrNormal"
})
public class OadrLoadControlStateTypeType {

    protected Float oadrMin;
    protected Float oadrMax;
    protected float oadrCurrent;
    protected Float oadrNormal;

    /**
     * oadrMin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrMin() {
        return oadrMin;
    }

    /**
     * oadrMin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrMin(Float value) {
        this.oadrMin = value;
    }

    /**
     * oadrMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrMax() {
        return oadrMax;
    }

    /**
     * oadrMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrMax(Float value) {
        this.oadrMax = value;
    }

    /**
     * oadrCurrent 속성의 값을 가져옵니다.
     * 
     */
    public float getOadrCurrent() {
        return oadrCurrent;
    }

    /**
     * oadrCurrent 속성의 값을 설정합니다.
     * 
     */
    public void setOadrCurrent(float value) {
        this.oadrCurrent = value;
    }

    /**
     * oadrNormal 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOadrNormal() {
        return oadrNormal;
    }

    /**
     * oadrNormal 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOadrNormal(Float value) {
        this.oadrNormal = value;
    }

}
