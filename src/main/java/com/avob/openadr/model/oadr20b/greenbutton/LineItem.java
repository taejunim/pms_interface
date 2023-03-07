//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.greenbutton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * [extension] Line item of detail for additional cost
 * 
 * <p>LineItem complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://naesb.org/espi}Int48"/>
 *         &lt;element name="rounding" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://naesb.org/espi}TimeType"/>
 *         &lt;element name="note" type="{http://naesb.org/espi}String256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
    "amount",
    "rounding",
    "dateTime",
    "note"
})
public class LineItem {

    protected long amount;
    protected Long rounding;
    protected long dateTime;
    @XmlElement(required = true)
    protected String note;

    /**
     * amount 속성의 값을 가져옵니다.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * amount 속성의 값을 설정합니다.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * rounding 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRounding() {
        return rounding;
    }

    /**
     * rounding 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRounding(Long value) {
        this.rounding = value;
    }

    /**
     * dateTime 속성의 값을 가져옵니다.
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * dateTime 속성의 값을 설정합니다.
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
    }

    /**
     * note 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * note 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
