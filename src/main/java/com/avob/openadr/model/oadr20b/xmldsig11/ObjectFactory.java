//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xmldsig11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2009.xmldsig11_ package. 
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

    private final static QName _ECKeyValue_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "ECKeyValue");
    private final static QName _X509Digest_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "X509Digest");
    private final static QName _PnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "PnB");
    private final static QName _KeyInfoReference_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "KeyInfoReference");
    private final static QName _GnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "GnB");
    private final static QName _DEREncodedKeyValue_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "DEREncodedKeyValue");
    private final static QName _TnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "TnB");
    private final static QName _Prime_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "Prime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2009.xmldsig11_
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrimeFieldParamsType }
     * 
     */
    public PrimeFieldParamsType createPrimeFieldParamsType() {
        return new PrimeFieldParamsType();
    }

    /**
     * Create an instance of {@link PnBFieldParamsType }
     * 
     */
    public PnBFieldParamsType createPnBFieldParamsType() {
        return new PnBFieldParamsType();
    }

    /**
     * Create an instance of {@link ECKeyValueType }
     * 
     */
    public ECKeyValueType createECKeyValueType() {
        return new ECKeyValueType();
    }

    /**
     * Create an instance of {@link TnBFieldParamsType }
     * 
     */
    public TnBFieldParamsType createTnBFieldParamsType() {
        return new TnBFieldParamsType();
    }

    /**
     * Create an instance of {@link KeyInfoReferenceType }
     * 
     */
    public KeyInfoReferenceType createKeyInfoReferenceType() {
        return new KeyInfoReferenceType();
    }

    /**
     * Create an instance of {@link CharTwoFieldParamsType }
     * 
     */
    public CharTwoFieldParamsType createCharTwoFieldParamsType() {
        return new CharTwoFieldParamsType();
    }

    /**
     * Create an instance of {@link X509DigestType }
     * 
     */
    public X509DigestType createX509DigestType() {
        return new X509DigestType();
    }

    /**
     * Create an instance of {@link DEREncodedKeyValueType }
     * 
     */
    public DEREncodedKeyValueType createDEREncodedKeyValueType() {
        return new DEREncodedKeyValueType();
    }

    /**
     * Create an instance of {@link FieldIDType }
     * 
     */
    public FieldIDType createFieldIDType() {
        return new FieldIDType();
    }

    /**
     * Create an instance of {@link NamedCurveType }
     * 
     */
    public NamedCurveType createNamedCurveType() {
        return new NamedCurveType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link ECValidationDataType }
     * 
     */
    public ECValidationDataType createECValidationDataType() {
        return new ECValidationDataType();
    }

    /**
     * Create an instance of {@link ECParametersType }
     * 
     */
    public ECParametersType createECParametersType() {
        return new ECParametersType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "ECKeyValue")
    public JAXBElement<ECKeyValueType> createECKeyValue(ECKeyValueType value) {
        return new JAXBElement<ECKeyValueType>(_ECKeyValue_QNAME, ECKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509DigestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "X509Digest")
    public JAXBElement<X509DigestType> createX509Digest(X509DigestType value) {
        return new JAXBElement<X509DigestType>(_X509Digest_QNAME, X509DigestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnBFieldParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "PnB")
    public JAXBElement<PnBFieldParamsType> createPnB(PnBFieldParamsType value) {
        return new JAXBElement<PnBFieldParamsType>(_PnB_QNAME, PnBFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyInfoReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "KeyInfoReference")
    public JAXBElement<KeyInfoReferenceType> createKeyInfoReference(KeyInfoReferenceType value) {
        return new JAXBElement<KeyInfoReferenceType>(_KeyInfoReference_QNAME, KeyInfoReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharTwoFieldParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "GnB")
    public JAXBElement<CharTwoFieldParamsType> createGnB(CharTwoFieldParamsType value) {
        return new JAXBElement<CharTwoFieldParamsType>(_GnB_QNAME, CharTwoFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEREncodedKeyValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "DEREncodedKeyValue")
    public JAXBElement<DEREncodedKeyValueType> createDEREncodedKeyValue(DEREncodedKeyValueType value) {
        return new JAXBElement<DEREncodedKeyValueType>(_DEREncodedKeyValue_QNAME, DEREncodedKeyValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TnBFieldParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "TnB")
    public JAXBElement<TnBFieldParamsType> createTnB(TnBFieldParamsType value) {
        return new JAXBElement<TnBFieldParamsType>(_TnB_QNAME, TnBFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeFieldParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "Prime")
    public JAXBElement<PrimeFieldParamsType> createPrime(PrimeFieldParamsType value) {
        return new JAXBElement<PrimeFieldParamsType>(_Prime_QNAME, PrimeFieldParamsType.class, null, value);
    }

}
