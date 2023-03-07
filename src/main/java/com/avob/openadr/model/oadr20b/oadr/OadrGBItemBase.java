//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.oadr;

import com.avob.openadr.model.oadr20b.atom.FeedType;
import com.avob.openadr.model.oadr20b.emix.ItemBaseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>oadrGBItemBase complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="oadrGBItemBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}ItemBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}feed"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oadrGBItemBase", propOrder = {
    "feed"
})
public class OadrGBItemBase
    extends ItemBaseType
{

    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected FeedType feed;

    /**
     * feed 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FeedType }
     *     
     */
    public FeedType getFeed() {
        return feed;
    }

    /**
     * feed 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedType }
     *     
     */
    public void setFeed(FeedType value) {
        this.feed = value;
    }

}
