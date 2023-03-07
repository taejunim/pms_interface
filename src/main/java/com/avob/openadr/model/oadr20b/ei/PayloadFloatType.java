//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the payload for signals that require a quantity.
 * 
 * <p>PayloadFloatType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PayloadFloatType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}PayloadBaseType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadFloatType", propOrder = {
    "value"
})
public class PayloadFloatType
    extends PayloadBaseType
{

    protected float value;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

}
