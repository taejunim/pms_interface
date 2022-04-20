package pms.api.essApi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pms.api.essApi.service.ChargeDischargeSummaryService;
import pms.api.essApi.service.model.ChargeDischargeInsertData;
import pms.api.essApi.service.model.ChargeDischargeSummary;

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
    public ResponseEntity<Map<String,Object>> getAllEss(@RequestBody ChargeDischargeSummary chargeDischargeSummary) {
        Map<String,Object> result = new HashMap<>();

        try {
            //unixTimestamp -> String 변환
            long getMeteringDt = Long.parseLong(chargeDischargeSummary.getMeteringDt());
            Date meteringDt = new Date(getMeteringDt * 1000L);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

            ChargeDischargeInsertData chargeDischargeInsertData = new ChargeDischargeInsertData();
            chargeDischargeInsertData.setEssEquipId(chargeDischargeSummary.getEssEquipId());
            chargeDischargeInsertData.setChargeDischargeAmount(chargeDischargeSummary.getChargeDischargeAmount());
            chargeDischargeInsertData.setMeteringDate(dateFormat.format(meteringDt));

            String timeFormatType = "";
            //15분 단위 시간 형식
            if (chargeDischargeSummary.getPeriodType().equals("15")) timeFormatType = "HHmm";
            //한시간 단위 시간 형식
            else if (chargeDischargeSummary.getPeriodType().equals("60")) timeFormatType = "HH";
            SimpleDateFormat timeFormat = new SimpleDateFormat(timeFormatType);
            String meteringTime = timeFormat.format(meteringDt);
            chargeDischargeInsertData.setMeteringTime(meteringTime);

            //충전 - 고정형
            if (chargeDischargeSummary.getChargeType().equals("chg") && chargeDischargeSummary.getPositionFixYn().equals("fix")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15FixChargeData(chargeDischargeInsertData);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60FixChargeData(chargeDischargeInsertData);
                //하루 단위 데이터
                else System.out.println("하루 단위 테이블 생성 후 구현 예정");
                result.put("result", "Success");
            }
            //충전 - 이동형
            else if (chargeDischargeSummary.getChargeType().equals("chg") && chargeDischargeSummary.getPositionFixYn().equals("mob")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15MobileChargeData(chargeDischargeInsertData);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60MobileChargeData(chargeDischargeInsertData);
                //하루 단위 데이터
                else System.out.println("하루 단위 테이블 생성 후 구현 예정");
                result.put("result", "Success");
            }
            //방전 - 고정형
            else if(chargeDischargeSummary.getChargeType().equals("dis") && chargeDischargeSummary.getPositionFixYn().equals("fix")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15FixDischargeData(chargeDischargeInsertData);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60FixDischargeData(chargeDischargeInsertData);
                //하루 단위 데이터
                else System.out.println("하루 단위 테이블 생성 후 구현 예정");
                result.put("result", "Success");
            }
            //방전 - 이동형
            else if (chargeDischargeSummary.getChargeType().equals("dis") && chargeDischargeSummary.getPositionFixYn().equals("mob")) {
                //15분 단위 데이터
                if(timeFormatType.equals("HHmm"))
                    chargeDischargeSummaryService.insert15MobileDischargeData(chargeDischargeInsertData);
                //한시간 단위 데이터
                else if(timeFormatType.equals("HH"))
                    chargeDischargeSummaryService.insert60MobileDischargeData(chargeDischargeInsertData);
                //하루 단위 데이터
                else System.out.println("하루 단위 테이블 생성 후 구현 예정");
                result.put("result", "Success");
            } else {
                result.put("result", "FAIL");
                result.put("message", "올바른 충/방전 타입(chargeType) 혹은 ESS 고정형/이동형 여부(positionFixYn)을 보내주세요.");
            }
        } catch (NullPointerException | NumberFormatException e) {
            result.put("result", "FAIL");
            result.put("message", "전송하신 데이터를 확인하여 주십시오.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result.put("result", "FAIL");
            if (e.getMessage().contains("SQLIntegrityConstraintViolationException"))
                result.put("message","기존에 존재하는 데이터입니다.");
        }

        return ResponseEntity.ok(result);
    }
}
