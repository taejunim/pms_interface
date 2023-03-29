//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.xcal;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration"/>
 *         &lt;element name="tolerance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tolerate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
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
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiNotification" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiRampUp" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}x-eiRecovery" minOccurs="0"/>
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
    "dtstart",
    "duration",
    "tolerance",
    "xEiNotification",
    "xEiRampUp",
    "xEiRecovery"
})
@XmlRootElement(name = "properties")
public class Properties {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected Dtstart dtstart;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected DurationPropType duration;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected Tolerance tolerance;
    @XmlElement(name = "x-eiNotification", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiNotification;
    @XmlElement(name = "x-eiRampUp", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiRampUp;
    @XmlElement(name = "x-eiRecovery", namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected DurationPropType xEiRecovery;

    /**
     * dtstart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Dtstart }
     *     
     */
    public Dtstart getDtstart() {
        return dtstart;
    }

    /**
     * dtstart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Dtstart }
     *     
     */
    public void setDtstart(Dtstart value) {
        this.dtstart = value;
    }

    /**
     * duration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDuration() {
        return duration;
    }

    /**
     * duration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDuration(DurationPropType value) {
        this.duration = value;
    }

    /**
     * tolerance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Tolerance }
     *     
     */
    public Tolerance getTolerance() {
        return tolerance;
    }

    /**
     * tolerance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Tolerance }
     *     
     */
    public void setTolerance(Tolerance value) {
        this.tolerance = value;
    }

    /**
     * xEiNotification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiNotification() {
        return xEiNotification;
    }

    /**
     * xEiNotification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiNotification(DurationPropType value) {
        this.xEiNotification = value;
    }

    /**
     * xEiRampUp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiRampUp() {
        return xEiRampUp;
    }

    /**
     * xEiRampUp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiRampUp(DurationPropType value) {
        this.xEiRampUp = value;
    }

    /**
     * xEiRecovery 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getXEiRecovery() {
        return xEiRecovery;
    }

    /**
     * xEiRecovery 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setXEiRecovery(DurationPropType value) {
        this.xEiRecovery = value;
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
     *         &lt;element name="tolerate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
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
        "tolerate"
    })
    public static class Tolerance {

        @XmlElement(required = true)
        protected Tolerate tolerate;

        /**
         * tolerate 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link Tolerate }
         *     
         */
        public Tolerate getTolerate() {
            return tolerate;
        }

        /**
         * tolerate 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link Tolerate }
         *     
         */
        public void setTolerate(Tolerate value) {
            this.tolerate = value;
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
         *         &lt;element name="startafter" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
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
            "startafter"
        })
        public static class Tolerate {

            protected String startafter;

            /**
             * startafter 속성의 값을 가져옵니다.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStartafter() {
                return startafter;
            }

            /**
             * startafter 속성의 값을 설정합니다.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStartafter(String value) {
                this.startafter = value;
            }

        }

    }

}
