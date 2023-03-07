//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2023.02.24 시간 11:31:02 PM KST 
//


package com.avob.openadr.model.oadr20b.iso;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ISO3AlphaCurrencyCodeContentType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="ISO3AlphaCurrencyCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BOV"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CHW"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CUC"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EEK"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GWP"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MXV"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TMT"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="USN"/>
 *     &lt;enumeration value="USS"/>
 *     &lt;enumeration value="UYI"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XAG"/>
 *     &lt;enumeration value="XAU"/>
 *     &lt;enumeration value="XBA"/>
 *     &lt;enumeration value="XBB"/>
 *     &lt;enumeration value="XBC"/>
 *     &lt;enumeration value="XBD"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="XFU"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XPD"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="XPT"/>
 *     &lt;enumeration value="XTS"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISO3AlphaCurrencyCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07")
@XmlEnum
public enum ISO3AlphaCurrencyCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UAE Dirham&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AED,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Afghani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AFN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lek&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ALL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Armenian Dram&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Netherlands Antillian Guilder&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ANG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kwanza&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AOA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Argentine Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ARS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Australian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AUD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Aruban Guilder&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AWG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Azerbaijanian Manat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    AZN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Convertible Marks&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BAM,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Barbados Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Taka&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BDT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bulgarian Lev&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BGN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bahraini Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BHD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Burundi Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BIF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bermudian Dollar (customarily known as Bermuda Dollar)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brunei Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Boliviano&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BOB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mvdol&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BOV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Brazilian Real&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BRL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bahamian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BSD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ngultrum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BTN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pula&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BWP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Belarussian Ruble&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BYR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Belize Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    BZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Canadian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Congolese Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CDF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;WIR Euro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Swiss Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;WIR Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CHW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unidades de fomento&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CLF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Chilean Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CLP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yuan Renminbi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CNY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Colombian Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    COP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unidad de Valor Real&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    COU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costa Rican Colon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CRC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Peso Convertible&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CUC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cuban Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CUP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cape Verde Escudo&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CVE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Czech Koruna&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CZK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Djibouti Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DJF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Danish Krone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DKK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dominican Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Algerian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    DZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kroon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EEK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Egyptian Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EGP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nakfa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ERN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ethiopian Birr&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ETB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Euro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    EUR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fiji Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    FJD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Falkland Islands Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    FKP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pound Sterling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GBP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lari&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GEL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cedi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GHS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gibraltar Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GIP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dalasi&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guinea Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GNF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quetzal&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GTQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guinea-Bissau Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GWP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guyana Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    GYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hong Kong Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HKD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lempira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HNL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Croatian Kuna&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HRK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gourde&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HTG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Forint&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    HUF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rupiah&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IDR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Israeli Sheqel&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ILS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indian Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    INR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iraqi Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IQD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iranian Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    IRR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Iceland Krona&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ISK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Jamaican Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JMD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Jordanian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JOD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yen&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    JPY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kenyan Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KES,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Som&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KGS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Riel&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KHR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Comoro Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KMF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;North Korean Won&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KPW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Won&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KRW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kuwaiti Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KWD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cayman Islands Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tenge&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    KZT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kip&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LAK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lebanese Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LBP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sri Lanka Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LKR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Liberian Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LRD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Loti&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LSL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lithuanian Litas&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LTL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Latvian Lats&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LVL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Libyan Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    LYD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Moroccan Dirham&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Moldovan Leu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MDL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Malagasy Ariary&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MGA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Denar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MKD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kyat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MMK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tugrik&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MNT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pataca&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ouguiya&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MRO,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mauritius Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MUR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rufiyaa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MVR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kwacha&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MWK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mexican Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MXN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mexican Unidad de Inversion (UDI)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MXV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Malaysian Ringgit&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MYR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Metical&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MZN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Namibia Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NAD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Naira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NGN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cordoba Oro&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NIO,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Norwegian Krone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NOK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nepalese Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NPR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Zealand Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    NZD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rial Omani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    OMR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Balboa&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PAB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Nuevo Sol&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PEN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Kina&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PGK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Philippine Peso&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PHP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pakistan Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PKR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zloty&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PLN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Guarani&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    PYG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Qatari Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    QAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Leu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RON,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Serbian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RSD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Russian Ruble&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RUB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rwanda Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    RWF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Saudi Riyal&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Solomon Islands Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Seychelles Rupee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SCR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sudanese Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SDG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Swedish Krona&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SEK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Singapore Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SGD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Saint Helena Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SHP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Leone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SLL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Somali Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SOS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Surinam Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SRD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dobra&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    STD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;El Salvador Colon&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SVC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Syrian Pound&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SYP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lilangeni&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    SZL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Baht&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    THB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Somoni&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TJS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Manat&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TMT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tunisian Dinar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pa'anga&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TOP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Turkish Lira&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TRY,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trinidad and Tobago Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TTD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;New Taiwan Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TWD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tanzanian Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    TZS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hryvnia&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UAH,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uganda Shilling&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UGX,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar (Next day)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;US Dollar (Same day)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    USS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uruguay Peso en Unidades Indexadas&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UYI,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Peso Uruguayo&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UYU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Uzbekistan Sum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    UZS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bolivar Fuerte&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VEF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Dong&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VND,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Vatu&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    VUV,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tala&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    WST,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFA Franc BEAC&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Silver&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Gold&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XAU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Bond Markets Units European Composite Unit (EURCO)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Monetary Unit (E.M.U.-6)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Unit of Account 9(E.U.A.-9)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;European Unit of Account 17(E.U.A.-17)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XBD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;East Caribbean Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XCD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;SDR&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XDR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UIC-Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XFU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFA Franc BCEAO †&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XOF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Palladium&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CFP Franc&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Platinum&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XPT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Codes specifically reserved for testing purposes&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XTS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The codes assigned for transactions where no currency is involved are:&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    XXX,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Yemeni Rial&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    YER,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rand&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZAR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zambian Kwacha&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZMK,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm5ISO42173A="urn:un:unece:uncefact:codelist:standard:5:ISO42173A:2010-04-07" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zimbabwe Dollar&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    ZWL;

    public String value() {
        return name();
    }

    public static ISO3AlphaCurrencyCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
