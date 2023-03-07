//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.power;

import com.avob.openadr.model.oadr20b.emix.ItemBaseType;

import javax.xml.bind.annotation.*;

/**
 * Base for the measurement of Power
 * 
 * <p>PowerItemType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PowerItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}ItemBaseType">
 *       &lt;sequence>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/siscale}siScaleCode"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}powerAttributes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerItemType", propOrder = {
    "itemDescription",
    "itemUnits",
    "siScaleCode",
    "powerAttributes"
})
@XmlSeeAlso({
    PowerApparentType.class,
    PowerRealType.class,
    PowerReactiveType.class
})
public abstract class PowerItemType
    extends ItemBaseType
{

    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected String itemUnits;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/siscale", required = true)
    protected String siScaleCode;
    @XmlElement(required = true)
    protected PowerAttributesType powerAttributes;

    /**
     * itemDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * itemUnits 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnits() {
        return itemUnits;
    }

    /**
     * itemUnits 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnits(String value) {
        this.itemUnits = value;
    }

    /**
     * siScaleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiScaleCode() {
        return siScaleCode;
    }

    /**
     * siScaleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiScaleCode(String value) {
        this.siScaleCode = value;
    }

    /**
     * powerAttributes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PowerAttributesType }
     *     
     */
    public PowerAttributesType getPowerAttributes() {
        return powerAttributes;
    }

    /**
     * powerAttributes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerAttributesType }
     *     
     */
    public void setPowerAttributes(PowerAttributesType value) {
        this.powerAttributes = value;
    }

}
