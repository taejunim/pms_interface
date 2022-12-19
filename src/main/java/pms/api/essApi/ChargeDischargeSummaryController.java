package pms.api.essApi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pms.api.essApi.service.ChargeDischargeSummaryService;
import pms.api.essApi.service.vo.ChargeDischargeInsertVO;
import pms.api.essApi.service.vo.ChargeDischargeSummaryVO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ChargeDischargeSummaryController.java
 *
 * 충방전 Summary Controller
 *
 * Created by Youyeong Jo on 2022/04/19.
 */

@RestController
@RequestMapping("/chargeDischargeSummary")
@Tag(name = "ChargeDischargeSummary", description = "충방전 정보 Summary API")
public class ChargeDischargeSummaryController {

    //로그 설정
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ChargeDischargeSummaryService chargeDischargeSummaryService;

    public ChargeDischargeSummaryController(ChargeDischargeSummaryService chargeDischargeSummaryService) {
        this.chargeDischargeSummaryService = chargeDischargeSummaryService;
    }

    /**
     * 충/방전 summary data insert API
     *
     * @return ESS List
     */
    @PostMapping(value = "/insert", produces = { "application/json" })
    @Operation(summary = "충/방전 summary data insert", description = "15분 , 1시간, 하루 단위 충/방전 summary data insert")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    public ResponseEntity<Map<String,Object>> insertChargeDischargeSummary(@RequestBody ChargeDischargeSummaryVO chargeDischargeSummaryVO) {
        Map<String,Object> result = new HashMap<>();

        try {
            //unixTimestamp -> String 변환
            long getMeteringDt = Long.parseLong(chargeDischargeSummaryVO.getMeteringDt());
            Date meteringDt = new Date(getMeteringDt * 1000L);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

            ChargeDischargeInsertVO chargeDischargeInsertVO = chargeDischargeSummaryService.getEssIdx(chargeDischargeSummaryVO);
            chargeDischargeInsertVO.setEssEquipId(chargeDischargeSummaryVO.getEssEquipId());
            chargeDischargeInsertVO.setChargeDischargeAmount(chargeDischargeSummaryVO.getChargeDischargeAmount());
            chargeDischargeInsertVO.setAccumulateAmount(chargeDischargeSummaryVO.getAccumulateAmount());
            chargeDischargeInsertVO.setMeteringDate(dateFormat.format(meteringDt));

            String timeFormatType = "";
            //15분 단위 시간 형식
            if (chargeDischargeSummaryVO.getPeriodType().equals("15")) timeFormatType = "HHmm";
            //한시간 단위 시간 형식
            else if (chargeDischargeSummaryVO.getPeriodType().equals("60")) timeFormatType = "HH";
            SimpleDateFormat timeFormat = new SimpleDateFormat(timeFormatType);
            String meteringTime = timeFormat.format(meteringDt);
            chargeDischargeInsertVO.setMeteringTime(meteringTime);

            //충전 - 고정형
            if (chargeDischargeSummaryVO.getChargeType().equals("chg") && chargeDischargeSummaryVO.getPositionFixYn().equals("Y")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15FixChargeData(chargeDischargeInsertVO);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60FixChargeData(chargeDischargeInsertVO);
                //하루 단위 데이터
                else chargeDischargeSummaryService.insertDayFixChargeData(chargeDischargeInsertVO);
                result.put("result", "Success");
            }
            //충전 - 이동형
            else if (chargeDischargeSummaryVO.getChargeType().equals("chg") && chargeDischargeSummaryVO.getPositionFixYn().equals("N")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15MobileChargeData(chargeDischargeInsertVO);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60MobileChargeData(chargeDischargeInsertVO);
                //하루 단위 데이터
                else chargeDischargeSummaryService.insertDayMobileChargeData(chargeDischargeInsertVO);
                result.put("result", "Success");
            }
            //방전 - 고정형
            else if(chargeDischargeSummaryVO.getChargeType().equals("dis") && chargeDischargeSummaryVO.getPositionFixYn().equals("Y")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15FixDischargeData(chargeDischargeInsertVO);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60FixDischargeData(chargeDischargeInsertVO);
                //하루 단위 데이터
                else chargeDischargeSummaryService.insertDayFixDischargeData(chargeDischargeInsertVO);
                result.put("result", "Success");
            }
            //방전 - 이동형
            else if (chargeDischargeSummaryVO.getChargeType().equals("dis") && chargeDischargeSummaryVO.getPositionFixYn().equals("N")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15MobileDischargeData(chargeDischargeInsertVO);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60MobileDischargeData(chargeDischargeInsertVO);
                //하루 단위 데이터
                else chargeDischargeSummaryService.insertDayMobileDischargeData(chargeDischargeInsertVO);
                result.put("result", "Success");
            } else {
                result.put("result", "FAIL");
                result.put("message", "올바른 충/방전 타입 혹은 ESS 고정형/이동형 여부를 보내주세요.");
            }
        } catch (NullPointerException | NumberFormatException e) {
            logger.error("ESS 충방전 데이터 - 필수 값 누락 및 등록되지 않은 ESS ID");
            result.put("result", "FAIL");
            result.put("message", "전송하신 데이터를 확인하여 주십시오.");
        } catch (DataIntegrityViolationException e) {
            logger.error("ESS 충방전 데이터 - 기존에 등록된 데이터");
            result.put("result", "FAIL");
            if (e.getMessage().contains("SQLIntegrityConstraintViolationException"))
                result.put("message","기존에 존재하는 데이터입니다.");
            else result.put("message",e.getMessage());
        }

        return ResponseEntity.ok(result);
    }
}
