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
import java.util.ArrayList;
import java.util.List;


/**
 * Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.
 * 
 * <p>IntervalReading complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IntervalReading">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="cost" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="ReadingQuality" type="{http://naesb.org/espi}ReadingQuality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timePeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="value" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalReading", propOrder = {
    "cost",
    "readingQuality",
    "timePeriod",
    "value"
})
public class IntervalReading
    extends Object
{

    protected Long cost;
    @XmlElement(name = "ReadingQuality")
    protected List<ReadingQuality> readingQuality;
    protected DateTimeInterval timePeriod;
    protected Long value;

    /**
     * cost 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCost() {
        return cost;
    }

    /**
     * cost 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCost(Long value) {
        this.cost = value;
    }

    /**
     * Gets the value of the readingQuality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingQuality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingQuality }
     * 
     * 
     */
    public List<ReadingQuality> getReadingQuality() {
        if (readingQuality == null) {
            readingQuality = new ArrayList<ReadingQuality>();
        }
        return this.readingQuality;
    }

    /**
     * timePeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * timePeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setTimePeriod(DateTimeInterval value) {
        this.timePeriod = value;
    }

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValue(Long value) {
        this.value = value;
    }

}
