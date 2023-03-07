//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.ei.EiResponseType;
import com.avob.openadr.model.oadr20b.xcal.DurationPropType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>oadrCreatedPartyRegistrationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrCreatedPartyRegistrationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiResponse"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}registrationID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}venID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}vtnID"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrProfiles"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrRequestedOadrPollFreq" minOccurs="0"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrServiceSpecificInfo" minOccurs="0"/>
 *         &lt;element name="oadrExtensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oadrExtension" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="oadrExtensionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrInfo" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://docs.oasis-open.org/ns/energyinterop/201110}schemaVersion"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrCreatedPartyRegistrationType", propOrder = {
    "eiResponse",
    "registrationID",
    "venID",
    "vtnID",
    "oadrProfiles",
    "oadrRequestedOadrPollFreq",
    "oadrServiceSpecificInfo",
    "oadrExtensions"
})
public class OadrCreatedPartyRegistrationType {

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiResponseType eiResponse;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String registrationID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String venID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected String vtnID;
    @XmlElement(required = true)
    protected OadrProfiles oadrProfiles;
    protected DurationPropType oadrRequestedOadrPollFreq;
    protected OadrServiceSpecificInfo oadrServiceSpecificInfo;
    protected OadrExtensions oadrExtensions;
    @XmlAttribute(name = "schemaVersion", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String schemaVersion;

    /**
     * eiResponse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiResponseType }
     *     
     */
    public EiResponseType getEiResponse() {
        return eiResponse;
    }

    /**
     * eiResponse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiResponseType }
     *     
     */
    public void setEiResponse(EiResponseType value) {
        this.eiResponse = value;
    }

    /**
     * registrationID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * registrationID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
    }

    /**
     * venID not included in query unless already registered
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVenID() {
        return venID;
    }

    /**
     * venID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVenID(String value) {
        this.venID = value;
    }

    /**
     * vtnID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtnID() {
        return vtnID;
    }

    /**
     * vtnID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnID(String value) {
        this.vtnID = value;
    }

    /**
     * VTN response to query registration returns all supported. This element is not required for a registration  response
     * 
     * @return
     *     possible object is
     *     {@link OadrProfiles }
     *     
     */
    public OadrProfiles getOadrProfiles() {
        return oadrProfiles;
    }

    /**
     * oadrProfiles 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrProfiles }
     *     
     */
    public void setOadrProfiles(OadrProfiles value) {
        this.oadrProfiles = value;
    }

    /**
     * HTTP Pull Only - The VEN shall send an oadrPoll payload to the VTN at most once for each duration specified by this element
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getOadrRequestedOadrPollFreq() {
        return oadrRequestedOadrPollFreq;
    }

    /**
     * oadrRequestedOadrPollFreq 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setOadrRequestedOadrPollFreq(DurationPropType value) {
        this.oadrRequestedOadrPollFreq = value;
    }

    /**
     * oadrServiceSpecificInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrServiceSpecificInfo }
     *     
     */
    public OadrServiceSpecificInfo getOadrServiceSpecificInfo() {
        return oadrServiceSpecificInfo;
    }

    /**
     * oadrServiceSpecificInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrServiceSpecificInfo }
     *     
     */
    public void setOadrServiceSpecificInfo(OadrServiceSpecificInfo value) {
        this.oadrServiceSpecificInfo = value;
    }

    /**
     * oadrExtensions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OadrExtensions }
     *     
     */
    public OadrExtensions getOadrExtensions() {
        return oadrExtensions;
    }

    /**
     * oadrExtensions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OadrExtensions }
     *     
     */
    public void setOadrExtensions(OadrExtensions value) {
        this.oadrExtensions = value;
    }

    /**
     * schemaVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * schemaVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="oadrExtension" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="oadrExtensionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrInfo" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oadrExtension"
    })
    public static class OadrExtensions {

        protected List<OadrExtension> oadrExtension;

        /**
         * Gets the value of the oadrExtension property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oadrExtension property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOadrExtension().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OadrExtension }
         * 
         * 
         */
        public List<OadrExtension> getOadrExtension() {
            if (oadrExtension == null) {
                oadrExtension = new ArrayList<OadrExtension>();
            }
            return this.oadrExtension;
        }


        /**
         * <p>anonymous complex type에 대한 Java 클래스입니다.
         * 
         * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="oadrExtensionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrInfo" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "oadrExtensionName",
            "oadrInfo"
        })
        public static class OadrExtension {

            @XmlElement(required = true)
            protected String oadrExtensionName;
            protected List<OadrInfo> oadrInfo;

            /**
             * oadrExtensionName 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOadrExtensionName() {
                return oadrExtensionName;
            }

            /**
             * oadrExtensionName 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOadrExtensionName(String value) {
                this.oadrExtensionName = value;
            }

            /**
             * Gets the value of the oadrInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the oadrInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOadrInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OadrInfo }
             * 
             * 
             */
            public List<OadrInfo> getOadrInfo() {
                if (oadrInfo == null) {
                    oadrInfo = new ArrayList<OadrInfo>();
                }
                return this.oadrInfo;
            }

        }

    }

}
