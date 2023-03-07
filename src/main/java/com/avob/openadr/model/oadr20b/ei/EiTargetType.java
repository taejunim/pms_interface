//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.ei;

import com.avob.openadr.model.oadr20b.emix.ServiceAreaType;
import com.avob.openadr.model.oadr20b.power.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>EiTargetType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EiTargetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}aggregatedPnode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}endDeviceAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}meterAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}pnode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}serviceArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}serviceDeliveryPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}serviceLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}transportInterface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}groupID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}groupName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}resourceID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}partyID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiTargetType", propOrder = {
    "aggregatedPnode",
    "endDeviceAsset",
    "meterAsset",
    "pnode",
    "serviceArea",
    "serviceDeliveryPoint",
    "serviceLocation",
    "transportInterface",
    "groupID",
    "groupName",
    "resourceID",
    "venID",
    "partyID"
})
public class EiTargetType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<AggregatedPnodeType> aggregatedPnode;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<EndDeviceAssetType> endDeviceAsset;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<MeterAssetType> meterAsset;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<PnodeType> pnode;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected List<ServiceAreaType> serviceArea;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<ServiceDeliveryPointType> serviceDeliveryPoint;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<ServiceLocationType> serviceLocation;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power")
    protected List<TransportInterfaceType> transportInterface;
    protected List<String> groupID;
    protected List<String> groupName;
    protected List<String> resourceID;
    protected List<String> venID;
    protected List<String> partyID;

    /**
     * Gets the value of the aggregatedPnode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregatedPnode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregatedPnode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatedPnodeType }
     * 
     * 
     */
    public List<AggregatedPnodeType> getAggregatedPnode() {
        if (aggregatedPnode == null) {
            aggregatedPnode = new ArrayList<AggregatedPnodeType>();
        }
        return this.aggregatedPnode;
    }

    /**
     * Gets the value of the endDeviceAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDeviceAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDeviceAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndDeviceAssetType }
     * 
     * 
     */
    public List<EndDeviceAssetType> getEndDeviceAsset() {
        if (endDeviceAsset == null) {
            endDeviceAsset = new ArrayList<EndDeviceAssetType>();
        }
        return this.endDeviceAsset;
    }

    /**
     * Gets the value of the meterAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterAssetType }
     * 
     * 
     */
    public List<MeterAssetType> getMeterAsset() {
        if (meterAsset == null) {
            meterAsset = new ArrayList<MeterAssetType>();
        }
        return this.meterAsset;
    }

    /**
     * Gets the value of the pnode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnodeType }
     * 
     * 
     */
    public List<PnodeType> getPnode() {
        if (pnode == null) {
            pnode = new ArrayList<PnodeType>();
        }
        return this.pnode;
    }

    /**
     * Gets the value of the serviceArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAreaType }
     * 
     * 
     */
    public List<ServiceAreaType> getServiceArea() {
        if (serviceArea == null) {
            serviceArea = new ArrayList<ServiceAreaType>();
        }
        return this.serviceArea;
    }

    /**
     * Gets the value of the serviceDeliveryPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDeliveryPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDeliveryPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDeliveryPointType }
     * 
     * 
     */
    public List<ServiceDeliveryPointType> getServiceDeliveryPoint() {
        if (serviceDeliveryPoint == null) {
            serviceDeliveryPoint = new ArrayList<ServiceDeliveryPointType>();
        }
        return this.serviceDeliveryPoint;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocationType }
     * 
     * 
     */
    public List<ServiceLocationType> getServiceLocation() {
        if (serviceLocation == null) {
            serviceLocation = new ArrayList<ServiceLocationType>();
        }
        return this.serviceLocation;
    }

    /**
     * Gets the value of the transportInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportInterfaceType }
     * 
     * 
     */
    public List<TransportInterfaceType> getTransportInterface() {
        if (transportInterface == null) {
            transportInterface = new ArrayList<TransportInterfaceType>();
        }
        return this.transportInterface;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupID() {
        if (groupID == null) {
            groupID = new ArrayList<String>();
        }
        return this.groupID;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupName() {
        if (groupName == null) {
            groupName = new ArrayList<String>();
        }
        return this.groupName;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResourceID() {
        if (resourceID == null) {
            resourceID = new ArrayList<String>();
        }
        return this.resourceID;
    }

    /**
     * Gets the value of the venID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the venID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVenID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVenID() {
        if (venID == null) {
            venID = new ArrayList<String>();
        }
        return this.venID;
    }

    /**
     * Gets the value of the partyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyID() {
        if (partyID == null) {
            partyID = new ArrayList<String>();
        }
        return this.partyID;
    }

}
