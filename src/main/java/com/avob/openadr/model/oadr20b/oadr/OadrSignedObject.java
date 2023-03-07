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
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrDistributeEvent"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreatedEvent"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrRequestEvent"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrResponse"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCancelOpt"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCanceledOpt"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreateOpt"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreatedOpt"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCancelReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCanceledReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreateReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreatedReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrRegisterReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrRegisteredReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrUpdateReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrUpdatedReport"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCancelPartyRegistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCanceledPartyRegistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreatePartyRegistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrCreatedPartyRegistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrRequestReregistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrQueryRegistration"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrPoll"/>
 *       &lt;/choice>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oadrDistributeEvent",
    "oadrCreatedEvent",
    "oadrRequestEvent",
    "oadrResponse",
    "oadrCancelOpt",
    "oadrCanceledOpt",
    "oadrCreateOpt",
    "oadrCreatedOpt",
    "oadrCancelReport",
    "oadrCanceledReport",
    "oadrCreateReport",
    "oadrCreatedReport",
    "oadrRegisterReport",
    "oadrRegisteredReport",
    "oadrUpdateReport",
    "oadrUpdatedReport",
    "oadrCancelPartyRegistration",
    "oadrCanceledPartyRegistration",
    "oadrCreatePartyRegistration",
    "oadrCreatedPartyRegistration",
    "oadrRequestReregistration",
    "oadrQueryRegistration",
    "oadrPoll"
})
@XmlRootElement(name = "oadrSignedObject")
public class OadrSignedObject {

