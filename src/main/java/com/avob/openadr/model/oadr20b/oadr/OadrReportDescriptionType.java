//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.ei.EiTargetType;
import com.avob.openadr.model.oadr20b.emix.ItemBaseType;
import com.avob.openadr.model.oadr20b.power.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * Describes the subject and attributes of a report.
 * 
 * <p>oadrReportDescriptionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrReportDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}rID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSubject" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportDataSource" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}itemBase" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}readingType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrSamplingRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrReportDescriptionType", propOrder = {
    "rid",
    "reportSubject",
    "reportDataSource",
    "reportType",
    "itemBase",
    "readingType",
    "marketContext",
    "oadrSamplingRate"
})
public class OadrReportDescriptionType {

    @XmlElement(name = "rID", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String rid;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiTargetType reportSubject;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected EiTargetType reportDataSource;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String reportType;
    @XmlElementRef(name = "itemBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ItemBaseType> itemBase;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String readingType;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    @XmlSchemaType(name = "anyURI")
    protected String marketContext;
    protected OadrSamplingRateType oadrSamplingRate;

    /**
     * rid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRID() {
        return rid;
    }

    /**
     * rid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRID(String value) {
        this.rid = value;
    }

    /**
     * reportSubject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getReportSubject() {
        return reportSubject;
    }

    /**
     * reportSubject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setReportSubject(EiTargetType value) {
        this.reportSubject = value;
    }

    /**
     * reportDataSource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getReportDataSource() {
        return reportDataSource;
    }

    /**
     * reportDataSource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setReportDataSource(EiTargetType value) {
        this.reportDataSource = value;
    }

    /**
     * reportType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * reportType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * What is measured or tracked in this report (Units). 
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     
     */
    public JAXBElement<? extends ItemBaseType> getItemBase() {
        return itemBase;
    }

    /**
     * itemBase 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ThermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     
     */
    public void setItemBase(JAXBElement<? extends ItemBaseType> value) {
        this.itemBase = value;
    }

    /**
     * readingType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingType() {
        return readingType;
    }

    /**
     * readingType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingType(String value) {
        this.readingType = value;
    }

    /**
     * marketContext 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * marketContext 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

    /**
     * oadrSamplingRate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrSamplingRateType }
     *     
     */
    public OadrSamplingRateType getOadrSamplingRate() {
        return oadrSamplingRate;
    }

    /**
     * oadrSamplingRate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrSamplingRateType }
     *     
     */
    public void setOadrSamplingRate(OadrSamplingRateType value) {
        this.oadrSamplingRate = value;
    }

}
