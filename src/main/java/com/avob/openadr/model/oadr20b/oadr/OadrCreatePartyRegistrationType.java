//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>oadrCreatePartyRegistrationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrCreatePartyRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}registrationID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrProfileName"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportAddress" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrReportOnly"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrXmlSignature"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrVenName" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrHttpPullModel" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://docs.oasis-open.org/ns/energyinterop/201110}schemaVersion"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrCreatePartyRegistrationType", propOrder = {
    "requestID",
    "registrationID",
    "venID",
    "oadrProfileName",
    "oadrTransportName",
    "oadrTransportAddress",
    "oadrReportOnly",
    "oadrXmlSignature",
    "oadrVenName",
    "oadrHttpPullModel"
})
public class OadrCreatePartyRegistrationType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String registrationID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String venID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oadrProfileName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected OadrTransportType oadrTransportName;
    protected String oadrTransportAddress;
    protected boolean oadrReportOnly;
    protected boolean oadrXmlSignature;
    protected String oadrVenName;
    protected Boolean oadrHttpPullModel;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * requestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * requestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Used for re-registering an existing registration
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * registrationID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
    }

    /**
     * venID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenID() {
        return venID;
    }

    /**
     * venID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenID(String value) {
        this.venID = value;
    }

    /**
     * oadrProfileName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrProfileName() {
        return oadrProfileName;
    }

    /**
     * oadrProfileName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrProfileName(String value) {
        this.oadrProfileName = value;
    }

    /**
     * oadrTransportName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrTransportType }
     *     
     */
    public OadrTransportType getOadrTransportName() {
        return oadrTransportName;
    }

    /**
     * oadrTransportName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrTransportType }
     *     
     */
    public void setOadrTransportName(OadrTransportType value) {
        this.oadrTransportName = value;
    }

    /**
     * Address of this VEN. Not required if http pull model
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrTransportAddress() {
        return oadrTransportAddress;
    }

    /**
     * oadrTransportAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrTransportAddress(String value) {
        this.oadrTransportAddress = value;
    }

    /**
     * ReportOnlyDeviceFlag - True or False
     * 
     */
    public boolean isOadrReportOnly() {
        return oadrReportOnly;
    }

    /**
     * oadrReportOnly 속성의 값을 설정합니다.
     * 
     */
    public void setOadrReportOnly(boolean value) {
        this.oadrReportOnly = value;
    }

    /**
     * Implementation supports XML signatures - True or False
     * 
     */
    public boolean isOadrXmlSignature() {
        return oadrXmlSignature;
    }

    /**
     * oadrXmlSignature 속성의 값을 설정합니다.
     * 
     */
    public void setOadrXmlSignature(boolean value) {
        this.oadrXmlSignature = value;
    }

    /**
     * Human readable name for VEN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOadrVenName() {
        return oadrVenName;
    }

    /**
     * oadrVenName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOadrVenName(String value) {
        this.oadrVenName = value;
    }

    /**
     * If transport is simpleHttp indicate if VEN is operating in pull exchange model - true or false
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOadrHttpPullModel() {
        return oadrHttpPullModel;
    }

    /**
     * oadrHttpPullModel 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOadrHttpPullModel(Boolean value) {
        this.oadrHttpPullModel = value;
    }

    /**
     * schemaVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * schemaVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
