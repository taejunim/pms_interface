//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="oadrTransport" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
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
    "oadrTransport"
})
@XmlRootElement(name = "oadrTransports")
public class OadrTransports {

    @XmlElement(required = true)
    protected List<OadrTransport> oadrTransport;

    /**
     * Gets the value of the oadrTransport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oadrTransport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOadrTransport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OadrTransport }
     * 
     * 
     */
    public List<OadrTransport> getOadrTransport() {
        if (oadrTransport == null) {
            oadrTransport = new ArrayList<OadrTransport>();
        }
        return this.oadrTransport;
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
     *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrTransportName"/>
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
        "oadrTransportName"
    })
    public static class OadrTransport {

        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected OadrTransportType oadrTransportName;

        /**
         * oadrTransportName 속성의 값을 가져옵니다.
         * 
         * @return
         *     possible object is
         *     {@link OadrTransportType }
         *     
         */
        public OadrTransportType getOadrTransportName() {
            return oadrTransportName;
        }

        /**
         * oadrTransportName 속성의 값을 설정합니다.
         * 
         * @param value
         *     allowed object is
         *     {@link OadrTransportType }
         *     
         */
        public void setOadrTransportName(OadrTransportType value) {
            this.oadrTransportName = value;
        }

    }

}
