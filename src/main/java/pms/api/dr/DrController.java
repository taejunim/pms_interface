package pms.api.dr;

import com.avob.openadr.model.oadr20b.Oadr20bFactory;
import com.avob.openadr.model.oadr20b.Oadr20bUrlPath;
import com.avob.openadr.model.oadr20b.builders.*;
import com.avob.openadr.model.oadr20b.ei.*;
import com.avob.openadr.model.oadr20b.exception.Oadr20bException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bHttpLayerException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bXMLSignatureException;
import com.avob.openadr.model.oadr20b.exception.Oadr20bXMLSignatureValidationException;
import com.avob.openadr.model.oadr20b.oadr.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pms.PmsInterfaceApplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static pms.api.dr.DrConstants.*;

@Controller
public class DrController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    PmsInterfaceApplication app = new PmsInterfaceApplication();

    @RequestMapping("/sslTest")
    private void sslTest() {

        try {
            String requestID = "queryRegistration_" + UUID.randomUUID();
            OadrQueryRegistrationType oadrQueryRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bQueryRegistrationBuilder(requestID).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrQueryRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            logger.info("---------------------------------------------------");
            logger.info(" [ OadrQueryRegistration ] ");
            logger.info("VTN ->");
            logger.info(String.valueOf(oadrPayload));
            logger.info("---------------------------------------------------");
        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/createPartyRegistration")
    private void createPartyRegistration() {

        try {
            OadrCreatePartyRegistrationType oadrCreatePartyRegistrationType = Oadr20bEiRegisterPartyBuilders
                    .newOadr20bCreatePartyRegistrationBuilder(DR_CREATE_PARTY_REGISTRATION_ID + UUID.randomUUID(), "", DR_PROFILE_NAME)
                    .withOadrHttpPullModel(DR_HTTP_PULL_MODEL)
                    .withOadrReportOnly(DR_REPORT_ONLY)
                    .withOadrTransportName(OadrTransportType.SIMPLE_HTTP)
                    .withOadrVenName(DR_VEN_NAME)
                    .withOadrXmlSignature(DR_XML_SIGNATURE)
                    .build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCreatePartyRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            logger.info("---------------------------------------------------");
            logger.info(" [ createPartyRegistration ] ");
            logger.info("VTN ->");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getEiResponse().getResponseDescription());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getEiResponse().getRequestID());
            logger.info("RegistrationID : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getRegistrationID());
            logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getVenID());
            logger.info("VtnID : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getVtnID());
            logger.info("OadrProfileName : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getOadrProfiles().getOadrProfile().get(0).getOadrProfileName());
            logger.info("OadrTransportName : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getOadrProfiles().getOadrProfile().get(0)
                    .getOadrTransports().getOadrTransport().get(0).getOadrTransportName());
            logger.info("Duration : " + oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getOadrRequestedOadrPollFreq().getDuration());
            logger.info("---------------------------------------------------");

            /**
            * DB 에 venID Update 로직 구현할 것
            */

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/cancelRegistration")
    private void cancelRegistration() {

        try {
            String registrationID = "gwRegId_c0487132-4115-461b-a18b-3a4f43bd518e";
            String venID = "gwVenId_4b9123eb-ea42-4a8e-ade0-966a4398bc6d";

            OadrCancelPartyRegistrationType oadrCancelPartyRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bCancelPartyRegistrationBuilder(
                    DR_CANCEL_PARTY_REGISTRATION_ID + UUID.randomUUID(), registrationID, venID).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCancelPartyRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            logger.info("---------------------------------------------------");
            logger.info(" [ OadrCancelPartyRegistration ] ");
            logger.info("VTN ->");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseDescription());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getRequestID());
            logger.info("RegistrationID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getRegistrationID());
            logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getVenID());
            logger.info("---------------------------------------------------");
        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }


    @RequestMapping("/registerReport")
    private void registerReport() {

        try {
            String venID = "gwVenId_91931fd7-e426-48bf-9b9c-07377940079c";

            OadrReportType build = Oadr20bEiReportBuilders.newOadr20bRegisterReportOadrReportBuilder(DR_REPORT_SPECIFIER_ID, ReportNameEnumeratedType.METADATA_TELEMETRY_USAGE, System.currentTimeMillis())
                    .addReportDescription(Oadr20bEiReportBuilders
                            .newOadr20bOadrReportDescriptionBuilder(DR_R_ID_PLUS_DR, ReportEnumeratedType.USAGE, ReadingTypeEnumeratedType.DIRECT_READ)
                            .withEnergyRealBase(null)
                            .withDataSource(Oadr20bEiBuilders.newOadr20bEiTargetTypeBuilder().addResourceId(DR_RESOURCE_ID).build())
                            .withOadrSamplingRate(DR_MIN_PERIOD, DR_MAX_PERIOD, false).withMarketContext(DR_MARKET_CONTEXT).build())
                    .withDuration(DR_REPORT_DURATION).build();

            OadrRegisterReportType oadrRegisterReportType = Oadr20bEiReportBuilders.newOadr20bRegisterReportBuilder(DR_REGISTER_REPORT_ID + UUID.randomUUID(), venID).addOadrReport(build).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrRegisterReportType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            logger.info("---------------------------------------------------");
            logger.info(" [ OadrRegisterReport ] ");
            logger.info("VTN ->");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseDescription());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getRequestID());

            List<OadrReportRequestType> oadrReportRequestTypeList = oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest();

            List<String> reportRequestIDList = new ArrayList<String>();

            for (int i=0; i<oadrReportRequestTypeList.size(); i++) {
                logger.info("-------------------- "+ (i+1) +" ----------------------------");
                logger.info("ReportRequestID : " + oadrReportRequestTypeList.get(i).getReportRequestID());
                logger.info("ReportSpecifierID : " + oadrReportRequestTypeList.get(i).getReportSpecifier().getReportSpecifierID());
                logger.info("getGranularity().getDuration() : " + oadrReportRequestTypeList.get(i).getReportSpecifier().getGranularity().getDuration());
                logger.info("getReportBackDuration().getDuration() : " + oadrReportRequestTypeList.get(i).getReportSpecifier().getReportBackDuration().getDuration());
                logger.info("getReportInterval().getProperties().getDtstart().getDateTime() : " + oadrReportRequestTypeList.get(i).getReportSpecifier().getReportInterval().getProperties().getDtstart().getDateTime());
                logger.info("getReportInterval().getProperties().getDuration().getDuration() : " + oadrReportRequestTypeList.get(i).getReportSpecifier().getReportInterval().getProperties().getDuration().getDuration());

                List<SpecifierPayloadType> specifierPayloadTypeList = oadrReportRequestTypeList.get(i).getReportSpecifier().getSpecifierPayload();

                for (int j=0; j<specifierPayloadTypeList.size(); j++) {
                    logger.info("RID : " + specifierPayloadTypeList.get(j).getRID());
                    logger.info("ReadingType : " + specifierPayloadTypeList.get(j).getReadingType());
                }

                reportRequestIDList.add(oadrReportRequestTypeList.get(i).getReportRequestID());

                logger.info("---------------------------------------------------");
            }

            logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getVenID());
            logger.info("---------------------------------------------------");

            //oadrCreatedReport Message 송신
            //금회에 수신한 내용을 포함한 VEN 상에 관리되고 있는 모든 Report Request ID
            if (oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS) && reportRequestIDList.size() > 0) {
                OadrCreatedReportType oadrCreatedReportType = Oadr20bEiReportBuilders.newOadr20bCreatedReportBuilder(String.valueOf(UUID.randomUUID()), Integer.parseInt(DR_CODE_SUCCESS), venID)
                        .addPendingReportRequestId(reportRequestIDList).build();

                OadrPayload oadrCreatedReportData = Oadr20bFactory.createOadrPayload("", oadrCreatedReportType);

                OadrPayload oadrPayloadResponse = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(oadrCreatedReportData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

                if (oadrPayloadResponse.getOadrSignedObject().getOadrResponse().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {
                    logger.info(" [ CreatedReport 완료 ] ");

                    /**
                     * DB 에 report Data 를 delete 후 insert 로직 구현할 것
                     */

                } else {
                    logger.info(" [ CreatedReport 실패 ] ");
                }

            } else {
                logger.info(" [ CreatedReport 실패 ] ");
            }

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }

    }

    @RequestMapping("/updateReport")
    private void updateReport() {

        try {

            ReportNameEnumeratedType reportName = ReportNameEnumeratedType.TELEMETRY_USAGE;
            long createdTimestamp = System.currentTimeMillis();
            String intervalId = "0";

            //Long dtStart = Long.valueOf(simpleDateFormat.format(new Date()));
            Long dtStart = System.currentTimeMillis();
            Long confidence = Long.valueOf(100);
            Float accuracy = 0.0F;
            Float value = 100.0F;

            OadrReportType reportUpdate = Oadr20bEiReportBuilders
                    .newOadr20bUpdateReportOadrReportBuilder(DR_REPORT_ID + UUID.randomUUID(), DR_REPORT_SPECIFIER_ID, DR_REPORT_REQUEST_ID + UUID.randomUUID(), reportName,
                            createdTimestamp, Long.valueOf(dtStart), null)
                    .addInterval(Oadr20bEiBuilders.newOadr20bReportIntervalTypeBuilder(intervalId, dtStart, DR_PT15M, DR_R_ID_PLUS_DR,confidence, accuracy, value).build())
                    .build();

            //OadrUpdateReportType oadrUpdateReportType = Oadr20bEiReportBuilders.newOadr20bUpdateReportBuilder(DR_REQUEST_ID, DR_VEN_ID).addReport(reportUpdate).build();
            OadrUpdateReportType oadrUpdateReportType = Oadr20bEiReportBuilders.newOadr20bUpdateReportBuilder(DR_UPDATE_REPORT_ID + UUID.randomUUID(), DR_VEN_ID).addReport(reportUpdate).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrUpdateReportType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);


            logger.info("---------------------------------------------------");
            logger.info(" [ updateReport ] ");
            logger.info("VTN ->");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseDescription());
            logger.info("getReportRequestID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest().get(0).getReportRequestID());
            logger.info("getReportSpecifierID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest().get(0).getReportSpecifier().getReportSpecifierID());
            logger.info("getGranularity().getDuration() : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest().get(0).getReportSpecifier().getGranularity().getDuration());
            logger.info("getReportBackDuration().getDuration() : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest().get(0).getReportSpecifier().getReportBackDuration().getDuration());
            logger.info("getDuration : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest().get(0).getReportSpecifier().getReportBackDuration().getDuration());


            logger.info("---------------------------------------------------");
        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }

    //주기적으로 DR Event 폴링 - 최소 30초
    @Scheduled(cron="0/60 * * * * *")
    @RequestMapping("/oadrPoll")
    public void oadrPoll() {
        logger.info("[ oadrPoll Start - " + simpleDateFormat.format(new Date()) + " ]");

        try {

            String venID = "gwVenId_91931fd7-e426-48bf-9b9c-07377940079c";

            OadrPollType oadrPollType = Oadr20bPollBuilders.newOadr20bPollBuilder(venID).withSchemaVersion(DR_SCHEMA_VERSION).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrPollType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.OADR_POLL_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            parseEvent(oadrPayload);

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/oadrRequestEvent")
    public void oadrRequestEvent() {
        logger.info("[ oadrRequestEvent Call - " + simpleDateFormat.format(new Date()) + " ]");

        try {

            String venID = "gwVenId_91931fd7-e426-48bf-9b9c-07377940079c";

            OadrRequestEventType oadrRequestEvent = Oadr20bEiEventBuilders.newOadrRequestEventBuilder(venID,"").build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrRequestEvent);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_EVENT_SERVICE, com.avob.openadr.model.oadr20b.oadr.OadrPayload.class);

            parseEvent(oadrPayload);

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        }
    }

    private void parseEvent(OadrPayload oadrPayload) {
        logger.info("---------------------------------------------------");
        logger.info("VTN ->");

        if (oadrPayload.getOadrSignedObject().getOadrDistributeEvent() != null) {
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseDescription());
            logger.info("EiResponse().getRequestID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getRequestID());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getRequestID());
            logger.info("VtnID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getVtnID());

            List<OadrDistributeEventType.OadrEvent> oadrEventList = oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getOadrEvent();

            for (int i=0; i<oadrEventList.size(); i++) {
                logger.info("-------------------- "+ (i+1) +" ----------------------------");
                logger.info("EventID : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventID());
                logger.info("ModificationNumber : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationNumber());
                if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationDateTime() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationDateTime().equals(""))
                    logger.info("ModificationDateTime : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationDateTime());
                if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationReason() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationReason().equals(""))
                    logger.info("ModificationReason : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationReason());
                if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getPriority() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getPriority().equals(""))
                    logger.info("Priority : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getPriority());
                logger.info("MarketContext : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getEiMarketContext().getMarketContext());
                logger.info("CreatedDateTime : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getCreatedDateTime());
                logger.info("EventStatus : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventStatus());
                logger.info("TestEvent : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getTestEvent());
                if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment().equals(""))
                    logger.info("VtnComment : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment());
                logger.info("Properties().getDtstart().getDateTime() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDtstart().getDateTime());
                logger.info("Properties().getDuration().getDuration() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDuration().getDuration());
                if (oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getTolerance() != null
                        && !oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getTolerance().equals(""))
                    logger.info("Properties().getTolerance().getTolerate().getStartafter() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getTolerance().getTolerate().getStartafter());
                if (oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiNotification() != null
                        && !oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiNotification().equals(""))
                    logger.info("Properties().getXEiNotification().getDuration() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiNotification().getDuration());
                if (oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRampUp() != null
                        && !oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRampUp().equals(""))
                    logger.info("Properties().getXEiRampUp().getDuration() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRampUp().getDuration());
                if (oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRecovery() != null
                        && !oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRecovery().equals(""))
                    logger.info("Properties().getXEiRecovery().getDuration() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getXEiRecovery().getDuration());

                List<EiEventSignalType> eiEventSignalTypeList = oadrEventList.get(i).getEiEvent().getEiEventSignals().getEiEventSignal();

                for (int j=0; j<eiEventSignalTypeList.size(); j++) {

                    //Interval
                    List<IntervalType> intervalTypeList = eiEventSignalTypeList.get(j).getIntervals().getInterval();
                    for (int k=0; k<intervalTypeList.size(); k++) {

                        if (intervalTypeList.get(k).getDtstart() != null && !intervalTypeList.get(k).getDtstart().equals(""))
                            logger.info("intervalTypeList.get(k).getDtstart().getDateTime() : " + intervalTypeList.get(k).getDtstart().getDateTime());
                        logger.info("intervalTypeList.get(k).getDuration().getDuration() : " + intervalTypeList.get(k).getDuration().getDuration());
                        logger.info("intervalTypeList.get(k).getUid() : " + intervalTypeList.get(k).getUid().getText());

                        SignalPayloadType signalPayloadType = (SignalPayloadType) intervalTypeList.get(k).getStreamPayloadBase().get(0).getValue();
                        PayloadFloatType payloadFloatType = (PayloadFloatType) signalPayloadType.getPayloadBase().getValue();

                        logger.info("Value : " + payloadFloatType.getValue());
                    }

                    logger.info("eiEventSignalTypeList.get(j).getSignalName() : " + eiEventSignalTypeList.get(j).getSignalName());
                    logger.info("eiEventSignalTypeList.get(j).getSignalType() : " + eiEventSignalTypeList.get(j).getSignalType());
                    logger.info("eiEventSignalTypeList.get(j).getSignalID() : " + eiEventSignalTypeList.get(j).getSignalID());
                    logger.info("eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue() : " + eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue());
                }

                if (oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID() != null && oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID().size() > 0) {
                    List<String> groupIDList = oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID();

                    for (int m=0; m<groupIDList.size(); m++) {
                        logger.info("groupID - " + m + " : " + groupIDList.get(m));
                    }
                }

                if (oadrEventList.get(i).getEiEvent().getEiTarget().getVenID() != null && oadrEventList.get(i).getEiEvent().getEiTarget().getVenID().size() > 0) {
                    List<String> venIDList = oadrEventList.get(i).getEiEvent().getEiTarget().getVenID();

                    for (int m=0; m<venIDList.size(); m++) {
                        logger.info("venID - " + m + " : " + venIDList.get(m));
                    }
                }

                logger.info("OadrResponseRequired : " + oadrEventList.get(i).getOadrResponseRequired());
            }
        }

        //DR Event 없음
        else {
            logger.info(" [ DR Event 없음 ] ");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrResponse().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrResponse().getEiResponse().getResponseDescription());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrResponse().getEiResponse().getRequestID());
            logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrResponse().getVenID());
        }

        logger.info("---------------------------------------------------");
    }

    private void oadrCreatedEvent() {

        //OadrCreatedEventType oadrCreatedEventType = Oadr20bEiEventBuilders.newOadr20bCreatedEventEventResponseBuilder().build();
    }
}
