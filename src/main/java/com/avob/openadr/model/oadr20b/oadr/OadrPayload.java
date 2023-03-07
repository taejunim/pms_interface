//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.xmldsig.SignatureType;

import javax.xml.bind.annotation.*;

/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrSignedObject"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signature",
    "oadrSignedObject"
})
@XmlRootElement(name = "oadrPayload")
public class OadrPayload {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElement(required = true)
    protected OadrSignedObject oadrSignedObject;

    /**
     * signature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * signature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * oadrSignedObject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrSignedObject }
     *     
     */
    public OadrSignedObject getOadrSignedObject() {
        return oadrSignedObject;
    }

    /**
     * oadrSignedObject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrSignedObject }
     *     
     */
    public void setOadrSignedObject(OadrSignedObject value) {
        this.oadrSignedObject = value;
    }

}
