//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.util.List;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.gml._3 package. 
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

    private final static QName _PosList_QNAME = new QName("http://www.opengis.net/gml/3.2", "posList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.gml._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeatureCollection }
     * 
     */
    public FeatureCollection createFeatureCollection() {
        return new FeatureCollection();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location }
     * 
     */
    public FeatureCollection.Location createFeatureCollectionLocation() {
        return new FeatureCollection.Location();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon }
     * 
     */
    public FeatureCollection.Location.Polygon createFeatureCollectionLocationPolygon() {
        return new FeatureCollection.Location.Polygon();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon.Exterior }
     * 
     */
    public FeatureCollection.Location.Polygon.Exterior createFeatureCollectionLocationPolygonExterior() {
        return new FeatureCollection.Location.Polygon.Exterior();
    }

    /**
     * Create an instance of {@link FeatureCollection.Location.Polygon.Exterior.LinearRing }
     * 
     */
    public FeatureCollection.Location.Polygon.Exterior.LinearRing createFeatureCollectionLocationPolygonExteriorLinearRing() {
        return new FeatureCollection.Location.Polygon.Exterior.LinearRing();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Double }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "posList")
    public JAXBElement<List<Double>> createPosList(List<Double> value) {
        return new JAXBElement<List<Double>>(_PosList_QNAME, ((Class) List.class), null, ((List<Double> ) value));
    }

}
