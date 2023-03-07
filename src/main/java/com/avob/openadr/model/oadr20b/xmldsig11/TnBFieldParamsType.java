//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xmldsig11;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>TnBFieldParamsType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TnBFieldParamsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType">
 *       &lt;sequence>
 *         &lt;element name="K" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TnBFieldParamsType", propOrder = {
    "k"
})
public class TnBFieldParamsType
    extends CharTwoFieldParamsType
{

    @XmlElement(name = "K", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k;

    /**
     * k 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK() {
        return k;
    }

    /**
     * k 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK(BigInteger value) {
        this.k = value;
    }

}
