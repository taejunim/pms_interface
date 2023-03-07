//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xmldsig.properties;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openadr.oadr_2_0b._2012._07.xmldsig_properties package. 
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

    private final static QName _ReplayProtect_QNAME = new QName("http://openadr.org/oadr-2.0b/2012/07/xmldsig-properties", "ReplayProtect");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openadr.oadr_2_0b._2012._07.xmldsig_properties
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplayProtectType }
     * 
     */
    public ReplayProtectType createReplayProtectType() {
        return new ReplayProtectType();
    }

    /**
     * Create an instance of {@link NonceValueType }
     * 
     */
    public NonceValueType createNonceValueType() {
        return new NonceValueType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplayProtectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://openadr.org/oadr-2.0b/2012/07/xmldsig-properties", name = "ReplayProtect")
    public JAXBElement<ReplayProtectType> createReplayProtect(ReplayProtectType value) {
        return new JAXBElement<ReplayProtectType>(_ReplayProtect_QNAME, ReplayProtectType.class, null, value);
    }

}
