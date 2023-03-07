//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.greenbutton;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * [extension] Contains attributes related to the configuration of the time service.
 * 
 * <p>TimeConfiguration complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimeConfiguration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="dstEndRule" type="{http://naesb.org/espi}DstRuleType"/>
 *         &lt;element name="dstOffset" type="{http://naesb.org/espi}TimeType"/>
 *         &lt;element name="dstStartRule" type="{http://naesb.org/espi}DstRuleType"/>
 *         &lt;element name="tzOffset" type="{http://naesb.org/espi}TimeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeConfiguration", propOrder = {
    "dstEndRule",
    "dstOffset",
    "dstStartRule",
    "tzOffset"
})
public class TimeConfiguration
    extends IdentifiedObject
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] dstEndRule;
    protected long dstOffset;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] dstStartRule;
    protected long tzOffset;

    /**
     * dstEndRule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDstEndRule() {
        return dstEndRule;
    }

    /**
     * dstEndRule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstEndRule(byte[] value) {
        this.dstEndRule = value;
    }

    /**
     * dstOffset 속성의 값을 가져옵니다.
     * 
     */
    public long getDstOffset() {
        return dstOffset;
    }

    /**
     * dstOffset 속성의 값을 설정합니다.
     * 
     */
    public void setDstOffset(long value) {
        this.dstOffset = value;
    }

    /**
     * dstStartRule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDstStartRule() {
        return dstStartRule;
    }

    /**
     * dstStartRule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstStartRule(byte[] value) {
        this.dstStartRule = value;
    }

    /**
     * tzOffset 속성의 값을 가져옵니다.
     * 
     */
    public long getTzOffset() {
        return tzOffset;
    }

    /**
     * tzOffset 속성의 값을 설정합니다.
     * 
     */
    public void setTzOffset(long value) {
        this.tzOffset = value;
    }

}
