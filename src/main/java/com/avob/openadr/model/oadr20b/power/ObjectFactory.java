//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.power;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ns.emix._2011._06.power package. 
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

    private final static QName _MeterAsset_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "meterAsset");
    private final static QName _EndDeviceAsset_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "endDeviceAsset");
    private final static QName _Mrid_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "mrid");
    private final static QName _PowerAttributes_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "powerAttributes");
    private final static QName _PowerItem_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "powerItem");
    private final static QName _EnergyReal_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "energyReal");
    private final static QName _PowerApparent_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "powerApparent");
    private final static QName _ServiceLocation_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "serviceLocation");
    private final static QName _EnergyApparent_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "energyApparent");
    private final static QName _ServiceDeliveryPoint_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "serviceDeliveryPoint");
    private final static QName _TransportInterface_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "transportInterface");
    private final static QName _Voltage_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "voltage");
    private final static QName _AggregatedPnode_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "aggregatedPnode");
    private final static QName _EnergyItem_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "energyItem");
    private final static QName _PowerReal_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "powerReal");
    private final static QName _Pnode_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "pnode");
    private final static QName _Node_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "node");
    private final static QName _PowerReactive_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "powerReactive");
    private final static QName _EnergyReactive_QNAME = new QName("http://docs.oasis-open.org/ns/emix/2011/06/power", "energyReactive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ns.emix._2011._06.power
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceLocationType }
     * 
     */
    public ServiceLocationType createServiceLocationType() {
        return new ServiceLocationType();
    }

    /**
     * Create an instance of {@link EndDeviceAssetType }
     * 
     */
    public EndDeviceAssetType createEndDeviceAssetType() {
        return new EndDeviceAssetType();
    }

    /**
     * Create an instance of {@link PowerAttributesType }
     * 
     */
    public PowerAttributesType createPowerAttributesType() {
        return new PowerAttributesType();
    }

    /**
     * Create an instance of {@link EnergyReactiveType }
     * 
     */
    public EnergyReactiveType createEnergyReactiveType() {
        return new EnergyReactiveType();
    }

    /**
     * Create an instance of {@link AggregatedPnodeType }
     * 
     */
    public AggregatedPnodeType createAggregatedPnodeType() {
        return new AggregatedPnodeType();
    }

    /**
     * Create an instance of {@link PnodeType }
     * 
     */
    public PnodeType createPnodeType() {
        return new PnodeType();
    }

    /**
     * Create an instance of {@link VoltageType }
     * 
     */
    public VoltageType createVoltageType() {
        return new VoltageType();
    }

    /**
     * Create an instance of {@link EnergyApparentType }
     * 
     */
    public EnergyApparentType createEnergyApparentType() {
        return new EnergyApparentType();
    }

    /**
     * Create an instance of {@link MeterAssetType }
     * 
     */
    public MeterAssetType createMeterAssetType() {
        return new MeterAssetType();
    }

    /**
     * Create an instance of {@link PowerApparentType }
     * 
     */
    public PowerApparentType createPowerApparentType() {
        return new PowerApparentType();
    }

    /**
     * Create an instance of {@link EnergyRealType }
     * 
     */
    public EnergyRealType createEnergyRealType() {
        return new EnergyRealType();
    }

    /**
     * Create an instance of {@link PowerRealType }
     * 
     */
    public PowerRealType createPowerRealType() {
        return new PowerRealType();
    }

    /**
     * Create an instance of {@link ServiceDeliveryPointType }
     * 
     */
    public ServiceDeliveryPointType createServiceDeliveryPointType() {
        return new ServiceDeliveryPointType();
    }

    /**
     * Create an instance of {@link TransportInterfaceType }
     * 
     */
    public TransportInterfaceType createTransportInterfaceType() {
        return new TransportInterfaceType();
    }

    /**
     * Create an instance of {@link PowerReactiveType }
     * 
     */
    public PowerReactiveType createPowerReactiveType() {
        return new PowerReactiveType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterAssetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "meterAsset")
    public JAXBElement<MeterAssetType> createMeterAsset(MeterAssetType value) {
        return new JAXBElement<MeterAssetType>(_MeterAsset_QNAME, MeterAssetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDeviceAssetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "endDeviceAsset")
    public JAXBElement<EndDeviceAssetType> createEndDeviceAsset(EndDeviceAssetType value) {
        return new JAXBElement<EndDeviceAssetType>(_EndDeviceAsset_QNAME, EndDeviceAssetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "mrid")
    public JAXBElement<String> createMrid(String value) {
        return new JAXBElement<String>(_Mrid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "powerAttributes")
    public JAXBElement<PowerAttributesType> createPowerAttributes(PowerAttributesType value) {
        return new JAXBElement<PowerAttributesType>(_PowerAttributes_QNAME, PowerAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "powerItem", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<PowerItemType> createPowerItem(PowerItemType value) {
        return new JAXBElement<PowerItemType>(_PowerItem_QNAME, PowerItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "energyReal", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "energyItem")
    public JAXBElement<EnergyRealType> createEnergyReal(EnergyRealType value) {
        return new JAXBElement<EnergyRealType>(_EnergyReal_QNAME, EnergyRealType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "powerApparent", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "powerItem")
    public JAXBElement<PowerApparentType> createPowerApparent(PowerApparentType value) {
        return new JAXBElement<PowerApparentType>(_PowerApparent_QNAME, PowerApparentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "serviceLocation")
    public JAXBElement<ServiceLocationType> createServiceLocation(ServiceLocationType value) {
        return new JAXBElement<ServiceLocationType>(_ServiceLocation_QNAME, ServiceLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "energyApparent", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "energyItem")
    public JAXBElement<EnergyApparentType> createEnergyApparent(EnergyApparentType value) {
        return new JAXBElement<EnergyApparentType>(_EnergyApparent_QNAME, EnergyApparentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "serviceDeliveryPoint")
    public JAXBElement<ServiceDeliveryPointType> createServiceDeliveryPoint(ServiceDeliveryPointType value) {
        return new JAXBElement<ServiceDeliveryPointType>(_ServiceDeliveryPoint_QNAME, ServiceDeliveryPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "transportInterface")
    public JAXBElement<TransportInterfaceType> createTransportInterface(TransportInterfaceType value) {
        return new JAXBElement<TransportInterfaceType>(_TransportInterface_QNAME, TransportInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoltageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "voltage", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<VoltageType> createVoltage(VoltageType value) {
        return new JAXBElement<VoltageType>(_Voltage_QNAME, VoltageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatedPnodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "aggregatedPnode")
    public JAXBElement<AggregatedPnodeType> createAggregatedPnode(AggregatedPnodeType value) {
        return new JAXBElement<AggregatedPnodeType>(_AggregatedPnode_QNAME, AggregatedPnodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "energyItem", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06", substitutionHeadName = "itemBase")
    public JAXBElement<EnergyItemType> createEnergyItem(EnergyItemType value) {
        return new JAXBElement<EnergyItemType>(_EnergyItem_QNAME, EnergyItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "powerReal", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "powerItem")
    public JAXBElement<PowerRealType> createPowerReal(PowerRealType value) {
        return new JAXBElement<PowerRealType>(_PowerReal_QNAME, PowerRealType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "pnode")
    public JAXBElement<PnodeType> createPnode(PnodeType value) {
        return new JAXBElement<PnodeType>(_Pnode_QNAME, PnodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "node")
    public JAXBElement<String> createNode(String value) {
        return new JAXBElement<String>(_Node_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "powerReactive", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "powerItem")
    public JAXBElement<PowerReactiveType> createPowerReactive(PowerReactiveType value) {
        return new JAXBElement<PowerReactiveType>(_PowerReactive_QNAME, PowerReactiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", name = "energyReactive", substitutionHeadNamespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", substitutionHeadName = "energyItem")
    public JAXBElement<EnergyReactiveType> createEnergyReactive(EnergyReactiveType value) {
        return new JAXBElement<EnergyReactiveType>(_EnergyReactive_QNAME, EnergyReactiveType.class, null, value);
    }

}