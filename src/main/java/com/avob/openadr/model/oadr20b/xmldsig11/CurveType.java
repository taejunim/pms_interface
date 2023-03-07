//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xmldsig11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurveType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CurveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;element name="B" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", propOrder = {
    "a",
    "b"
})
public class CurveType {

    @XmlElement(name = "A", required = true)
    protected byte[] a;
    @XmlElement(name = "B", required = true)
    protected byte[] b;

    /**
     * a 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getA() {
        return a;
    }

    /**
     * a 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setA(byte[] value) {
        this.a = value;
    }

    /**
     * b 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getB() {
        return b;
    }

    /**
     * b 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setB(byte[] value) {
        this.b = value;
    }

}
