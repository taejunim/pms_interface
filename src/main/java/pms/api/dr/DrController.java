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
    private SimpleDateFormat simpleDateFormatDefault = new SimpleDateFormat(FORMAT_DEFAULT);

    PmsInterfaceApplication app = new PmsInterfaceApplication();

    @Autowired
    DrService drService;

    @RequestMapping("/sslTest")
    private void sslTest() {
        logger.info("---------------------------------------------------");
        logger.info(" [ OadrQueryRegistration ] ");

        try {

            String requestID = "queryRegistration_" + UUID.randomUUID();
            OadrQueryRegistrationType oadrQueryRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bQueryRegistrationBuilder(requestID).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrQueryRegistrationType);

            app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);

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
        logger.info("---------------------------------------------------");
        logger.info(" [ createPartyRegistration ] ");

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

            /**
            * DB 에 VEN 아이디, DR 등록 아이디 등록
            */
            if (oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

                DrBaseVO drBaseVO = new DrBaseVO();
                drBaseVO.setDrBusinessId(app.drBaseVO.getDrBusinessId());
                drBaseVO.setDrVenId(oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getVenID());
                drBaseVO.setDrRegistrationId(oadrPayload.getOadrSignedObject().getOadrCreatedPartyRegistration().getRegistrationID());

                int createPartyRegistration;

                try {
                    createPartyRegistration = drService.createPartyRegistration(drBaseVO);
                } catch (Exception e) {
                    logger.info("DB 에 VEN 아이디, DR 등록 아이디 등록 Exception");
                    logger.info("drBaseVO -> " + drBaseVO);
                    return;
                }

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

    @RequestMapping("/cancelRegistration")
    private void cancelRegistration() {
        logger.info("---------------------------------------------------");
        logger.info(" [ OadrCancelPartyRegistration ] ");

        try {
            getDrBase();

            OadrCancelPartyRegistrationType oadrCancelPartyRegistrationType = Oadr20bEiRegisterPartyBuilders.newOadr20bCancelPartyRegistrationBuilder(
                    DR_CANCEL_PARTY_REGISTRATION_ID + UUID.randomUUID(), app.drBaseVO.drRegistrationId, app.drBaseVO.drVenId).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCancelPartyRegistrationType);

            OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REGISTER_PARTY_SERVICE, OadrPayload.class);

            /**
             * DB 에 VEN 아이디, DR 등록 아이디 해제
             */
            if (oadrPayload.getOadrSignedObject().getOadrCanceledPartyRegistration().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

                int cancelPartyRegistration;

                try {
                    cancelPartyRegistration = drService.cancelPartyRegistration(app.drBaseVO.drBusinessId);
                } catch (Exception e) {
                    logger.info("DB 에 VEN 아이디, DR 등록 아이디 해제 Exception");
                    logger.info("app.drBaseVO -> " + app.drBaseVO);
                    return;
                }

                if (cancelPartyRegistration > 0) {

                    logger.info(" [ DR 해제 완료 ] ");

                    getDrBase();
                } else {
                    logger.info(" [ DR 해제 UPDATE 실패 ] ");
                }

            } else {
                logger.info(" [ DR 해제 Error ] ");
            }

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

    private int registerReport(DrBaseVO drBaseVO, List<String> rIdList) {
        logger.info("---------------------------------------------------");
        logger.info(" [ OadrRegisterReport ] ");

        int insertCount = 0;

        try {
            getDrBase();

            drService.deleteReportList();

            for (int r=0; r<rIdList.size(); r++) {

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

                Thread.sleep(100);

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

                    reportRequestIDList.add(oadrReportRequestTypeList.get(i).getReportRequestID());

                    drReportVOArrayList.add(drReportVO);
                }

                //oadrCreatedReport Message 송신
                //금회에 수신한 내용을 포함한 VEN 상에 관리되고 있는 모든 Report Request ID
                if (oadrPayload.getOadrSignedObject().getOadrRegisteredReport().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS) && reportRequestIDList.size() > 0) {
                    OadrCreatedReportType oadrCreatedReportType = Oadr20bEiReportBuilders.newOadr20bCreatedReportBuilder(String.valueOf(UUID.randomUUID()), Integer.parseInt(DR_CODE_SUCCESS), drBaseVO.drVenId)
                            .addPendingReportRequestId(reportRequestIDList).build();

                    OadrPayload oadrCreatedReportData = Oadr20bFactory.createOadrPayload("", oadrCreatedReportType);

                    OadrPayload oadrPayloadResponse = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(oadrCreatedReportData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_REPORT_SERVICE, OadrPayload.class);

                    Thread.sleep(100);

                    if (oadrPayloadResponse.getOadrSignedObject().getOadrResponse().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {
                        logger.info(" [ CreatedReport 전송 완료 ] ");

                        try {
                            //레포트 정보 등록
                            drService.insertReportList(drReportVOArrayList);
                        } catch (Exception e) {
                            drService.deleteReportList();
                            logger.info(" [ CreatedReport Exception ] ");
                            logger.info("drReportVOArrayList -> " + drReportVOArrayList.get(0));
                            return insertCount;
                        }

                        insertCount++;

                        Thread.sleep(100);

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
                    .addInterval(Oadr20bEiBuilders.newOadr20bReportIntervalTypeBuilder(intervalId, dtStart, DR_PT15M, "rId",confidence, accuracy, value).build())
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

    /**
     * 주기적으로 DR Event 폴링 - 최소 30초
     */
    @Scheduled(cron="0/60 * * * * *")
    @RequestMapping("/oadrPoll")
    public void oadrPoll() {
        logger.info("---------------------------------------------------");
        logger.info("[ Poll - " + simpleDateFormatDefault.format(new Date()) + " ]");

        getDrBase();

        try {
            //DR 참여하는 고객수와 등록된 레포트 수가 같아야 폴링
            if (app.rIdList.size() == app.reportIdCount) {
                /**
                 * 현재 시간에 가장 근접한 DR Event 시작 시간과의 차이
                 * -> 시작 시간까지 남은 시간 혹은 시작후 경과 시간을 절대값으로 구함
                 * --> 시작 전/후 1분 ~ 10분 까지는 oadrPoll 이 아닌 oadrRequestEvent 로 요청 (oadrPoll 은 1회 한하여 발령 데이터가 오는 듯 함.)
                 */
                int gap = drService.selectEventTimeGap();

                //DR 시작 전/후에 DR 상태값 변경을 위해 oadrRequestEvent 로 요청
                if ( gap > 60 && gap < 600 ) {
                    oadrRequestEvent();
                } else {
                    if (app.drVenId != null && !app.drVenId.equals("")) {

                        OadrPollType oadrPollType = Oadr20bPollBuilders.newOadr20bPollBuilder(app.drVenId).withSchemaVersion(DR_SCHEMA_VERSION).build();

                        OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrPollType);

                        OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.OADR_POLL_SERVICE, OadrPayload.class);

                        parseEvent(oadrPayload, "oadrPoll");

                    } else {
                        logger.info("[ Poll Failure - 등록된 VEN 아이디 없음 ]");
                    }
                }

            } else {
                logger.info("[ Poll Failure - 레포트 갱신 필요 ]");
            }

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

    @RequestMapping("/oadrRequestEvent")
    public void oadrRequestEvent() {
        logger.info("---------------------------------------------------");
        logger.info("[ RequestEvent - " + simpleDateFormat.format(new Date()) + " ]");

        getDrBase();

        if (app.drVenId != null && !app.drVenId.equals("")) {
            try {

                OadrRequestEventType oadrRequestEvent = Oadr20bEiEventBuilders.newOadrRequestEventBuilder(app.drVenId, "").build();

                OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrRequestEvent);

                OadrPayload oadrPayload = app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_EVENT_SERVICE, OadrPayload.class);

                parseEvent(oadrPayload, "oadrRequestEvent"); //DR Event 파싱

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
        } else {
            logger.info("[ Request Event Failure - 등록된 VEN 아이디 없음 ]");
        }
    }

    private void parseEvent(OadrPayload oadrPayload, String apiType) {

        if (oadrPayload.getOadrSignedObject().getOadrDistributeEvent() != null && oadrPayload.getOadrSignedObject().getOadrDistributeEvent().getEiResponse().getResponseCode().equals(DR_CODE_SUCCESS)) {

            try {

                DrEventVO drEventVO = new DrEventVO();

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
                    if (oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment() != null && !oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment().equals(""))
                        logger.info("VtnComment : " + oadrEventList.get(i).getEiEvent().getEventDescriptor().getVtnComment());

                    drEventVO.setEventId(oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventID());
                    drEventVO.setEventSttusCd(oadrEventList.get(i).getEiEvent().getEventDescriptor().getEventStatus().value());
                    drEventVO.setModificationNumber(oadrEventList.get(i).getEiEvent().getEventDescriptor().getModificationNumber());

                    String startTime = String.valueOf(oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDtstart().getDateTime());

                    drEventVO.setIssueDate(utcToLocaltime(startTime, FORMAT_DATE));
                    drEventVO.setIssueHhmm(utcToLocaltime(startTime, FORMAT_HOUR_MINUTE));

                    Map<String, String> timeMap = calculateDrEventTime(utcToLocaltime(startTime, FORMAT_DEFAULT)
                            , Integer.parseInt(oadrEventList.get(i).getEiEvent().getEiActivePeriod().getProperties().getDuration().getDuration().replace("PT", "").replace("M", "")));

                    drEventVO.setEndHhmm(timeMap.get("endHHmm"));
                    drEventVO.setCntncHh(timeMap.get("gap"));

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

                            SignalPayloadType signalPayloadType = (SignalPayloadType) intervalTypeList.get(k).getStreamPayloadBase().get(0).getValue();
                            PayloadFloatType payloadFloatType = (PayloadFloatType) signalPayloadType.getPayloadBase().getValue();

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
                        }

                        logger.info("eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue() : " + eiEventSignalTypeList.get(j).getCurrentValue().getPayloadFloat().getValue());
                    }
                }

                try {
                    //DR Event 등록/수정
                    int updateDrEvent = drService.updateDrEvent(drEventVO);

                    /**
                     * Poll 할 때만 참여/미참여 응답 보냄
                     * 일단, 무조건 참여로 응답함
                     */
                    if (apiType.equals("oadrPoll") && updateDrEvent > 0) {
                        oadrCreatedEvent(drEventVO.getEventId(), drEventVO.getModificationNumber(), 200);
                    } else {
                        logger.info("DR Event 등록/수정 Error");
                        logger.info("drEventVO -> " + drEventVO);
                    }

                } catch (Exception e) {
                    logger.info("DR Event 등록/수정 Exception");
                    logger.info("drEventVO -> " + drEventVO);
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        //DR Event 없음
        else {
            logger.info(" [ DR Event 없음 ] ");
        }
    }

    private void oadrCreatedEvent(String eventId, long modificationNumber, int responseCode) {
        logger.info("---------------------------------------------------");
        logger.info(" [ oadrCreatedEvent ] ");

        try {
            EiResponseType eiResponseType = Oadr20bResponseBuilders.newOadr20bEiResponseBuilder("", responseCode).build();

            EventResponses.EventResponse eventResponse = Oadr20bEiEventBuilders
                    .newOadr20bCreatedEventEventResponseBuilder(eventId, modificationNumber, DR_CREATED_EVENT_ID + UUID.randomUUID(), responseCode, OptTypeType.OPT_IN).build();

            OadrCreatedEventType oadrCreatedEventType = Oadr20bEiEventBuilders.newCreatedEventBuilder(eiResponseType, app.drVenId).addEventResponse(eventResponse).build();

            OadrPayload requestData = Oadr20bFactory.createOadrPayload("", oadrCreatedEventType);

            app.oadrHttpClient.post(Oadr20bFactory.createOadrPayload(requestData), Oadr20bUrlPath.OADR_BASE_PATH + Oadr20bUrlPath.EI_EVENT_SERVICE, OadrPayload.class);

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

    /**
     * 등록된 DR 정보 가져오기
     */
    public void getDrBase() {
        try {
            app.drBaseVO = drService.selectDrBase();
            app.drVenId = app.drBaseVO.getDrVenId();
            app.rIdList = drService.selectRId();
            app.reportIdCount = drService.selectReportIdCount();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * KPX 에서 UTC 타임을 사용하므로 한국 시간으로 변환
     * @param datetime
     * @param pattern
     * @return
     * @throws Exception
     */
    public String utcToLocaltime(String datetime, String pattern) throws Exception {
        String localTime;
        TimeZone tz = TimeZone.getTimeZone("GMT+09:00");// 해당 국가 일시 확인 할 때, 한쿸은 +9
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        try {
            Date parseDate = simpleDateFormat.parse(datetime);
            long milliseconds = parseDate.getTime();
            int offset = tz.getOffset(milliseconds);
            localTime = sdf.format(milliseconds + offset);
            localTime = localTime.replace("+0000", "");
        } catch(Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        return localTime;
    }

    /**
     * DR Event 시작일시로 종료일시, 지속시간 구하기
     * @param startDate
     * @param duration
     * @return timeMap
     */
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
