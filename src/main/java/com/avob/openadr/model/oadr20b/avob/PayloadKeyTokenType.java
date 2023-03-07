//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.avob;

import com.avob.openadr.model.oadr20b.ei.PayloadBaseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * This is the payload for report sending key-value
 * 				data
 * 			
 * 
 * <p>payloadKeyTokenType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="payloadKeyTokenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}PayloadBaseType">
 *       &lt;sequence>
 *         &lt;element name="tokens" type="{http://oadr.avob.com}keyTokenType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payloadKeyTokenType", propOrder = {
    "tokens"
})
public class PayloadKeyTokenType
    extends PayloadBaseType
{

    @XmlElement(required = true)
    protected List<KeyTokenType> tokens;

    /**
     * Gets the value of the tokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyTokenType }
     * 
     * 
     */
    public List<KeyTokenType> getTokens() {
        if (tokens == null) {
            tokens = new ArrayList<KeyTokenType>();
        }
        return this.tokens;
    }

}
