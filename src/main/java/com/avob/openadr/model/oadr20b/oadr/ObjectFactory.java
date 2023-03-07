//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.ei.EiTargetType;
import com.avob.openadr.model.oadr20b.ei.PayloadBaseType;
import com.avob.openadr.model.oadr20b.xcal.DurationPropType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openadr.oadr_2_0b._2012._07 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OadrCreatedReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreatedReport");
    private final static QName _OadrCancelReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCancelReport");
    private final static QName _OadrXmlSignature_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrXmlSignature");
    private final static QName _Currency_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currency");
    private final static QName _Temperature_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "temperature");
    private final static QName _OadrCreateOpt_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreateOpt");
    private final static QName _Current_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "current");
    private final static QName _OadrLoadControlState_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrLoadControlState");
    private final static QName _OadrCreatedOpt_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreatedOpt");
    private final static QName _OadrRequestEvent_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRequestEvent");
    private final static QName _PulseFactor_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "pulseFactor");
    private final static QName _OadrCanceledReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCanceledReport");
    private final static QName _OadrDistributeEvent_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrDistributeEvent");
    private final static QName _OadrRegisterReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRegisterReport");
    private final static QName _PulseCount_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "pulseCount");
    private final static QName _CurrencyPerKW_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerKW");
    private final static QName _OadrReportOnly_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportOnly");
    private final static QName _OadrCreatePartyRegistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreatePartyRegistration");


    private final static QName _OadrPaylod_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrPayload");


    private final static QName _OadrReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReport");
    private final static QName _OadrTransportAddress_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrTransportAddress");
    private final static QName _OadrCancelOpt_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCancelOpt");
    private final static QName _OadrCanceledOpt_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCanceledOpt");
    private final static QName _OadrReportRequest_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportRequest");
    private final static QName _OadrGBPayload_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrGBPayload");
    private final static QName _OadrRegisteredReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRegisteredReport");
    private final static QName _CurrencyPerThm_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerThm");
    private final static QName _OadrProfileName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrProfileName");
    private final static QName _OadrRequestReregistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRequestReregistration");
    private final static QName _OadrPendingReports_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrPendingReports");
    private final static QName _Frequency_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "frequency");
    private final static QName _OadrUpdatedReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrUpdatedReport");
    private final static QName _OadrQueryRegistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrQueryRegistration");
    private final static QName _Therm_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "Therm");
    private final static QName _CurrencyPerKWh_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "currencyPerKWh");
    private final static QName _OadrHttpPullModel_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrHttpPullModel");
    private final static QName _OadrDataQuality_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrDataQuality");
    private final static QName _OadrRequestedOadrPollFreq_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrRequestedOadrPollFreq");
    private final static QName _OadrCreateReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreateReport");
    private final static QName _OadrPoll_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrPoll");
    private final static QName _OadrResponseRequired_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrResponseRequired");
    private final static QName _CustomUnit_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "customUnit");
    private final static QName _OadrVenName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrVenName");
    private final static QName _OadrResponse_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrResponse");
    private final static QName _OadrGBDataDescription_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrGBDataDescription");
    private final static QName _OadrServiceName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrServiceName");
    private final static QName _OadrCanceledPartyRegistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCanceledPartyRegistration");
    private final static QName _OadrPayloadResourceStatus_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrPayloadResourceStatus");
    private final static QName _OadrCreatedPartyRegistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreatedPartyRegistration");
    private final static QName _OadrCancelPartyRegistration_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCancelPartyRegistration");
    private final static QName _OadrUpdateReport_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrUpdateReport");
    private final static QName _OadrSamplingRate_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrSamplingRate");
    private final static QName _OadrCreatedEvent_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrCreatedEvent");
    private final static QName _OadrTransportName_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrTransportName");
    private final static QName _OadrReportPayload_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportPayload");
    private final static QName _OadrDeviceClass_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrDeviceClass");
    private final static QName _OadrReportDescription_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07", "oadrReportDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openadr.oadr_2_0b._2012._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OadrTransports }
     * 
     */
    public OadrTransports createOadrTransports() {
        return new OadrTransports();
    }

    /**
     * Create an instance of {@link OadrProfiles }
     * 
     */
    public OadrProfiles createOadrProfiles() {
        return new OadrProfiles();
    }

    /**
     * Create an instance of {@link OadrServiceSpecificInfo }
     * 
     */
    public OadrServiceSpecificInfo createOadrServiceSpecificInfo() {
        return new OadrServiceSpecificInfo();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistrationType }
     * 
     */
    public OadrCreatedPartyRegistrationType createOadrCreatedPartyRegistrationType() {
        return new OadrCreatedPartyRegistrationType();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistrationType.OadrExtensions }
     * 
     */
    public OadrCreatedPartyRegistrationType.OadrExtensions createOadrCreatedPartyRegistrationTypeOadrExtensions() {
        return new OadrCreatedPartyRegistrationType.OadrExtensions();
    }

    /**
     * Create an instance of {@link OadrDistributeEventType }
     * 
     */
    public OadrDistributeEventType createOadrDistributeEventType() {
        return new OadrDistributeEventType();
    }

    /**
     * Create an instance of {@link OadrQueryRegistrationType }
     * 
     */
    public OadrQueryRegistrationType createOadrQueryRegistrationType() {
        return new OadrQueryRegistrationType();
    }

    /**
     * Create an instance of {@link OadrCanceledPartyRegistrationType }
     * 
     */
    public OadrCanceledPartyRegistrationType createOadrCanceledPartyRegistrationType() {
        return new OadrCanceledPartyRegistrationType();
    }

    /**
     * Create an instance of {@link OadrReportPayloadType }
     * 
     */
    public OadrReportPayloadType createOadrReportPayloadType() {
        return new OadrReportPayloadType();
    }

    /**
     * Create an instance of {@link OadrUpdatedReportType }
     * 
     */
    public OadrUpdatedReportType createOadrUpdatedReportType() {
        return new OadrUpdatedReportType();
    }

    /**
     * Create an instance of {@link FrequencyType }
     * 
     */
    public FrequencyType createFrequencyType() {
        return new FrequencyType();
    }

    /**
     * Create an instance of {@link OadrTransports.OadrTransport }
     * 
     */
    public OadrTransports.OadrTransport createOadrTransportsOadrTransport() {
        return new OadrTransports.OadrTransport();
    }

    /**
     * Create an instance of {@link OadrReportDescriptionType }
     * 
     */
    public OadrReportDescriptionType createOadrReportDescriptionType() {
        return new OadrReportDescriptionType();
    }

    /**
     * Create an instance of {@link OadrSignedObject }
     * 
     */
    public OadrSignedObject createOadrSignedObject() {
        return new OadrSignedObject();
    }

    /**
     * Create an instance of {@link OadrCreatedEventType }
     * 
     */
    public OadrCreatedEventType createOadrCreatedEventType() {
        return new OadrCreatedEventType();
    }

    /**
     * Create an instance of {@link OadrRequestEventType }
     * 
     */
    public OadrRequestEventType createOadrRequestEventType() {
        return new OadrRequestEventType();
    }

    /**
     * Create an instance of {@link OadrResponseType }
     * 
     */
    public OadrResponseType createOadrResponseType() {
        return new OadrResponseType();
    }

    /**
     * Create an instance of {@link OadrCancelOptType }
     * 
     */
    public OadrCancelOptType createOadrCancelOptType() {
        return new OadrCancelOptType();
    }

    /**
     * Create an instance of {@link OadrCanceledOptType }
     * 
     */
    public OadrCanceledOptType createOadrCanceledOptType() {
        return new OadrCanceledOptType();
    }

    /**
     * Create an instance of {@link OadrCreateOptType }
     * 
     */
    public OadrCreateOptType createOadrCreateOptType() {
        return new OadrCreateOptType();
    }

    /**
     * Create an instance of {@link OadrCreatedOptType }
     * 
     */
    public OadrCreatedOptType createOadrCreatedOptType() {
        return new OadrCreatedOptType();
    }

    /**
     * Create an instance of {@link OadrCancelReportType }
     * 
     */
    public OadrCancelReportType createOadrCancelReportType() {
        return new OadrCancelReportType();
    }

    /**
     * Create an instance of {@link OadrCanceledReportType }
     * 
     */
    public OadrCanceledReportType createOadrCanceledReportType() {
        return new OadrCanceledReportType();
    }

    /**
     * Create an instance of {@link OadrCreateReportType }
     * 
     */
    public OadrCreateReportType createOadrCreateReportType() {
        return new OadrCreateReportType();
    }

    /**
     * Create an instance of {@link OadrCreatedReportType }
     * 
     */
    public OadrCreatedReportType createOadrCreatedReportType() {
        return new OadrCreatedReportType();
    }

    /**
     * Create an instance of {@link OadrRegisterReportType }
     * 
     */
    public OadrRegisterReportType createOadrRegisterReportType() {
        return new OadrRegisterReportType();
    }

    /**
     * Create an instance of {@link OadrRegisteredReportType }
     * 
     */
    public OadrRegisteredReportType createOadrRegisteredReportType() {
        return new OadrRegisteredReportType();
    }

    /**
     * Create an instance of {@link OadrUpdateReportType }
     * 
     */
    public OadrUpdateReportType createOadrUpdateReportType() {
        return new OadrUpdateReportType();
    }

    /**
     * Create an instance of {@link OadrCancelPartyRegistrationType }
     * 
     */
    public OadrCancelPartyRegistrationType createOadrCancelPartyRegistrationType() {
        return new OadrCancelPartyRegistrationType();
    }

    /**
     * Create an instance of {@link OadrCreatePartyRegistrationType }
     * 
     */
    public OadrCreatePartyRegistrationType createOadrCreatePartyRegistrationType() {
        return new OadrCreatePartyRegistrationType();
    }

    /**
     * Create an instance of {@link OadrRequestReregistrationType }
     * 
     */
    public OadrRequestReregistrationType createOadrRequestReregistrationType() {
        return new OadrRequestReregistrationType();
    }

    /**
     * Create an instance of {@link OadrPollType }
     * 
     */
    public OadrPollType createOadrPollType() {
        return new OadrPollType();
    }

    /**
     * Create an instance of {@link CurrencyType }
     * 
     */
    public CurrencyType createCurrencyType() {
        return new CurrencyType();
    }

    /**
     * Create an instance of {@link ThermType }
     * 
     */
    public ThermType createThermType() {
        return new ThermType();
    }

    /**
     * Create an instance of {@link OadrProfiles.OadrProfile }
     * 
     */
    public OadrProfiles.OadrProfile createOadrProfilesOadrProfile() {
        return new OadrProfiles.OadrProfile();
    }

    /**
     * Create an instance of {@link BaseUnitType }
     * 
     */
    public BaseUnitType createBaseUnitType() {
        return new BaseUnitType();
    }

    /**
     * Create an instance of {@link OadrSamplingRateType }
     * 
     */
    public OadrSamplingRateType createOadrSamplingRateType() {
        return new OadrSamplingRateType();
    }

    /**
     * Create an instance of {@link OadrGBItemBase }
     * 
     */
    public OadrGBItemBase createOadrGBItemBase() {
        return new OadrGBItemBase();
    }

    /**
     * Create an instance of {@link OadrPendingReportsType }
     * 
     */
    public OadrPendingReportsType createOadrPendingReportsType() {
        return new OadrPendingReportsType();
    }

    /**
     * Create an instance of {@link OadrInfo }
     * 
     */
    public OadrInfo createOadrInfo() {
        return new OadrInfo();
    }

    /**
     * Create an instance of {@link OadrServiceSpecificInfo.OadrService }
     * 
     */
    public OadrServiceSpecificInfo.OadrService createOadrServiceSpecificInfoOadrService() {
        return new OadrServiceSpecificInfo.OadrService();
    }

    /**
     * Create an instance of {@link OadrReportType }
     * 
     */
    public OadrReportType createOadrReportType() {
        return new OadrReportType();
    }

    /**
     * Create an instance of {@link OadrLoadControlStateType }
     * 
     */
    public OadrLoadControlStateType createOadrLoadControlStateType() {
        return new OadrLoadControlStateType();
    }

    /**
     * Create an instance of {@link CurrentType }
     * 
     */
    public CurrentType createCurrentType() {
        return new CurrentType();
    }

    /**
     * Create an instance of {@link OadrGBStreamPayloadBase }
     * 
     */
    public OadrGBStreamPayloadBase createOadrGBStreamPayloadBase() {
        return new OadrGBStreamPayloadBase();
    }

    /**
     * Create an instance of {@link TemperatureType }
     * 
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link OadrReportRequestType }
     * 
     */
    public OadrReportRequestType createOadrReportRequestType() {
        return new OadrReportRequestType();
    }

    /**
     * Create an instance of {@link OadrPayload }
     * 
     */
    public OadrPayload createOadrPayload() {
        return new OadrPayload();
    }

    /**
     * Create an instance of {@link PulseCountType }
     * 
     */
    public PulseCountType createPulseCountType() {
        return new PulseCountType();
    }

    /**
     * Create an instance of {@link OadrPayloadResourceStatusType }
     * 
     */
    public OadrPayloadResourceStatusType createOadrPayloadResourceStatusType() {
        return new OadrPayloadResourceStatusType();
    }

    /**
     * Create an instance of {@link OadrLoadControlStateTypeType }
     * 
     */
    public OadrLoadControlStateTypeType createOadrLoadControlStateTypeType() {
        return new OadrLoadControlStateTypeType();
    }

    /**
     * Create an instance of {@link OadrCreatedPartyRegistrationType.OadrExtensions.OadrExtension }
     * 
     */
    public OadrCreatedPartyRegistrationType.OadrExtensions.OadrExtension createOadrCreatedPartyRegistrationTypeOadrExtensionsOadrExtension() {
        return new OadrCreatedPartyRegistrationType.OadrExtensions.OadrExtension();
    }

    /**
     * Create an instance of {@link OadrDistributeEventType.OadrEvent }
     * 
     */
    public OadrDistributeEventType.OadrEvent createOadrDistributeEventTypeOadrEvent() {
        return new OadrDistributeEventType.OadrEvent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreatedReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreatedReport")
    public JAXBElement<OadrCreatedReportType> createOadrCreatedReport(OadrCreatedReportType value) {
        return new JAXBElement<OadrCreatedReportType>(_OadrCreatedReport_QNAME, OadrCreatedReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCancelReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCancelReport")
    public JAXBElement<OadrCancelReportType> createOadrCancelReport(OadrCancelReportType value) {
        return new JAXBElement<OadrCancelReportType>(_OadrCancelReport_QNAME, OadrCancelReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrXmlSignature")
    public JAXBElement<Boolean> createOadrXmlSignature(Boolean value) {
        return new JAXBElement<Boolean>(_OadrXmlSignature_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currency", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrency(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_Currency_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "temperature", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<TemperatureType> createTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_Temperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreateOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreateOpt")
    public JAXBElement<OadrCreateOptType> createOadrCreateOpt(OadrCreateOptType value) {
        return new JAXBElement<OadrCreateOptType>(_OadrCreateOpt_QNAME, OadrCreateOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "current", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrentType> createCurrent(CurrentType value) {
        return new JAXBElement<CurrentType>(_Current_QNAME, CurrentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrLoadControlStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrLoadControlState")
    public JAXBElement<OadrLoadControlStateType> createOadrLoadControlState(OadrLoadControlStateType value) {
        return new JAXBElement<OadrLoadControlStateType>(_OadrLoadControlState_QNAME, OadrLoadControlStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreatedOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreatedOpt")
    public JAXBElement<OadrCreatedOptType> createOadrCreatedOpt(OadrCreatedOptType value) {
        return new JAXBElement<OadrCreatedOptType>(_OadrCreatedOpt_QNAME, OadrCreatedOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrRequestEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRequestEvent")
    public JAXBElement<OadrRequestEventType> createOadrRequestEvent(OadrRequestEventType value) {
        return new JAXBElement<OadrRequestEventType>(_OadrRequestEvent_QNAME, OadrRequestEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "pulseFactor")
    public JAXBElement<Float> createPulseFactor(Float value) {
        return new JAXBElement<Float>(_PulseFactor_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCanceledReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCanceledReport")
    public JAXBElement<OadrCanceledReportType> createOadrCanceledReport(OadrCanceledReportType value) {
        return new JAXBElement<OadrCanceledReportType>(_OadrCanceledReport_QNAME, OadrCanceledReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrDistributeEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrDistributeEvent")
    public JAXBElement<OadrDistributeEventType> createOadrDistributeEvent(OadrDistributeEventType value) {
        return new JAXBElement<OadrDistributeEventType>(_OadrDistributeEvent_QNAME, OadrDistributeEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrRegisterReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRegisterReport")
    public JAXBElement<OadrRegisterReportType> createOadrRegisterReport(OadrRegisterReportType value) {
        return new JAXBElement<OadrRegisterReportType>(_OadrRegisterReport_QNAME, OadrRegisterReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulseCountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "pulseCount", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<PulseCountType> createPulseCount(PulseCountType value) {
        return new JAXBElement<PulseCountType>(_PulseCount_QNAME, PulseCountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerKW", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerKW(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerKW_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportOnly")
    public JAXBElement<Boolean> createOadrReportOnly(Boolean value) {
        return new JAXBElement<Boolean>(_OadrReportOnly_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreatePartyRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreatePartyRegistration")
    public JAXBElement<OadrCreatePartyRegistrationType> createOadrCreatePartyRegistration(OadrCreatePartyRegistrationType value) {
        return new JAXBElement<OadrCreatePartyRegistrationType>(_OadrCreatePartyRegistration_QNAME, OadrCreatePartyRegistrationType.class, null, value);
    }


    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrPayload")
    public JAXBElement<OadrPayload> createOadrPayload(OadrPayload value) {
        return new JAXBElement<OadrPayload>(_OadrPaylod_QNAME, OadrPayload.class, null, value);
    }




    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReport")
    public JAXBElement<OadrReportType> createOadrReport(OadrReportType value) {
        return new JAXBElement<OadrReportType>(_OadrReport_QNAME, OadrReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrTransportAddress")
    public JAXBElement<String> createOadrTransportAddress(String value) {
        return new JAXBElement<String>(_OadrTransportAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCancelOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCancelOpt")
    public JAXBElement<OadrCancelOptType> createOadrCancelOpt(OadrCancelOptType value) {
        return new JAXBElement<OadrCancelOptType>(_OadrCancelOpt_QNAME, OadrCancelOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCanceledOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCanceledOpt")
    public JAXBElement<OadrCanceledOptType> createOadrCanceledOpt(OadrCanceledOptType value) {
        return new JAXBElement<OadrCanceledOptType>(_OadrCanceledOpt_QNAME, OadrCanceledOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrReportRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportRequest")
    public JAXBElement<OadrReportRequestType> createOadrReportRequest(OadrReportRequestType value) {
        return new JAXBElement<OadrReportRequestType>(_OadrReportRequest_QNAME, OadrReportRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrGBStreamPayloadBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrGBPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<OadrGBStreamPayloadBase> createOadrGBPayload(OadrGBStreamPayloadBase value) {
        return new JAXBElement<OadrGBStreamPayloadBase>(_OadrGBPayload_QNAME, OadrGBStreamPayloadBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrRegisteredReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRegisteredReport")
    public JAXBElement<OadrRegisteredReportType> createOadrRegisteredReport(OadrRegisteredReportType value) {
        return new JAXBElement<OadrRegisteredReportType>(_OadrRegisteredReport_QNAME, OadrRegisteredReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerThm", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerThm(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerThm_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrProfileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOadrProfileName(String value) {
        return new JAXBElement<String>(_OadrProfileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrRequestReregistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRequestReregistration")
    public JAXBElement<OadrRequestReregistrationType> createOadrRequestReregistration(OadrRequestReregistrationType value) {
        return new JAXBElement<OadrRequestReregistrationType>(_OadrRequestReregistration_QNAME, OadrRequestReregistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrPendingReportsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrPendingReports")
    public JAXBElement<OadrPendingReportsType> createOadrPendingReports(OadrPendingReportsType value) {
        return new JAXBElement<OadrPendingReportsType>(_OadrPendingReports_QNAME, OadrPendingReportsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "frequency", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<FrequencyType> createFrequency(FrequencyType value) {
        return new JAXBElement<FrequencyType>(_Frequency_QNAME, FrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrUpdatedReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrUpdatedReport")
    public JAXBElement<OadrUpdatedReportType> createOadrUpdatedReport(OadrUpdatedReportType value) {
        return new JAXBElement<OadrUpdatedReportType>(_OadrUpdatedReport_QNAME, OadrUpdatedReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrQueryRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrQueryRegistration")
    public JAXBElement<OadrQueryRegistrationType> createOadrQueryRegistration(OadrQueryRegistrationType value) {
        return new JAXBElement<OadrQueryRegistrationType>(_OadrQueryRegistration_QNAME, OadrQueryRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "Therm", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<ThermType> createTherm(ThermType value) {
        return new JAXBElement<ThermType>(_Therm_QNAME, ThermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "currencyPerKWh", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<CurrencyType> createCurrencyPerKWh(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_CurrencyPerKWh_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrHttpPullModel")
    public JAXBElement<Boolean> createOadrHttpPullModel(Boolean value) {
        return new JAXBElement<Boolean>(_OadrHttpPullModel_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrDataQuality")
    public JAXBElement<String> createOadrDataQuality(String value) {
        return new JAXBElement<String>(_OadrDataQuality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrRequestedOadrPollFreq")
    public JAXBElement<DurationPropType> createOadrRequestedOadrPollFreq(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_OadrRequestedOadrPollFreq_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreateReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreateReport")
    public JAXBElement<OadrCreateReportType> createOadrCreateReport(OadrCreateReportType value) {
        return new JAXBElement<OadrCreateReportType>(_OadrCreateReport_QNAME, OadrCreateReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrPollType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrPoll")
    public JAXBElement<OadrPollType> createOadrPoll(OadrPollType value) {
        return new JAXBElement<OadrPollType>(_OadrPoll_QNAME, OadrPollType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseRequiredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrResponseRequired")
    public JAXBElement<ResponseRequiredType> createOadrResponseRequired(ResponseRequiredType value) {
        return new JAXBElement<ResponseRequiredType>(_OadrResponseRequired_QNAME, ResponseRequiredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "customUnit", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<BaseUnitType> createCustomUnit(BaseUnitType value) {
        return new JAXBElement<BaseUnitType>(_CustomUnit_QNAME, BaseUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrVenName")
    public JAXBElement<String> createOadrVenName(String value) {
        return new JAXBElement<String>(_OadrVenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrResponse")
    public JAXBElement<OadrResponseType> createOadrResponse(OadrResponseType value) {
        return new JAXBElement<OadrResponseType>(_OadrResponse_QNAME, OadrResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrGBItemBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrGBDataDescription", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<OadrGBItemBase> createOadrGBDataDescription(OadrGBItemBase value) {
        return new JAXBElement<OadrGBItemBase>(_OadrGBDataDescription_QNAME, OadrGBItemBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrServiceNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrServiceName")
    public JAXBElement<OadrServiceNameType> createOadrServiceName(OadrServiceNameType value) {
        return new JAXBElement<OadrServiceNameType>(_OadrServiceName_QNAME, OadrServiceNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCanceledPartyRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCanceledPartyRegistration")
    public JAXBElement<OadrCanceledPartyRegistrationType> createOadrCanceledPartyRegistration(OadrCanceledPartyRegistrationType value) {
        return new JAXBElement<OadrCanceledPartyRegistrationType>(_OadrCanceledPartyRegistration_QNAME, OadrCanceledPartyRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrPayloadResourceStatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrPayloadResourceStatus", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<? extends PayloadBaseType> createOadrPayloadResourceStatus(OadrPayloadResourceStatusType value) {
        return new JAXBElement<OadrPayloadResourceStatusType>(_OadrPayloadResourceStatus_QNAME, OadrPayloadResourceStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreatedPartyRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreatedPartyRegistration")
    public JAXBElement<OadrCreatedPartyRegistrationType> createOadrCreatedPartyRegistration(OadrCreatedPartyRegistrationType value) {
        return new JAXBElement<OadrCreatedPartyRegistrationType>(_OadrCreatedPartyRegistration_QNAME, OadrCreatedPartyRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCancelPartyRegistrationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCancelPartyRegistration")
    public JAXBElement<OadrCancelPartyRegistrationType> createOadrCancelPartyRegistration(OadrCancelPartyRegistrationType value) {
        return new JAXBElement<OadrCancelPartyRegistrationType>(_OadrCancelPartyRegistration_QNAME, OadrCancelPartyRegistrationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrUpdateReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrUpdateReport")
    public JAXBElement<OadrUpdateReportType> createOadrUpdateReport(OadrUpdateReportType value) {
        return new JAXBElement<OadrUpdateReportType>(_OadrUpdateReport_QNAME, OadrUpdateReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrSamplingRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrSamplingRate")
    public JAXBElement<OadrSamplingRateType> createOadrSamplingRate(OadrSamplingRateType value) {
        return new JAXBElement<OadrSamplingRateType>(_OadrSamplingRate_QNAME, OadrSamplingRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrCreatedEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrCreatedEvent")
    public JAXBElement<OadrCreatedEventType> createOadrCreatedEvent(OadrCreatedEventType value) {
        return new JAXBElement<OadrCreatedEventType>(_OadrCreatedEvent_QNAME, OadrCreatedEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrTransportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrTransportName")
    public JAXBElement<OadrTransportType> createOadrTransportName(OadrTransportType value) {
        return new JAXBElement<OadrTransportType>(_OadrTransportName_QNAME, OadrTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrReportPayloadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<OadrReportPayloadType> createOadrReportPayload(OadrReportPayloadType value) {
        return new JAXBElement<OadrReportPayloadType>(_OadrReportPayload_QNAME, OadrReportPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrDeviceClass")
    public JAXBElement<EiTargetType> createOadrDeviceClass(EiTargetType value) {
        return new JAXBElement<EiTargetType>(_OadrDeviceClass_QNAME, EiTargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OadrReportDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07", name = "oadrReportDescription")
    public JAXBElement<OadrReportDescriptionType> createOadrReportDescription(OadrReportDescriptionType value) {
        return new JAXBElement<OadrReportDescriptionType>(_OadrReportDescription_QNAME, OadrReportDescriptionType.class, null, value);
    }

}
