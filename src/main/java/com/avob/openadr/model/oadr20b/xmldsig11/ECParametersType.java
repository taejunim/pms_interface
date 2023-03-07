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
import java.math.BigInteger;


/**
 * <p>ECParametersType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ECParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldID" type="{http://www.w3.org/2009/xmldsig11#}FieldIDType"/>
 *         &lt;element name="Curve" type="{http://www.w3.org/2009/xmldsig11#}CurveType"/>
 *         &lt;element name="Base" type="{http://www.w3.org/2009/xmldsig11#}ECPointType"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;element name="CoFactor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ValidationData" type="{http://www.w3.org/2009/xmldsig11#}ECValidationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECParametersType", propOrder = {
    "fieldID",
    "curve",
    "base",
    "order",
    "coFactor",
    "validationData"
})
public class ECParametersType {

    @XmlElement(name = "FieldID", required = true)
    protected FieldIDType fieldID;
    @XmlElement(name = "Curve", required = true)
    protected CurveType curve;
    @XmlElement(name = "Base", required = true)
    protected byte[] base;
    @XmlElement(name = "Order", required = true)
    protected byte[] order;
    @XmlElement(name = "CoFactor")
    protected BigInteger coFactor;
    @XmlElement(name = "ValidationData")
    protected ECValidationDataType validationData;

    /**
     * fieldID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FieldIDType }
     *     
     */
    public FieldIDType getFieldID() {
        return fieldID;
    }

    /**
     * fieldID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIDType }
     *     
     */
    public void setFieldID(FieldIDType value) {
        this.fieldID = value;
    }

    /**
     * curve 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurveType }
     *     
     */
    public CurveType getCurve() {
        return curve;
    }

    /**
     * curve 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveType }
     *     
     */
    public void setCurve(CurveType value) {
        this.curve = value;
    }

    /**
     * base 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase() {
        return base;
    }

    /**
     * base 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase(byte[] value) {
        this.base = value;
    }

    /**
     * order 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrder() {
        return order;
    }

    /**
     * order 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrder(byte[] value) {
        this.order = value;
    }

    /**
     * coFactor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoFactor() {
        return coFactor;
    }

    /**
     * coFactor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoFactor(BigInteger value) {
        this.coFactor = value;
    }

    /**
     * validationData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ECValidationDataType }
     *     
     */
    public ECValidationDataType getValidationData() {
        return validationData;
    }

    /**
     * validationData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ECValidationDataType }
     *     
     */
    public void setValidationData(ECValidationDataType value) {
        this.validationData = value;
    }

}
