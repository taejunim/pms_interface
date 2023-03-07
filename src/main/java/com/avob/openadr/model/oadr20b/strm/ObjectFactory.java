//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.strm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ietf.params.xml.ns.icalendar_2_0.stream package. 
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

    private final static QName _StreamBase_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0:stream", "streamBase");
    private final static QName _StreamPayloadBase_QNAME = new QName("urn:ietf:params:xml:ns:icalendar-2.0:stream", "streamPayloadBase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ietf.params.xml.ns.icalendar_2_0.stream
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Intervals }
     * 
     */
    public Intervals createIntervals() {
        return new Intervals();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreamBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", name = "streamBase")
    public JAXBElement<StreamBaseType> createStreamBase(StreamBaseType value) {
        return new JAXBElement<StreamBaseType>(_StreamBase_QNAME, StreamBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreamPayloadBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", name = "streamPayloadBase")
    public JAXBElement<StreamPayloadBaseType> createStreamPayloadBase(StreamPayloadBaseType value) {
        return new JAXBElement<StreamPayloadBaseType>(_StreamPayloadBase_QNAME, StreamPayloadBaseType.class, null, value);
    }

}
