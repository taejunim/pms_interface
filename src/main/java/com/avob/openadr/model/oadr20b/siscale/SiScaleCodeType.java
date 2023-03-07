//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:55:48 PM KST 
//


package com.avob.openadr.model.oadr20b.siscale;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.emix._2011._06.siscale package. 
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
public class SiScaleCodeType {

    private final static QName _SiScaleCode_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/siscale", "siScaleCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.emix._2011._06.siscale
     * 
     */
    public SiScaleCodeType() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/siscale", name = "siScaleCode")
    public JAXBElement<String> createSiScaleCode(String value) {
        return new JAXBElement<String>(_SiScaleCode_QNAME, String.class, null, value);
    }

}
