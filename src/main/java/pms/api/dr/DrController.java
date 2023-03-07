package pms.api.dr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import pms.api.dr.service.vo.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class DrController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final ClassLoader classLoader = this.getClass().getClassLoader();

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    @RequestMapping("/oadrQueryRegistration")
    public String oadrQueryRegistration() {

        System.out.println("[ START - oadrQueryRegistration ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrQueryRegistration oadrQueryRegistration = new OadrQueryRegistration();

        oadrQueryRegistration.setRequestID("Req_12345");

        oadrSignedObject.setOadrQueryRegistration(oadrQueryRegistration);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrQueryRegistration");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");

        for(int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            System.out.println("Current Element :" + item.getNodeName());
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                System.out.println("schemaVersion : " + eElement.getElementsByTagName("oadrCreatedPartyRegistration").item(0).getAttributes().item(0).getNodeValue().trim());
                System.out.println("responseCode : " + eElement.getElementsByTagName("responseCode").item(0).getTextContent().trim());
                System.out.println("responseDescription : " + eElement.getElementsByTagName("responseDescription").item(0).getTextContent().trim());
                System.out.println("requestID : " + eElement.getElementsByTagName("requestID").item(0).getTextContent().trim());
                System.out.println("vtnID : " + eElement.getElementsByTagName("vtnID").item(0).getTextContent().trim());
                System.out.println("oadrProfileName : " + eElement.getElementsByTagName("oadrProfileName").item(0).getTextContent().trim());
                System.out.println("oadrTransportName : " + eElement.getElementsByTagName("oadrTransportName").item(0).getTextContent().trim());
                System.out.println("duration : " + eElement.getElementsByTagName("duration").item(0).getTextContent().trim());
            }
        }

        System.out.println("[ END - oadrQueryRegistration ]");

        return "home";
    }

    @RequestMapping("/oadrCreatePartyRegistration")
    public String oadrCreatePartyRegistration() {

        System.out.println("[ START - oadrCreatePartyRegistration ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrCreatePartyRegistration oadrCreatePartyRegistration = new OadrCreatePartyRegistration();

        oadrCreatePartyRegistration.setRequestID("metis_" + simpleDateFormat.format(new Date()));
        oadrCreatePartyRegistration.setOadrProfileName("2.0b");
        oadrCreatePartyRegistration.setOadrTransportName("simpleHttp");
        oadrCreatePartyRegistration.setOadrTransportAddress("");
        oadrCreatePartyRegistration.setOadrReportOnly("false");
        oadrCreatePartyRegistration.setOadrXmlSignature("false");
        oadrCreatePartyRegistration.setOadrVenName("20200500002642");
        oadrCreatePartyRegistration.setOadrHttpPullModel("true");

        oadrSignedObject.setOadrCreatePartyRegistration(oadrCreatePartyRegistration);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrCreatePartyRegistration");;
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");

        for(int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            System.out.println("Current Element :" + item.getNodeName());
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                System.out.println("schemaVersion : " + eElement.getElementsByTagName("oadrCreatedPartyRegistration").item(0).getAttributes().item(0).getNodeValue().trim());
                System.out.println("responseCode : " + eElement.getElementsByTagName("responseCode").item(0).getTextContent().trim());
                System.out.println("responseDescription : " + eElement.getElementsByTagName("responseDescription").item(0).getTextContent().trim());
                System.out.println("requestID : " + eElement.getElementsByTagName("requestID").item(0).getTextContent().trim());
                System.out.println("vtnID : " + eElement.getElementsByTagName("vtnID").item(0).getTextContent().trim());
                System.out.println("oadrProfileName : " + eElement.getElementsByTagName("oadrProfileName").item(0).getTextContent().trim());
                System.out.println("oadrTransportName : " + eElement.getElementsByTagName("oadrTransportName").item(0).getTextContent().trim());
                System.out.println("duration : " + eElement.getElementsByTagName("duration").item(0).getTextContent().trim());
            }
        }

        System.out.println("[ END - oadrCreatePartyRegistration ]");

        return "home";
    }

    @RequestMapping("/oadrRegisterReport")
    public String oadrRegisterReport() {

        System.out.println("[ START - oadrRegisterReport ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrRegisterReport oadrRegisterReport = new OadrRegisterReport();
        OadrReport oadrReport = new OadrReport();
        Duration duration = new Duration();
        OadrReportDescription oadrReportDescription = new OadrReportDescription();
        ReportDataSource reportDataSource = new ReportDataSource();
        EnergyReal energyReal = new EnergyReal();
        OadrSamplingRate oadrSamplingRate = new OadrSamplingRate();

        oadrRegisterReport.setRequestID("REQ_20141100000722_0526182852_20201209150328");

        duration.setDuration("PT48000H");
        oadrReport.setDuration(duration);

        oadrReportDescription.setRID("0814111153");

        reportDataSource.setResourceID("KpxResource");
        oadrReportDescription.setReportDataSource(reportDataSource);

        oadrReportDescription.setReportType("usage");

        energyReal.setItemDescription("RealEnergy");
        energyReal.setItemUnits("Wh");
        energyReal.setSiScaleCode("k");
        oadrReportDescription.setEnergyReal(energyReal);

        oadrReportDescription.setReadingType("Direct Read");
        oadrReportDescription.setMarketContext("http://dras.kmos.kr");

        oadrSamplingRate.setOadrMinPeriod("PT1M");
        oadrSamplingRate.setOadrMaxPeriod("PT5M");
        oadrSamplingRate.setOadrOnChange("false");
        oadrReportDescription.setOadrSamplingRate(oadrSamplingRate);

        oadrReport.setOadrReportDescription(oadrReportDescription);
        oadrReport.setReportRequestID("0");
        oadrReport.setReportSpecifierID("KPX_TU");
        oadrReport.setReportName("METADATA_TELEMETRY_USAGE");
        oadrReport.setCreatedDateTime(simpleDateFormat.format(new Date()));

        oadrRegisterReport.setOadrReport(oadrReport);
        oadrRegisterReport.setVenID("20200500002642");

        oadrSignedObject.setOadrRegisterReport(oadrRegisterReport);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrRegisterReport");;
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");

        for(int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            System.out.println("Current Element : " + item.getNodeName() + " / i : " + i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                System.out.println("schemaVersion : " + eElement.getElementsByTagName("oadrRegisteredReport").item(0).getAttributes().item(0).getNodeValue().trim());
                System.out.println("responseCode : " + eElement.getElementsByTagName("responseCode").item(0).getTextContent().trim());
                System.out.println("responseDescription : " + eElement.getElementsByTagName("responseDescription").item(0).getTextContent().trim());
                System.out.println("requestID : " + eElement.getElementsByTagName("requestID").item(0).getTextContent().trim());
                System.out.println("reportRequestID : " + eElement.getElementsByTagName("reportRequestID").item(0).getTextContent().trim());
                System.out.println("reportSpecifierID : " + eElement.getElementsByTagName("reportSpecifierID").item(0).getTextContent().trim());

                Node granularity = eElement.getElementsByTagName("granularity").item(0);
                System.out.println("granularity - duration: " + ((Element) granularity).getElementsByTagName("duration").item(0).getTextContent().trim());

                Node reportBackDuration = eElement.getElementsByTagName("reportBackDuration").item(0);
                System.out.println("reportBackDuration - duration: " + ((Element) reportBackDuration).getElementsByTagName("duration").item(0).getTextContent().trim());

                Node reportInterval = eElement.getElementsByTagName("reportInterval").item(0);
                System.out.println("reportInterval - dtstart: " + ((Element) reportInterval).getElementsByTagName("dtstart").item(0).getTextContent().trim());
                System.out.println("reportInterval - duration: " + ((Element) reportInterval).getElementsByTagName("duration").item(0).getTextContent().trim());

                System.out.println("rID : " + eElement.getElementsByTagName("rID").item(0).getTextContent().trim());
                System.out.println("readingType : " + eElement.getElementsByTagName("readingType").item(0).getTextContent().trim());
                System.out.println("venID : " + eElement.getElementsByTagName("venID").item(0).getTextContent().trim());
            }
        }

        System.out.println("[ END - oadrRegisterReport ]");

        return "home";
    }

    @RequestMapping("/oadrCreatedReport")
    public String oadrCreatedReport() {

        System.out.println("[ START - oadrCreatedReport ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrCreatedReport oadrCreatedReport = new OadrCreatedReport();
        EiResponse eiResponse = new EiResponse();
        OadrPendingReports oadrPendingReports = new OadrPendingReports();

        eiResponse.setResponseCode("200");
        eiResponse.setResponseDescription("OK");
        eiResponse.setRequestID("Req_12345");
        oadrCreatedReport.setEiResponse(eiResponse);

        ArrayList<String> reportRequestIDList = new ArrayList<>();
        reportRequestIDList.add("repReq_a57987b9-9849-4dc2-b34e-d74a552e6633");
        reportRequestIDList.add("repReq_41af6f5a-056c-44e7-aade-681d087ab515");
        oadrPendingReports.setReportRequestID(reportRequestIDList);
        oadrCreatedReport.setOadrPendingReports(oadrPendingReports);

        oadrSignedObject.setOadrCreatedReport(oadrCreatedReport);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrCreatedReport");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");
        System.out.println("[ END - oadrCreatedReport ]");

        return "home";
    }

    @RequestMapping("/oadrUpdateReport")
    public String oadrUpdateReport() {

        System.out.println("[ START - oadrUpdateReport ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();

        OadrUpdateReport oadrUpdateReport = new OadrUpdateReport();
        OadrReport oadrReport = new OadrReport();
        Dtstart dtstart = new Dtstart();
        Intervals intervals = new Intervals();
        Interval interval = new Interval();
        Duration duration = new Duration();
        Uid uid = new Uid();
        OadrReportPayload oadrReportPayload = new OadrReportPayload();
        PayloadFloat payloadFloat = new PayloadFloat();

        oadrUpdateReport.setRequestID("REQ_12345");

        String dateTime = simpleDateFormat.format(new Date());

        dtstart.setDateTime(dateTime);
        oadrReport.setDtstart(dtstart);

        interval.setDtstart(dtstart);

        duration.setDuration("PT15M");
        interval.setDuration(duration);

        uid.setText("0");
        interval.setUid(uid);

        oadrReportPayload.setRID("rID_01");
        oadrReportPayload.setConfidence("100");
        oadrReportPayload.setAccuracy("0");

        payloadFloat.setValue("97");
        oadrReportPayload.setPayloadFloat(payloadFloat);

        oadrReportPayload.setOadrDataQuality("Quality Good - Non Specific");

        interval.setOadrReportPayload(oadrReportPayload);

        intervals.setInterval(interval);

        oadrReport.setIntervals(intervals);
        oadrReport.setEiReportID("610aad43-6226-4766-92ba-6f3084b7e695");
        oadrReport.setReportRequestID("repReq_2ab9bea3-1692-464b-a8e5-c1e0217057e9");
        oadrReport.setReportSpecifierID("KPX_TU");
        oadrReport.setReportName("TELEMETRY_USAGE");
        oadrReport.setCreatedDateTime(dateTime);

        oadrUpdateReport.setOadrReport(oadrReport);
        oadrUpdateReport.setVenID("adsf");

        oadrSignedObject.setOadrUpdateReport(oadrUpdateReport);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrUpdateReport");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");
        System.out.println("[ END - oadrUpdateReport ]");

        return "home";
    }

    @RequestMapping("/oadrRequestEvent")
    public String oadrRequestEvent() {

        System.out.println("[ START - oadrRequestEvent ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrRequestEvent oadrRequestEvent = new OadrRequestEvent();
        EiRequestEvent eiRequestEvent = new EiRequestEvent();

        eiRequestEvent.setRequestID("REQ_12345");
        eiRequestEvent.setVenID("adsf");

        oadrRequestEvent.setEiRequestEvent(eiRequestEvent);
        oadrSignedObject.setOadrRequestEvent(oadrRequestEvent);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrRequestEvent");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");

        for(int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            System.out.println("Current Element : " + item.getNodeName() + " / i : " + i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) item;
                System.out.println("schemaVersion : " + eElement.getElementsByTagName("oadrDistributeEvent").item(0).getAttributes().item(0).getNodeValue().trim());

                Node eiResponse = eElement.getElementsByTagName("eiResponse").item(0);
                System.out.println("eiResponse - responseCode: " + ((Element) eiResponse).getElementsByTagName("responseCode").item(0).getTextContent().trim());
                System.out.println("eiResponse - responseDescription: " + ((Element) eiResponse).getElementsByTagName("responseDescription").item(0).getTextContent().trim());
                System.out.println("eiResponse - requestID: " + ((Element) eiResponse).getElementsByTagName("requestID").item(0).getAttributes().item(0).getNodeValue().trim());

                System.out.println("requestID : " + eElement.getElementsByTagName("requestID").item(1).getTextContent().trim());
                System.out.println("vtnID : " + eElement.getElementsByTagName("vtnID").item(0).getTextContent().trim());

                Node eventDescriptor = eElement.getElementsByTagName("eventDescriptor").item(0);
                System.out.println("eventDescriptor - eventID: " + ((Element) eventDescriptor).getElementsByTagName("eventID").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - modificationNumber: " + ((Element) eventDescriptor).getElementsByTagName("modificationNumber").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - modificationDateTime: " + ((Element) eventDescriptor).getElementsByTagName("modificationDateTime").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - modificationReason: " + ((Element) eventDescriptor).getElementsByTagName("modificationReason").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - priority: " + ((Element) eventDescriptor).getElementsByTagName("priority").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - marketContext: " + ((Element) eventDescriptor).getElementsByTagName("marketContext").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - createdDateTime: " + ((Element) eventDescriptor).getElementsByTagName("createdDateTime").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - eventStatus: " + ((Element) eventDescriptor).getElementsByTagName("eventStatus").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - testEvent: " + ((Element) eventDescriptor).getElementsByTagName("testEvent").item(0).getTextContent().trim());
                System.out.println("eventDescriptor - vtnComment: " + ((Element) eventDescriptor).getElementsByTagName("vtnComment").item(0).getTextContent().trim());

                Node properties = eElement.getElementsByTagName("properties").item(0);

                System.out.println("properties - date-time: " + ((Element) properties).getElementsByTagName("date-time").item(0).getTextContent().trim());

                Node propertiesDuration = ((Element) properties).getElementsByTagName("duration").item(0);
                System.out.println("properties - duration: " + ((Element) propertiesDuration).getElementsByTagName("duration").item(0).getTextContent().trim());

                System.out.println("startafter : " + eElement.getElementsByTagName("startafter").item(0).getTextContent().trim());

                Node xEiNotification = eElement.getElementsByTagName("x-eiNotification").item(0);
                System.out.println("xEiNotification - duration: " + ((Element) xEiNotification).getElementsByTagName("duration").item(0).getTextContent().trim());

                Node xEiRampUp = eElement.getElementsByTagName("x-eiRampUp").item(0);
                System.out.println("xEiRampUp - duration: " + ((Element) xEiRampUp).getElementsByTagName("duration").item(0).getTextContent().trim());

                Node xEiRecovery = eElement.getElementsByTagName("x-eiRecovery").item(0);
                System.out.println("xEiRecovery - duration: " + ((Element) xEiRecovery).getElementsByTagName("duration").item(0).getTextContent().trim());

                NodeList intervalList = eElement.getElementsByTagName("interval");

                for (int j=0; j<intervalList.getLength(); j++) {
                    Node node = intervalList.item(j);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element interval = (Element) node;

                        System.out.println("interval date-time : " + interval.getElementsByTagName("date-time").item(0).getTextContent().trim());
                        System.out.println("interval duration : " + interval.getElementsByTagName("duration").item(0).getTextContent().trim());
                        System.out.println("interval text : " + interval.getElementsByTagName("text").item(0).getTextContent().trim());
                        System.out.println("interval value : " + interval.getElementsByTagName("value").item(0).getTextContent().trim());
                    }
                }

                System.out.println("signalName : " + eElement.getElementsByTagName("signalName").item(0).getTextContent().trim());
                System.out.println("signalType : " + eElement.getElementsByTagName("signalType").item(0).getTextContent().trim());
                System.out.println("signalID : " + eElement.getElementsByTagName("signalID").item(0).getTextContent().trim());
                System.out.println("currentValue : " + eElement.getElementsByTagName("currentValue").item(0).getTextContent().trim());
                System.out.println("venID : " + eElement.getElementsByTagName("venID").item(0).getTextContent().trim());
                System.out.println("oadrResponseRequired : " + eElement.getElementsByTagName("oadrResponseRequired").item(0).getTextContent().trim());
            }
        }

        System.out.println("[ END - oadrRequestEvent ]");

        return "home";
    }

    @RequestMapping("/oadrCreatedEvent")
    public String oadrCreatedEvent() {

        System.out.println("[ START - oadrCreatedEvent ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrCreatedEvent oadrCreatedEvent = new OadrCreatedEvent();
        EiCreatedEvent eiCreatedEvent = new EiCreatedEvent();
        EiResponse eiResponse = new EiResponse();
        EventResponses eventResponses = new EventResponses();
        EventResponse eventResponse = new EventResponse();
        QualifiedEventID qualifiedEventID = new QualifiedEventID();

        eiResponse.setResponseCode("200");
        eiResponse.setRequestID("");
        eiCreatedEvent.setEiResponse(eiResponse);

        eventResponse.setResponseCode("200");
        eventResponse.setRequestID("req_24680");

        qualifiedEventID.setEventID("evt_12345");
        qualifiedEventID.setModificationNumber("0");
        eventResponse.setQualifiedEventID(qualifiedEventID);
        eventResponse.setOptType("optIn");

        eventResponses.setEventResponse(eventResponse);

        eiCreatedEvent.setEventResponses(eventResponses);
        eiCreatedEvent.setVenID("Licensee_VEN_12345");

        oadrCreatedEvent.setEiCreatedEvent(eiCreatedEvent);

        oadrSignedObject.setOadrCreatedEvent(oadrCreatedEvent);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrCreatedEvent");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");
        System.out.println("[ END - oadrCreatedEvent ]");

        return "home";
    }

    @RequestMapping("/oadrPoll")
    public String oadrPoll() {

        System.out.println("[ START - oadrPoll ]");

        OadrPayload oadrPayload = new OadrPayload();
        OadrSignedObject oadrSignedObject = new OadrSignedObject();
        OadrPoll oadrPoll = new OadrPoll();

        oadrPoll.setVenID("Licensee_VEN_12345");

        oadrSignedObject.setOadrPoll(oadrPoll);

        oadrPayload.setOadrSignedObject(oadrSignedObject);

        // xml 파일을 document로 파싱하기
        Document document = getResponseData(oadrPayload, "oadrPoll");
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("oadrPayload");

        System.out.println("-----------------------------------------");
        System.out.println("[ END - oadrPoll ]");

        return "home";
    }

    private Document getResponseData(Object object, String apiItem) {

        Document document = null;

        return document;
    }

    @RequestMapping("/sslTest")
    private void sslTest() {

        SSLTest sslTest = new SSLTest();
        sslTest.test();

    }

}
