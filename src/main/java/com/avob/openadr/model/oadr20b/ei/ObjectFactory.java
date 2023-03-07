//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.strm.StreamPayloadBaseType;
import com.avob.openadr.model.oadr20b.xcal.DurationPropType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.energyinterop._201110 package. 
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

    private final static QName _EiReportID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiReportID");
    private final static QName _ResponseDescription_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseDescription");
    private final static QName _EventStatus_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventStatus");
    private final static QName _ReportDataSource_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportDataSource");
    private final static QName _Responses_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responses");
    private final static QName _PayloadBase_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "payloadBase");
    private final static QName _ReadingType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "readingType");
    private final static QName _OptID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optID");
    private final static QName _StatusDateTime_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "statusDateTime");
    private final static QName _NumDataSources_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "numDataSources");
    private final static QName _SignalType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalType");
    private final static QName _EiEventSignals_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiEventSignals");
    private final static QName _Interval_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "interval");
    private final static QName _RID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "rID");
    private final static QName _Confidence_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "confidence");
    private final static QName _PayloadFloat_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "payloadFloat");
    private final static QName _ReportSpecifier_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportSpecifier");
    private final static QName _XEiRampUp_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRampUp");
    private final static QName _OptType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optType");
    private final static QName _ReportEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportEnumerated");
    private final static QName _RegistrationID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "registrationID");
    private final static QName _ReportSpecifierID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportSpecifierID");
    private final static QName _SpecifierPayload_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "specifierPayload");
    private final static QName _ReportType_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportType");
    private final static QName _EiResponse_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiResponse");
    private final static QName _SignalName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalName");
    private final static QName _ResourceID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "resourceID");
    private final static QName _ReportRequestID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportRequestID");
    private final static QName _EiEventBaseline_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiEventBaseline");
    private final static QName _XEiRecovery_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiRecovery");
    private final static QName _EiTarget_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiTarget");
    private final static QName _CurrentValue_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "currentValue");
    private final static QName _SignalPayload_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "signalPayload");
    private final static QName _VenID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "venID");
    private final static QName _Uid_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "uid");
    private final static QName _EiEvent_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiEvent");
    private final static QName _EiEventSignal_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiEventSignal");
    private final static QName _EiActivePeriod_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eiActivePeriod");
    private final static QName _GroupName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "groupName");
    private final static QName _PartyID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "partyID");
    private final static QName _VtnID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "vtnID");
    private final static QName _EventDescriptor_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventDescriptor");
    private final static QName _ResponseCode_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "responseCode");
    private final static QName _CreatedDateTime_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "createdDateTime");
    private final static QName _Accuracy_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "accuracy");
    private final static QName _ReportSubject_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportSubject");
    private final static QName _OptReason_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optReason");
    private final static QName _ReportName_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "reportName");
    private final static QName _EventID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "eventID");
    private final static QName _QualifiedEventID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "qualifiedEventID");
    private final static QName _XEiNotification_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "x-eiNotification");
    private final static QName _ModificationNumber_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "modificationNumber");
    private final static QName _GroupID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "groupID");
    private final static QName _OptReasonEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "optReasonEnumerated");
    private final static QName _ReadingTypeEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "readingTypeEnumerated");
    private final static QName _SignalNameEnumerated_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "SignalNameEnumerated");
    private final static QName _RefID_QNAME = new QName("http://docs.oasis-open.org/ns/energyinterop/201110", "refID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.energyinterop._201110
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventResponses }
     * 
     */
    public EventResponses createEventResponses() {
        return new EventResponses();
    }

    /**
     * Create an instance of {@link EventDescriptorType }
     * 
     */
    public EventDescriptorType createEventDescriptorType() {
        return new EventDescriptorType();
    }

    /**
     * Create an instance of {@link EiTargetType }
     * 
     */
    public EiTargetType createEiTargetType() {
        return new EiTargetType();
    }

    /**
     * Create an instance of {@link IntervalType }
     * 
     */
    public IntervalType createIntervalType() {
        return new IntervalType();
    }

    /**
     * Create an instance of {@link SpecifierPayloadType }
     * 
     */
    public SpecifierPayloadType createSpecifierPayloadType() {
        return new SpecifierPayloadType();
    }

    /**
     * Create an instance of {@link EiResponseType }
     * 
     */
    public EiResponseType createEiResponseType() {
        return new EiResponseType();
    }

    /**
     * Create an instance of {@link EiActivePeriodType }
     * 
     */
    public EiActivePeriodType createEiActivePeriodType() {
        return new EiActivePeriodType();
    }

    /**
     * Create an instance of {@link EiEventSignalType }
     * 
     */
    public EiEventSignalType createEiEventSignalType() {
        return new EiEventSignalType();
    }

    /**
     * Create an instance of {@link EiEventSignalsType }
     * 
     */
    public EiEventSignalsType createEiEventSignalsType() {
        return new EiEventSignalsType();
    }

    /**
     * Create an instance of {@link QualifiedEventIDType }
     * 
     */
    public QualifiedEventIDType createQualifiedEventIDType() {
        return new QualifiedEventIDType();
    }

    /**
     * Create an instance of {@link SignalPayloadType }
     * 
     */
    public SignalPayloadType createSignalPayloadType() {
        return new SignalPayloadType();
    }

    /**
     * Create an instance of {@link EiEventType }
     * 
     */
    public EiEventType createEiEventType() {
        return new EiEventType();
    }

    /**
     * Create an instance of {@link PayloadFloatType }
     * 
     */
    public PayloadFloatType createPayloadFloatType() {
        return new PayloadFloatType();
    }

    /**
     * Create an instance of {@link EiEventBaselineType }
     * 
     */
    public EiEventBaselineType createEiEventBaselineType() {
        return new EiEventBaselineType();
    }

    /**
     * Create an instance of {@link ReportSpecifierType }
     * 
     */
    public ReportSpecifierType createReportSpecifierType() {
        return new ReportSpecifierType();
    }

    /**
     * Create an instance of {@link ArrayofResponses }
     * 
     */
    public ArrayofResponses createArrayofResponses() {
        return new ArrayofResponses();
    }

    /**
     * Create an instance of {@link EventResponses.EventResponse }
     * 
     */
    public EventResponses.EventResponse createEventResponsesEventResponse() {
        return new EventResponses.EventResponse();
    }

    /**
     * Create an instance of {@link CurrentValueType }
     * 
     */
    public CurrentValueType createCurrentValueType() {
        return new CurrentValueType();
    }

    /**
     * Create an instance of {@link ReportPayloadType }
     * 
     */
    public ReportPayloadType createReportPayloadType() {
        return new ReportPayloadType();
    }

    /**
     * Create an instance of {@link EiOptType }
     * 
     */
    public EiOptType createEiOptType() {
        return new EiOptType();
    }

    /**
     * Create an instance of {@link EventDescriptorType.EiMarketContext }
     * 
     */
    public EventDescriptorType.EiMarketContext createEventDescriptorTypeEiMarketContext() {
        return new EventDescriptorType.EiMarketContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiReportID")
    public JAXBElement<String> createEiReportID(String value) {
        return new JAXBElement<String>(_EiReportID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseDescription")
    public JAXBElement<String> createResponseDescription(String value) {
        return new JAXBElement<String>(_ResponseDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventStatusEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventStatus")
    public JAXBElement<EventStatusEnumeratedType> createEventStatus(EventStatusEnumeratedType value) {
        return new JAXBElement<EventStatusEnumeratedType>(_EventStatus_QNAME, EventStatusEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportDataSource")
    public JAXBElement<EiTargetType> createReportDataSource(EiTargetType value) {
        return new JAXBElement<EiTargetType>(_ReportDataSource_QNAME, EiTargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayofResponses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responses")
    public JAXBElement<ArrayofResponses> createResponses(ArrayofResponses value) {
        return new JAXBElement<ArrayofResponses>(_Responses_QNAME, ArrayofResponses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "payloadBase")
    public JAXBElement<PayloadBaseType> createPayloadBase(PayloadBaseType value) {
        return new JAXBElement<PayloadBaseType>(_PayloadBase_QNAME, PayloadBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "readingType")
    public JAXBElement<String> createReadingType(String value) {
        return new JAXBElement<String>(_ReadingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optID")
    public JAXBElement<String> createOptID(String value) {
        return new JAXBElement<String>(_OptID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "statusDateTime")
    public JAXBElement<XMLGregorianCalendar> createStatusDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StatusDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "numDataSources")
    public JAXBElement<Long> createNumDataSources(Long value) {
        return new JAXBElement<Long>(_NumDataSources_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalTypeEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalType")
    public JAXBElement<SignalTypeEnumeratedType> createSignalType(SignalTypeEnumeratedType value) {
        return new JAXBElement<SignalTypeEnumeratedType>(_SignalType_QNAME, SignalTypeEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiEventSignalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiEventSignals")
    public JAXBElement<EiEventSignalsType> createEiEventSignals(EiEventSignalsType value) {
        return new JAXBElement<EiEventSignalsType>(_EiEventSignals_QNAME, EiEventSignalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "interval")
    public JAXBElement<IntervalType> createInterval(IntervalType value) {
        return new JAXBElement<IntervalType>(_Interval_QNAME, IntervalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "rID")
    public JAXBElement<String> createRID(String value) {
        return new JAXBElement<String>(_RID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "confidence")
    public JAXBElement<Long> createConfidence(Long value) {
        return new JAXBElement<Long>(_Confidence_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadFloatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "payloadFloat", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<PayloadFloatType> createPayloadFloat(PayloadFloatType value) {
        return new JAXBElement<PayloadFloatType>(_PayloadFloat_QNAME, PayloadFloatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSpecifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportSpecifier")
    public JAXBElement<ReportSpecifierType> createReportSpecifier(ReportSpecifierType value) {
        return new JAXBElement<ReportSpecifierType>(_ReportSpecifier_QNAME, ReportSpecifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRampUp")
    public JAXBElement<DurationPropType> createXEiRampUp(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRampUp_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optType")
    public JAXBElement<OptTypeType> createOptType(OptTypeType value) {
        return new JAXBElement<OptTypeType>(_OptType_QNAME, OptTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportEnumerated")
    public JAXBElement<ReportEnumeratedType> createReportEnumerated(ReportEnumeratedType value) {
        return new JAXBElement<ReportEnumeratedType>(_ReportEnumerated_QNAME, ReportEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "registrationID", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "refID")
    public JAXBElement<String> createRegistrationID(String value) {
        return new JAXBElement<String>(_RegistrationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportSpecifierID")
    public JAXBElement<String> createReportSpecifierID(String value) {
        return new JAXBElement<String>(_ReportSpecifierID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifierPayloadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "specifierPayload")
    public JAXBElement<SpecifierPayloadType> createSpecifierPayload(SpecifierPayloadType value) {
        return new JAXBElement<SpecifierPayloadType>(_SpecifierPayload_QNAME, SpecifierPayloadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportType")
    public JAXBElement<String> createReportType(String value) {
        return new JAXBElement<String>(_ReportType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiResponse")
    public JAXBElement<EiResponseType> createEiResponse(EiResponseType value) {
        return new JAXBElement<EiResponseType>(_EiResponse_QNAME, EiResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalName")
    public JAXBElement<String> createSignalName(String value) {
        return new JAXBElement<String>(_SignalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "resourceID")
    public JAXBElement<String> createResourceID(String value) {
        return new JAXBElement<String>(_ResourceID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportRequestID")
    public JAXBElement<String> createReportRequestID(String value) {
        return new JAXBElement<String>(_ReportRequestID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiEventBaselineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiEventBaseline")
    public JAXBElement<EiEventBaselineType> createEiEventBaseline(EiEventBaselineType value) {
        return new JAXBElement<EiEventBaselineType>(_EiEventBaseline_QNAME, EiEventBaselineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiRecovery")
    public JAXBElement<DurationPropType> createXEiRecovery(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiRecovery_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiTarget")
    public JAXBElement<EiTargetType> createEiTarget(EiTargetType value) {
        return new JAXBElement<EiTargetType>(_EiTarget_QNAME, EiTargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "currentValue")
    public JAXBElement<CurrentValueType> createCurrentValue(CurrentValueType value) {
        return new JAXBElement<CurrentValueType>(_CurrentValue_QNAME, CurrentValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalPayloadType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "signalPayload", substitutionHeadNamespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", substitutionHeadName = "streamPayloadBase")
    public JAXBElement<? extends StreamPayloadBaseType> createSignalPayload(SignalPayloadType value) {
        //return new JAXBElement<SignalPayloadType>(_SignalPayload_QNAME, SignalPayloadType.class, null, value);
        return new JAXBElement<StreamPayloadBaseType>(_SignalPayload_QNAME, StreamPayloadBaseType.class, null);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "venID")
    public JAXBElement<String> createVenID(String value) {
        return new JAXBElement<String>(_VenID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "uid")
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiEvent")
    public JAXBElement<EiEventType> createEiEvent(EiEventType value) {
        return new JAXBElement<EiEventType>(_EiEvent_QNAME, EiEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiEventSignalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiEventSignal")
    public JAXBElement<EiEventSignalType> createEiEventSignal(EiEventSignalType value) {
        return new JAXBElement<EiEventSignalType>(_EiEventSignal_QNAME, EiEventSignalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiActivePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eiActivePeriod")
    public JAXBElement<EiActivePeriodType> createEiActivePeriod(EiActivePeriodType value) {
        return new JAXBElement<EiActivePeriodType>(_EiActivePeriod_QNAME, EiActivePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "groupName")
    public JAXBElement<String> createGroupName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "partyID")
    public JAXBElement<String> createPartyID(String value) {
        return new JAXBElement<String>(_PartyID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "vtnID")
    public JAXBElement<String> createVtnID(String value) {
        return new JAXBElement<String>(_VtnID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventDescriptorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventDescriptor")
    public JAXBElement<EventDescriptorType> createEventDescriptor(EventDescriptorType value) {
        return new JAXBElement<EventDescriptorType>(_EventDescriptor_QNAME, EventDescriptorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "responseCode")
    public JAXBElement<String> createResponseCode(String value) {
        return new JAXBElement<String>(_ResponseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "createdDateTime")
    public JAXBElement<XMLGregorianCalendar> createCreatedDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatedDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "accuracy")
    public JAXBElement<Float> createAccuracy(Float value) {
        return new JAXBElement<Float>(_Accuracy_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EiTargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportSubject")
    public JAXBElement<EiTargetType> createReportSubject(EiTargetType value) {
        return new JAXBElement<EiTargetType>(_ReportSubject_QNAME, EiTargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optReason")
    public JAXBElement<String> createOptReason(String value) {
        return new JAXBElement<String>(_OptReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "reportName")
    public JAXBElement<String> createReportName(String value) {
        return new JAXBElement<String>(_ReportName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "eventID")
    public JAXBElement<String> createEventID(String value) {
        return new JAXBElement<String>(_EventID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedEventIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "qualifiedEventID")
    public JAXBElement<QualifiedEventIDType> createQualifiedEventID(QualifiedEventIDType value) {
        return new JAXBElement<QualifiedEventIDType>(_QualifiedEventID_QNAME, QualifiedEventIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "x-eiNotification")
    public JAXBElement<DurationPropType> createXEiNotification(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_XEiNotification_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "modificationNumber")
    public JAXBElement<Long> createModificationNumber(Long value) {
        return new JAXBElement<Long>(_ModificationNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "groupID")
    public JAXBElement<String> createGroupID(String value) {
        return new JAXBElement<String>(_GroupID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptReasonEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "optReasonEnumerated")
    public JAXBElement<OptReasonEnumeratedType> createOptReasonEnumerated(OptReasonEnumeratedType value) {
        return new JAXBElement<OptReasonEnumeratedType>(_OptReasonEnumerated_QNAME, OptReasonEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadingTypeEnumeratedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "readingTypeEnumerated")
    public JAXBElement<ReadingTypeEnumeratedType> createReadingTypeEnumerated(ReadingTypeEnumeratedType value) {
        return new JAXBElement<ReadingTypeEnumeratedType>(_ReadingTypeEnumerated_QNAME, ReadingTypeEnumeratedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "SignalNameEnumerated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSignalNameEnumerated(String value) {
        return new JAXBElement<String>(_SignalNameEnumerated_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", name = "refID", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "uid")
    public JAXBElement<String> createRefID(String value) {
        return new JAXBElement<String>(_RefID_QNAME, String.class, null, value);
    }

}
