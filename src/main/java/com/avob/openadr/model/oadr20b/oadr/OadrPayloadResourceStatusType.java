//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.ei.PayloadBaseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * This is the payload for reports that require a status.
 * 
 * <p>oadrPayloadResourceStatusType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrPayloadResourceStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}PayloadBaseType">
 *       &lt;sequence>
 *         &lt;element name="oadrOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oadrManualOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrLoadControlState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrPayloadResourceStatusType", propOrder = {
    "oadrOnline",
    "oadrManualOverride",
    "oadrLoadControlState"
})
public class OadrPayloadResourceStatusType
    extends PayloadBaseType
{

    protected boolean oadrOnline;
    protected boolean oadrManualOverride;
    protected OadrLoadControlStateType oadrLoadControlState;

    /**
     * oadrOnline 속성의 값을 가져옵니다.
     * 
     */
    public boolean isOadrOnline() {
        return oadrOnline;
    }

    /**
     * oadrOnline 속성의 값을 설정합니다.
     * 
     */
    public void setOadrOnline(boolean value) {
        this.oadrOnline = value;
    }

    /**
     * oadrManualOverride 속성의 값을 가져옵니다.
     * 
     */
    public boolean isOadrManualOverride() {
        return oadrManualOverride;
    }

    /**
     * oadrManualOverride 속성의 값을 설정합니다.
     * 
     */
    public void setOadrManualOverride(boolean value) {
        this.oadrManualOverride = value;
    }

    /**
     * oadrLoadControlState 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrLoadControlStateType }
     *     
     */
    public OadrLoadControlStateType getOadrLoadControlState() {
        return oadrLoadControlState;
    }

    /**
     * oadrLoadControlState 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrLoadControlStateType }
     *     
     */
    public void setOadrLoadControlState(OadrLoadControlStateType value) {
        this.oadrLoadControlState = value;
    }

}
