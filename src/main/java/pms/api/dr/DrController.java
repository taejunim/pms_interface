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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pms.PmsInterfaceApplication;
import pms.api.dr.service.DrService;
import pms.api.dr.service.vo.DrBaseVO;
import pms.api.dr.service.vo.DrEventVO;
import pms.api.dr.service.vo.DrReportVO;

import java.text.SimpleDateFormat;
import java.util.*;

import static pms.api.dr.DrConstants.*;

@Controller
public class DrController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMAT_UTC);

    PmsInterfaceApplication app = new PmsInterfaceApplication();

    @Autowired
    DrService drService;

    @RequestMapping("/sslTest")
    private void sslTest() {

        try {
            String requestID = "queryRegistration_" + UUID.randomUUID();
            OadrQueryRegistrationType oadrQueryRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bQueryRegistrationBuilder(requestID).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrQueryRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);

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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/createPartyRegistration")
    private void createPartyRegistration() {

        try {
            getDrBase();

            OadrCreatePartyRegistrationType oadrCreatePartyRegistrationType = Oadr20bEiRegisterPartyBuilders
                    .newOadr20bCreatePartyRegistrationBuilder(DR_CREATE_PARTY_REGISTRATION_ID + UUID.randomUUID(), "", DR_SCHEMA_VERSION)
                    .withOadrHttpPullModel(DR_HTTP_PULL_MODEL)
                    .withOadrReportOnly(DR_REPORT_ONLY)
                    .withOadrTransportName(OadrTransportType.SIMPLE_HTTP)
                    .withOadrVenName(app.drBaseVO.getDrBusinessId())
                    .withOadrXmlSignature(DR_XML_SIGNATURE)
                    .build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCreatePartyRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);

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
            * DB 에 VEN 아이디, DR 등록 아이디 등록
            */
            if (oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

                DrBaseVO drBaseVO = new DrBaseVO();
                drBaseVO.setDrBusinessId(app.drBaseVO.getDrBusinessId());
                drBaseVO.setDrVenId(oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getVenID());
                drBaseVO.setDrRegistrationId(oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getRegistrationID());

                int createPartyRegistration = drService.createPartyRegistration(drBaseVO);

                if (createPartyRegistration > 0) {

                    logger.info(" [ DR 참여 등록 완료 ] ");

                    int registerReportCount = registerReport(drBaseVO, app.rIdList);

                    if (registerReportCount == app.rIdList.size()) {
                        logger.info(" [ DR 레포트 등록 완료 ] ");
                    } else {
                        logger.info(" [ DR 레포트 등록 오류 : 일부 등록 실패 ] ");
                    }

                } else {
                    logger.info(" [ DR 참여 등록 UPDATE 실패 ] ");
                }

            } else {
                logger.info(" [ DR 참여 등록 Error ] ");
            }

            getDrBase();

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping("/cancelRegistration")
    private void cancelRegistration() {

        try {
            getDrBase();

            logger.info("drRegistrationId : " + app.drBaseVO.drRegistrationId);
            logger.info("drVenId : " + app.drBaseVO.drVenId);

            OadrCancelPartyRegistrationType oadrCancelPartyRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bCancelPartyRegistrationBuilder(
                    DR_CANCEL_PARTY_REGISTRATION_ID + UUID.randomUUID(), app.drBaseVO.drRegistrationId, app.drBaseVO.drVenId).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCancelPartyRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);

            logger.info("---------------------------------------------------");
            logger.info(" [ OadrCancelPartyRegistration ] ");
            logger.info("VTN ->");
            logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseCode());
            logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseDescription());
            logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getRequestID());
            logger.info("RegistrationID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getRegistrationID());
            logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getVenID());
            logger.info("---------------------------------------------------");

            /**
             * DB 에 VEN 아이디, DR 등록 아이디 해제
             */
            if (oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

                int createPartyRegistration = drService.cancelPartyRegistration(app.drBaseVO.drBusinessId);

                if (createPartyRegistration > 0) {

                    logger.info(" [ DR 해제 완료 ] ");

                    getDrBase();
                } else {
                    logger.info(" [ DR 해제 UPDATE 실패 ] ");
                }

            } else {
                logger.info(" [ DR 해제 Error ] ");
            }

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int registerReport(DrBaseVO drBaseVO, List<String> rIdList) {

        int insertCount = 0;

        try {
            getDrBase();

            int deleteCount = drService.deleteReportList();

            logger.info(" [ 삭제된 레포트 개수 : "+deleteCount+" ] ");
            logger.info(" [ rIdList : "+rIdList.size()+" ] ");

            for (int r=0; r<rIdList.size(); r++) {
                logger.info("---------------------- "+(r+1)+" : "+rIdList.get(r)+" --------------------------");
                OadrReportType build = Oadr20bEiReportBuilders.newOadr20bRegisterReportOadrReportBuilder(DR_REPORT_SPECIFIER_ID, ReportNameEnumeratedType.METADATA_TELEMETRY_USAGE, System.currentTimeMillis())
                        .addReportDescription(Oadr20bEiReportBuilders
                                .newOadr20bOadrReportDescriptionBuilder(rIdList.get(r), ReportEnumeratedType.USAGE, ReadingTypeEnumeratedType.DIRECT_READ)
                                .withEnergyRealBase(null)
                                .withDataSource(Oadr20bEiBuilders.newOadr20bEiTargetTypeBuilder().addResourceId(DR_RESOURCE_ID).build())
                                .withOadrSamplingRate(DR_MIN_PERIOD, DR_MAX_PERIOD, false).withMarketContext(DR_MARKET_CONTEXT).build())
                        .withDuration(DR_REPORT_DURATION_0H).build();

                OadrRegisterReportType oadrRegisterReportType = Oadr20bEiReportBuilders.newOadr20bRegisterReportBuilder(DR_REGISTER_REPORT_ID + UUID.randomUUID(), drBaseVO.drVenId).addOadrReport(build).build();

                OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrRegisterReportType);

                OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, OadrPayload.class);

                Thread.sleep(1000);

                logger.info(" [ OadrRegisterReport ] ");
                logger.info("VTN ->");
                logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode());
                logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseDescription());
                logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getRequestID());

                List<OadrReportRequestType> oadrReportRequestTypeList = oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getOadrReportRequest();

                List<String> reportRequestIDList = new ArrayList<String>();

                ArrayList<DrReportVO> drReportVOArrayList = new ArrayList<>();

                for (int i=0; i<oadrReportRequestTypeList.size(); i++) {

                    DrReportVO drReportVO = new DrReportVO();
                    drReportVO.setDrBusinessId(drBaseVO.drBusinessId);
                    drReportVO.setKepcoCstmrNo(rIdList.get(r));
                    drReportVO.setReportReqstId(oadrReportRequestTypeList.get(i).getReportRequestID());
                    drReportVO.setReportUnit(oadrReportRequestTypeList.get(i).getReportSpecifier().getGranularity().getDuration());
                    drReportVO.setReportCycle(oadrReportRequestTypeList.get(i).getReportSpecifier().getReportBackDuration().getDuration());
                    drReportVO.setReportStartDt(utcToLocaltime(oadrReportRequestTypeList.get(i).getReportSpecifier().getReportInterval().getProperties().getDtstart().getDateTime().toString(), FORMAT_DEFAULT));
                    drReportVO.setReportCntncPd(oadrReportRequestTypeList.get(i).getReportSpecifier().getReportInterval().getProperties().getDuration().getDuration());

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

                    drReportVOArrayList.add(drReportVO);

                    logger.info("---------------------------------------------------");
                }

                logger.info("VenID : " + oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getVenID());
                logger.info("---------------------------------------------------");

                //oadrCreatedReport Message 송신
                //금회에 수신한 내용을 포함한 VEN 상에 관리되고 있는 모든 Report Request ID
                if (oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS) && reportRequestIDList.size() > 0) {
                    OadrCreatedReportType oadrCreatedReportType = Oadr20bEiReportBuilders.newOadr20bCreatedReportBuilder(String.valueOf(UUID.randomUUID()), Integer.parseInt(DR_CODE_SUCCESS), drBaseVO.drVenId)
                            .addPendingReportRequestId(reportRequestIDList).build();

                    OadrPayload oadrCreatedReportData = Oadr20bFactory.createOadrPayload("", oadrCreatedReportType);

                    OadrPayload oadrPayloadResponse = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(oadrCreatedReportData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, OadrPayload.class);

                    Thread.sleep(1000);

                    if (oadrPayloadResponse.getOadrSignedObject().getOadrResponse().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {
                        logger.info(" [ CreatedReport 전송 완료 ] ");

                        drService.insertReportList(drReportVOArrayList);

                        insertCount++;

                        Thread.sleep(1000);

                    } else {
                        drService.deleteReportList();
                        logger.info(" [ CreatedReport 실패 ] ");
                        return insertCount;
                    }

                } else {
                    drService.deleteReportList();
                    logger.info(" [ CreatedReport 실패 ] ");
                    return insertCount;
                }
            }

        } catch (Oadr20bException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bHttpLayerException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureException e) {
            throw new RuntimeException(e);
        } catch (Oadr20bXMLSignatureValidationException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return insertCount;
    }

    @RequestMapping("/oadrRegisterReport")
    private void oadrRegisterReport() {

        registerReport(app.drBaseVO, app.rIdList);
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
            OadrUpdateReportType oadrUpdateReportType = Oadr20bEiReportBuilders.newOadr20bUpdateReportBuilder(DR_UPDATE_REPORT_ID + UUID.randomUUID(), app.drVenId).addReport(reportUpdate).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrUpdateReportType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, OadrPayload.class);


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

        getDrBase();

        if (app.drVenId != null && !app.drVenId.equals("")) {
            try {

                OadrPollType oadrPollType = Oadr20bPollBuilders.newOadr20bPollBuilder(app.drVenId).withSchemaVersion(DR_SCHEMA_VERSION).build();

                OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrPollType);

                OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.OADR_POLL_SERVICE, OadrPayload.class);

                parseEvent(oadrPayload);

            } catch (Oadr20bException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bHttpLayerException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bXMLSignatureException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bXMLSignatureValidationException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            logger.info("[ Poll Failure - 등록된 VEN 아이디 없음 ]");
        }
    }

    @RequestMapping("/oadrRequestEvent")
    public void oadrRequestEvent() {
        logger.info("[ oadrRequestEvent Call - " + simpleDateFormat.format(new Date()) + " ]");

        getDrBase();

        if (app.drVenId != null && !app.drVenId.equals("")) {
            try {

                OadrRequestEventType oadrRequestEvent = Oadr20bEiEventBuilders.newOadrRequestEventBuilder(app.drVenId, "").build();

                OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrRequestEvent);

                OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_EVENT_SERVICE, OadrPayload.class);

                parseEvent(oadrPayload);

            } catch (Oadr20bException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bHttpLayerException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bXMLSignatureException e) {
                throw new RuntimeException(e);
            } catch (Oadr20bXMLSignatureValidationException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            logger.info("[ Request Event Failure - 등록된 VEN 아이디 없음 ]");
        }
    }

    private void parseEvent(OadrPayload oadrPayload) {
        logger.info("---------------------------------------------------");
        logger.info("VTN ->");

        if (oadrPayload.getOadrSignedObject().getOadrDistributeEvent() != null && oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

            try {

                DrEventVO drEventVO = new DrEventVO();

                logger.info("ResponseCode : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseCode());
                logger.info("ResponseDescription : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseDescription());
                logger.info("EiResponse().getRequestID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getRequestID());
                logger.info("RequestID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getRequestID());
                logger.info("VtnID : " + oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getVtnID());

                List<OadrDistributeEventType.OadrEvent> oadrEventList = oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getOadrEvent();

                for (int i = 0; i < oadrEventList.size(); i++) {
                    logger.info("-------------------- " + (i + 1) + " ----------------------------");
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
                    logger.info("EventStatus : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventStatus().value());
                    logger.info("TestEvent : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getTestEvent());
                    if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment().equals(""))
                        logger.info("VtnComment : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment());
                    logger.info("Properties().getDtstart().getDateTime() : " + oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDtstart().getDateTime());

                    drEventVO.setEventId(oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventID());
                    drEventVO.setEventSttusCd(oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventStatus().value());

                    String startTime = String.valueOf(oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDtstart().getDateTime());

                    drEventVO.setIssueDate(utcToLocaltime(startTime, FORMAT_DATE));
                    drEventVO.setIssueHhmm(utcToLocaltime(startTime, FORMAT_HOUR_MINUTE));

                    Map<String, String> timeMap = calculateDrEventTime(utcToLocaltime(startTime, FORMAT_DEFAULT)
                            , Integer.parseInt(oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDuration().getDuration().replace("PT", "").replace("M", "")));

                    drEventVO.setEndHhmm(timeMap.get("endHHmm"));
                    drEventVO.setCntncHh(timeMap.get("gap"));

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

                    if (oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID() != null && oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID().size() > 0) {
                        List<String> groupIDList = oadrEventList.get(i).getEiEvent().getEiTarget().getGroupID();

                        for (int m = 0; m < groupIDList.size(); m++) {
                            logger.info("groupID - " + m + " : " + groupIDList.get(m));
                            drEventVO.setKpxDrRscId(groupIDList.get(m));
                        }
                    }

                    List<EiEventSignalType> eiEventSignalTypeList = oadrEventList.get(i).getEiEvent().getEiEventSignals().getEiEventSignal();

                    for (int j = 0; j < eiEventSignalTypeList.size(); j++) {

                        //Interval
                        List<IntervalType> intervalTypeList = eiEventSignalTypeList.get(j).getIntervals().getInterval();
                        for (int k = 0; k < intervalTypeList.size(); k++) {
                            logger.info("intervalTypeList.get(k).getDuration().getDuration() : " + intervalTypeList.get(k).getDuration().getDuration());
                            logger.info("intervalTypeList.get(k).getUid() : " + intervalTypeList.get(k).getUid().getText());

                            SignalPayloadType signalPayloadType = (SignalPayloadType) intervalTypeList.get(k).getStreamPayloadBase().get(0).getValue();
                            PayloadFloatType payloadFloatType = (PayloadFloatType) signalPayloadType.getPayloadBase().getValue();

                            logger.info("Value : " + payloadFloatType.getValue());

                            drEventVO.setValue(String.valueOf(payloadFloatType.getValue()));
                            drEventVO.setUid(Integer.parseInt(intervalTypeList.get(k).getUid().getText()));

                            //Interval 이 여러개
                            if (intervalTypeList.get(k).getDtstart() != null && !intervalTypeList.get(k).getDtstart().equals("")) {
                                logger.info("intervalTypeList.get(k).getDtstart().getDateTime() : " + intervalTypeList.get(k).getDtstart().getDateTime());

                                String intervalStartTime = String.valueOf(intervalTypeList.get(k).getDtstart().getDateTime());

                                drEventVO.setIssueDate(utcToLocaltime(intervalStartTime, FORMAT_DATE));
                                drEventVO.setIssueHhmm(utcToLocaltime(intervalStartTime, FORMAT_HOUR_MINUTE));

                                Map<String, String> intervalTimeMap = calculateDrEventTime(utcToLocaltime(intervalStartTime, FORMAT_DEFAULT)
                                        , Integer.parseInt(intervalTypeList.get(k).getDuration().getDuration().replace("PT", "").replace("M", "")));

                                drEventVO.setEndHhmm(intervalTimeMap.get("endHHmm"));
                                drEventVO.setCntncHh(intervalTimeMap.get("gap"));
                            }

                            drService.updateDrEvent(drEventVO);
                        }

                        logger.info("eiEventSignalTypeList.get(j).getSignalName() : " + eiEventSignalTypeList.get(j).getSignalName());
                        logger.info("eiEventSignalTypeList.get(j).getSignalType() : " + eiEventSignalTypeList.get(j).getSignalType());
                        logger.info("eiEventSignalTypeList.get(j).getSignalID() : " + eiEventSignalTypeList.get(j).getSignalID());
                        logger.info("eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue() : " + eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue());
                    }
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
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

    public void getDrBase() {
        try {
            app.drBaseVO = drService.selectDrBase();
            app.drVenId = app.drBaseVO.getDrVenId();
            app.rIdList = drService.selectRId();

            logger.info("DrBusinessId : " + app.drBaseVO.getDrBusinessId());
            logger.info("DrRegistrationId : " + app.drBaseVO.getDrRegistrationId());
            logger.info("drVenId : " + app.drVenId);
            logger.info("rIdList : " + app.rIdList.size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* UTC time to local time
     */
    public String utcToLocaltime(String datetime, String pattern) throws Exception {
        String locTime = null;
        TimeZone tz = TimeZone.getTimeZone("GMT+09:00");// 해당 국가 일시 확인 할 때, 한쿸은 +9
        //TimeZone tz = TimeZone.getDefault();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        try {
            Date parseDate = simpleDateFormat.parse(datetime);
            long milliseconds = parseDate.getTime();
            int offset = tz.getOffset(milliseconds);
            locTime = sdf.format(milliseconds + offset);
            locTime = locTime.replace("+0000", "");
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        return locTime;
    }

    private Map<String, String> calculateDrEventTime(String startDate, int duration) {
        Map<String, String> timeMap = new HashMap<>();

        try {
            SimpleDateFormat formatDefault = new SimpleDateFormat(FORMAT_DEFAULT);

            String endHHmm;

            Date startTime = formatDefault.parse(startDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            calendar.add(Calendar.MINUTE, duration);

            Date endTime = calendar.getTime();

            endHHmm = new SimpleDateFormat(FORMAT_HOUR_MINUTE).format(calendar.getTime());

            timeMap.put("endHHmm", endHHmm);

            long gap = (endTime.getTime() - startTime.getTime()) / 3600000;

            timeMap.put("gap", gap < 10 ? "0" + gap : String.valueOf(gap));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return timeMap;
    }
}
