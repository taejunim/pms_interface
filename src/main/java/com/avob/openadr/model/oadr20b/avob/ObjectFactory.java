//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.avob;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avob.oadr package. 
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

    private final static QName _PayloadKeyToken_QNAME = new QName("http://oadr.avob.com", "payloadKeyToken");
    private final static QName _PayloadAvobVenServiceRequest_QNAME = new QName("http://oadr.avob.com", "payloadAvobVenServiceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avob.oadr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayloadKeyTokenType }
     * 
     */
    public PayloadKeyTokenType createPayloadKeyTokenType() {
        return new PayloadKeyTokenType();
    }

    /**
     * Create an instance of {@link PayloadAvobVenServiceRequestType }
     * 
     */
    public PayloadAvobVenServiceRequestType createPayloadAvobVenServiceRequestType() {
        return new PayloadAvobVenServiceRequestType();
    }

    /**
     * Create an instance of {@link KeyTokenType }
     * 
     */
    public KeyTokenType createKeyTokenType() {
        return new KeyTokenType();
    }

    /**
     * Create an instance of {@link AvobVenServiceRequestType }
     * 
     */
    public AvobVenServiceRequestType createAvobVenServiceRequestType() {
        return new AvobVenServiceRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadKeyTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oadr.avob.com", name = "payloadKeyToken", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<PayloadKeyTokenType> createPayloadKeyToken(PayloadKeyTokenType value) {
        return new JAXBElement<PayloadKeyTokenType>(_PayloadKeyToken_QNAME, PayloadKeyTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadAvobVenServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oadr.avob.com", name = "payloadAvobVenServiceRequest", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/energyinterop/201110", substitutionHeadName = "payloadBase")
    public JAXBElement<PayloadAvobVenServiceRequestType> createPayloadAvobVenServiceRequest(PayloadAvobVenServiceRequestType value) {
        return new JAXBElement<PayloadAvobVenServiceRequestType>(_PayloadAvobVenServiceRequest_QNAME, PayloadAvobVenServiceRequestType.class, null, value);
    }

}