    protected OadrDistributeEventType oadrDistributeEvent;
    protected OadrCreatedEventType oadrCreatedEvent;
    protected OadrRequestEventType oadrRequestEvent;
    protected OadrResponseType oadrResponse;
    protected OadrCancelOptType oadrCancelOpt;
    protected OadrCanceledOptType oadrCanceledOpt;
    protected OadrCreateOptType oadrCreateOpt;
    protected OadrCreatedOptType oadrCreatedOpt;
    protected OadrCancelReportType oadrCancelReport;
    protected OadrCanceledReportType oadrCanceledReport;
    protected OadrCreateReportType oadrCreateReport;
    protected OadrCreatedReportType oadrCreatedReport;
    protected OadrRegisterReportType oadrRegisterReport;
    protected OadrRegisteredReportType oadrRegisteredReport;
    protected OadrUpdateReportType oadrUpdateReport;
    protected OadrUpdatedReportType oadrUpdatedReport;
    protected OadrCancelPartyRegistrationType oadrCancelPartyRegistration;
    protected OadrCanceledPartyRegistrationType oadrCanceledPartyRegistration;
    protected OadrCreatePartyRegistrationType oadrCreatePartyRegistration;
    protected OadrCreatedPartyRegistrationType oadrCreatedPartyRegistration;
    protected OadrRequestReregistrationType oadrRequestReregistration;
    protected OadrQueryRegistrationType oadrQueryRegistration;
    protected OadrPollType oadrPoll;
    @XmlAttribute(name = "Id", namespace = "http://openadr.org/oadr-2.0b/2012/07")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * oadrDistributeEvent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrDistributeEventType }
     *     
     */
    public OadrDistributeEventType getOadrDistributeEvent() {
        return oadrDistributeEvent;
    }

    /**
     * oadrDistributeEvent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrDistributeEventType }
     *     
     */
    public void setOadrDistributeEvent(OadrDistributeEventType value) {
        this.oadrDistributeEvent = value;
    }

    /**
     * oadrCreatedEvent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreatedEventType }
     *     
     */
    public OadrCreatedEventType getOadrCreatedEvent() {
        return oadrCreatedEvent;
    }

    /**
     * oadrCreatedEvent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreatedEventType }
     *     
     */
    public void setOadrCreatedEvent(OadrCreatedEventType value) {
        this.oadrCreatedEvent = value;
    }

    /**
     * oadrRequestEvent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrRequestEventType }
     *     
     */
    public OadrRequestEventType getOadrRequestEvent() {
        return oadrRequestEvent;
    }

    /**
     * oadrRequestEvent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrRequestEventType }
     *     
     */
    public void setOadrRequestEvent(OadrRequestEventType value) {
        this.oadrRequestEvent = value;
    }

    /**
     * oadrResponse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrResponseType }
     *     
     */
    public OadrResponseType getOadrResponse() {
        return oadrResponse;
    }

    /**
     * oadrResponse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrResponseType }
     *     
     */
    public void setOadrResponse(OadrResponseType value) {
        this.oadrResponse = value;
    }

    /**
     * oadrCancelOpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCancelOptType }
     *     
     */
    public OadrCancelOptType getOadrCancelOpt() {
        return oadrCancelOpt;
    }

    /**
     * oadrCancelOpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCancelOptType }
     *     
     */
    public void setOadrCancelOpt(OadrCancelOptType value) {
        this.oadrCancelOpt = value;
    }

    /**
     * oadrCanceledOpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCanceledOptType }
     *     
     */
    public OadrCanceledOptType getOadrCanceledOpt() {
        return oadrCanceledOpt;
    }

    /**
     * oadrCanceledOpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCanceledOptType }
     *     
     */
    public void setOadrCanceledOpt(OadrCanceledOptType value) {
        this.oadrCanceledOpt = value;
    }

    /**
     * oadrCreateOpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreateOptType }
     *     
     */
    public OadrCreateOptType getOadrCreateOpt() {
        return oadrCreateOpt;
    }

    /**
     * oadrCreateOpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreateOptType }
     *     
     */
    public void setOadrCreateOpt(OadrCreateOptType value) {
        this.oadrCreateOpt = value;
    }

    /**
     * oadrCreatedOpt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreatedOptType }
     *     
     */
    public OadrCreatedOptType getOadrCreatedOpt() {
        return oadrCreatedOpt;
    }

    /**
     * oadrCreatedOpt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreatedOptType }
     *     
     */
    public void setOadrCreatedOpt(OadrCreatedOptType value) {
        this.oadrCreatedOpt = value;
    }

    /**
     * oadrCancelReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCancelReportType }
     *     
     */
    public OadrCancelReportType getOadrCancelReport() {
        return oadrCancelReport;
    }

    /**
     * oadrCancelReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCancelReportType }
     *     
     */
    public void setOadrCancelReport(OadrCancelReportType value) {
        this.oadrCancelReport = value;
    }

    /**
     * oadrCanceledReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCanceledReportType }
     *     
     */
    public OadrCanceledReportType getOadrCanceledReport() {
        return oadrCanceledReport;
    }

    /**
     * oadrCanceledReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCanceledReportType }
     *     
     */
    public void setOadrCanceledReport(OadrCanceledReportType value) {
        this.oadrCanceledReport = value;
    }

    /**
     * oadrCreateReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreateReportType }
     *     
     */
    public OadrCreateReportType getOadrCreateReport() {
        return oadrCreateReport;
    }

    /**
     * oadrCreateReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreateReportType }
     *     
     */
    public void setOadrCreateReport(OadrCreateReportType value) {
        this.oadrCreateReport = value;
    }

    /**
     * oadrCreatedReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreatedReportType }
     *     
     */
    public OadrCreatedReportType getOadrCreatedReport() {
        return oadrCreatedReport;
    }

    /**
     * oadrCreatedReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreatedReportType }
     *     
     */
    public void setOadrCreatedReport(OadrCreatedReportType value) {
        this.oadrCreatedReport = value;
    }

    /**
     * oadrRegisterReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrRegisterReportType }
     *     
     */
    public OadrRegisterReportType getOadrRegisterReport() {
        return oadrRegisterReport;
    }

    /**
     * oadrRegisterReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrRegisterReportType }
     *     
     */
    public void setOadrRegisterReport(OadrRegisterReportType value) {
        this.oadrRegisterReport = value;
    }

    /**
     * oadrRegisteredReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrRegisteredReportType }
     *     
     */
    public OadrRegisteredReportType getOadrRegisteredReport() {
        return oadrRegisteredReport;
    }

    /**
     * oadrRegisteredReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrRegisteredReportType }
     *     
     */
    public void setOadrRegisteredReport(OadrRegisteredReportType value) {
        this.oadrRegisteredReport = value;
    }

    /**
     * oadrUpdateReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrUpdateReportType }
     *     
     */
    public OadrUpdateReportType getOadrUpdateReport() {
        return oadrUpdateReport;
    }

    /**
     * oadrUpdateReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrUpdateReportType }
     *     
     */
    public void setOadrUpdateReport(OadrUpdateReportType value) {
        this.oadrUpdateReport = value;
    }

    /**
     * oadrUpdatedReport 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrUpdatedReportType }
     *     
     */
    public OadrUpdatedReportType getOadrUpdatedReport() {
        return oadrUpdatedReport;
    }

    /**
     * oadrUpdatedReport 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrUpdatedReportType }
     *     
     */
    public void setOadrUpdatedReport(OadrUpdatedReportType value) {
        this.oadrUpdatedReport = value;
    }

    /**
     * oadrCancelPartyRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCancelPartyRegistrationType }
     *     
     */
    public OadrCancelPartyRegistrationType getOadrCancelPartyRegistration() {
        return oadrCancelPartyRegistration;
    }

    /**
     * oadrCancelPartyRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCancelPartyRegistrationType }
     *     
     */
    public void setOadrCancelPartyRegistration(OadrCancelPartyRegistrationType value) {
        this.oadrCancelPartyRegistration = value;
    }

    /**
     * oadrCanceledPartyRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCanceledPartyRegistrationType }
     *     
     */
    public OadrCanceledPartyRegistrationType getOadrCanceledPartyRegistration() {
        return oadrCanceledPartyRegistration;
    }

    /**
     * oadrCanceledPartyRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCanceledPartyRegistrationType }
     *     
     */
    public void setOadrCanceledPartyRegistration(OadrCanceledPartyRegistrationType value) {
        this.oadrCanceledPartyRegistration = value;
    }

    /**
     * oadrCreatePartyRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreatePartyRegistrationType }
     *     
     */
    public OadrCreatePartyRegistrationType getOadrCreatePartyRegistration() {
        return oadrCreatePartyRegistration;
    }

    /**
     * oadrCreatePartyRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreatePartyRegistrationType }
     *     
     */
    public void setOadrCreatePartyRegistration(OadrCreatePartyRegistrationType value) {
        this.oadrCreatePartyRegistration = value;
    }

    /**
     * oadrCreatedPartyRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrCreatedPartyRegistrationType }
     *     
     */
    public OadrCreatedPartyRegistrationType getOadrCreatedPartyRegistration() {
        return oadrCreatedPartyRegistration;
    }

    /**
     * oadrCreatedPartyRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrCreatedPartyRegistrationType }
     *     
     */
    public void setOadrCreatedPartyRegistration(OadrCreatedPartyRegistrationType value) {
        this.oadrCreatedPartyRegistration = value;
    }

    /**
     * oadrRequestReregistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrRequestReregistrationType }
     *     
     */
    public OadrRequestReregistrationType getOadrRequestReregistration() {
        return oadrRequestReregistration;
    }

    /**
     * oadrRequestReregistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrRequestReregistrationType }
     *     
     */
    public void setOadrRequestReregistration(OadrRequestReregistrationType value) {
        this.oadrRequestReregistration = value;
    }

    /**
     * oadrQueryRegistration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrQueryRegistrationType }
     *     
     */
    public OadrQueryRegistrationType getOadrQueryRegistration() {
        return oadrQueryRegistration;
    }

    /**
     * oadrQueryRegistration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrQueryRegistrationType }
     *     
     */
    public void setOadrQueryRegistration(OadrQueryRegistrationType value) {
        this.oadrQueryRegistration = value;
    }

    /**
     * oadrPoll 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrPollType }
     *     
     */
    public OadrPollType getOadrPoll() {
        return oadrPoll;
    }

    /**
     * oadrPoll 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrPollType }
     *     
     */
    public void setOadrPoll(OadrPollType value) {
        this.oadrPoll = value;
    }

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
