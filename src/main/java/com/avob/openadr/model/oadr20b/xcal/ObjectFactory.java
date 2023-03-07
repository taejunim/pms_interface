//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xcal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ietf.params.xml.ns.icalendar_2 package. 
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

    private final static QName _Available_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "available");
    private final static QName _Duration_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "duration");
    private final static QName _Components_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "components");
    private final static QName _Vavailability_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "vavailability");
    private final static QName _DateTime_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "date-time");
    private final static QName _Text_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "text");
    private final static QName _Interval_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "interval");
    private final static QName _Granularity_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0", "granularity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ietf.params.xml.ns.icalendar_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Properties.Tolerance }
     * 
     */
    public Properties.Tolerance createPropertiesTolerance() {
        return new Properties.Tolerance();
    }

    /**
     * Create an instance of {@link DurationPropType }
     * 
     */
    public DurationPropType createDurationPropType() {
        return new DurationPropType();
    }

    /**
     * Create an instance of {@link Uid }
     * 
     */
    public Uid createUid() {
        return new Uid();
    }

    /**
     * Create an instance of {@link VavailabilityType }
     * 
     */
    public VavailabilityType createVavailabilityType() {
        return new VavailabilityType();
    }

    /**
     * Create an instance of {@link AvailableType }
     * 
     */
    public AvailableType createAvailableType() {
        return new AvailableType();
    }

    /**
     * Create an instance of {@link WsCalendarIntervalType }
     * 
     */
    public WsCalendarIntervalType createWsCalendarIntervalType() {
        return new WsCalendarIntervalType();
    }

    /**
     * Create an instance of {@link Dtend }
     * 
     */
    public Dtend createDtend() {
        return new Dtend();
    }

    /**
     * Create an instance of {@link Dtstart }
     * 
     */
    public Dtstart createDtstart() {
        return new Dtstart();
    }

    /**
     * Create an instance of {@link ArrayOfVavailabilityContainedComponents }
     * 
     */
    public ArrayOfVavailabilityContainedComponents createArrayOfVavailabilityContainedComponents() {
        return new ArrayOfVavailabilityContainedComponents();
    }

    /**
     * Create an instance of {@link Properties.Tolerance.Tolerate }
     * 
     */
    public Properties.Tolerance.Tolerate createPropertiesToleranceTolerate() {
        return new Properties.Tolerance.Tolerate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "available")
    public JAXBElement<AvailableType> createAvailable(AvailableType value) {
        return new JAXBElement<AvailableType>(_Available_QNAME, AvailableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "duration")
    public JAXBElement<DurationPropType> createDuration(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_Duration_QNAME, DurationPropType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "components")
    public JAXBElement<Object> createComponents(Object value) {
        return new JAXBElement<Object>(_Components_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VavailabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "vavailability")
    public JAXBElement<VavailabilityType> createVavailability(VavailabilityType value) {
        return new JAXBElement<VavailabilityType>(_Vavailability_QNAME, VavailabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "date-time")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsCalendarIntervalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "interval")
    public JAXBElement<WsCalendarIntervalType> createInterval(WsCalendarIntervalType value) {
        return new JAXBElement<WsCalendarIntervalType>(_Interval_QNAME, WsCalendarIntervalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", name = "granularity")
    public JAXBElement<DurationPropType> createGranularity(DurationPropType value) {
        return new JAXBElement<DurationPropType>(_Granularity_QNAME, DurationPropType.class, null, value);
    }

}
