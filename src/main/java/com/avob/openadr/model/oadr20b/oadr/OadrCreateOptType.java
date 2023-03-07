//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.ei.EiOptType;
import com.avob.openadr.model.oadr20b.ei.EiTargetType;
import com.avob.openadr.model.oadr20b.ei.QualifiedEventIDType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>oadrCreateOptType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrCreateOptType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}EiOptType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110/payloads}requestID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiTarget"/>
 *         &lt;element ref="{http://openadr.org/oadr-2.0b/2012/07}oadrDeviceClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrCreateOptType", propOrder = {
    "requestID",
    "qualifiedEventID",
    "eiTarget",
    "oadrDeviceClass"
})
public class OadrCreateOptType
    extends EiOptType
{

    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110/payloads", required = true)
    protected String requestID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected QualifiedEventIDType qualifiedEventID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110", required = true)
    protected EiTargetType eiTarget;
    protected EiTargetType oadrDeviceClass;

    /**
     * requestID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * requestID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * qualifiedEventID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedEventIDType }
     *     
     */
    public QualifiedEventIDType getQualifiedEventID() {
        return qualifiedEventID;
    }

    /**
     * qualifiedEventID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedEventIDType }
     *     
     */
    public void setQualifiedEventID(QualifiedEventIDType value) {
        this.qualifiedEventID = value;
    }

    /**
     * eiTarget 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getEiTarget() {
        return eiTarget;
    }

    /**
     * eiTarget 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setEiTarget(EiTargetType value) {
        this.eiTarget = value;
    }

    /**
     * oadrDeviceClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EiTargetType }
     *     
     */
    public EiTargetType getOadrDeviceClass() {
        return oadrDeviceClass;
    }

    /**
     * oadrDeviceClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EiTargetType }
     *     
     */
    public void setOadrDeviceClass(EiTargetType value) {
        this.oadrDeviceClass = value;
    }

}
