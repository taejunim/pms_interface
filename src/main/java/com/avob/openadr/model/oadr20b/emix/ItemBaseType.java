//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.emix;

import com.avob.openadr.model.oadr20b.oadr.*;
import com.avob.openadr.model.oadr20b.power.EnergyItemType;
import com.avob.openadr.model.oadr20b.power.PowerItemType;
import com.avob.openadr.model.oadr20b.power.VoltageType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Abstract base type for units for EMIX Product delivery, measurement, and warrants.
 * 
 * <p>ItemBaseType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ItemBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBaseType")
@XmlSeeAlso({
    FrequencyType.class,
    CurrencyType.class,
    ThermType.class,
    BaseUnitType.class,
    OadrGBItemBase.class,
    CurrentType.class,
    TemperatureType.class,
    PulseCountType.class,
    VoltageType.class,
    EnergyItemType.class,
    PowerItemType.class
})
public abstract class ItemBaseType {


}
