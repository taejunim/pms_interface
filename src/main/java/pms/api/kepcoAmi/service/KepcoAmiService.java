package pms.api.kepcoAmi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pms.api.holiday.HolidayScheduler;
import pms.api.kepcoAmi.service.vo.CblManageVO;
import pms.api.kepcoAmi.service.vo.KepcoAmiVO;

import java.util.HashMap;
import java.util.List;

/**
 * KepcoAmiService.java

 * 한전 AMI 사용량 정보 Service
 *
 * Created by Youyeong Jo on 2022/06/14.
 */

@Service
public class KepcoAmiService {

    //로그 설정
    private static final Logger logger = LoggerFactory.getLogger(HolidayScheduler.class);

    private final KepcoAmiMapper kepcoAmiMapper;

    public KepcoAmiService(KepcoAmiMapper kepcoAmiMapper) {
        this.kepcoAmiMapper = kepcoAmiMapper;
    }


    /**
     * 소비데이터 등록 안된 고객번호 조회
     *
     * @return
     */
    public List<KepcoAmiVO> selectCallApiList(List<KepcoAmiVO> amiList) {
        return kepcoAmiMapper.selectCallApiList(amiList);
    }

    /**
     * CEMS와 한전 AMI 비교
     *
     * @return
     */
    public List<KepcoAmiVO> selectRegisterAmi(HashMap<String,Object> amiList) {
        return kepcoAmiMapper.selectRegisterAmi(amiList);
    }

    /**
     * 한전 API 응답 결과 테이블 데이터 등록 및 업데이트
     *
     * @return
     */
    public void insertApiResultList(List<KepcoAmiVO> amiDataList) {
        kepcoAmiMapper.insertApiResultList(amiDataList);
    }

    /**
     * 한전 AMI 데이터 등록 gn
     *
     * @return
     */
    public void insertAmiData(List<KepcoAmiVO> amiDataList, Boolean errorExist) {

        try {
            //기존 등록 데이터와 다른 데이터를 찾기 위한 파라미터 세팅
            HashMap<String, Object> map = new HashMap<>();
            map.put("amiIdx", amiDataList.get(0).getAmiIdx());
            map.put("meteringDate", amiDataList.get(0).getMeteringDate());
            map.put("meterNo", amiDataList.get(0).getMeterNo());
            map.put("list", amiDataList);
            //기존 등록 데이터와 다른 데이터 시간대 조회 (새로운 데이터로 등록되면 어떤 건이 바뀌었는지 알 수 없음 -> 등록 전 조회함.
            List<CblManageVO> cblManageList = kepcoAmiMapper.selectNewData(map);

            //15분 데이터 등록
            int resultMinute = kepcoAmiMapper.insertAmi15MinuteData(amiDataList);
            //한시간 데이터 등록
            int resultHour = 0;
            int resultDay  = 0;

            if(amiDataList.get(0).getLvHvVal() != null && amiDataList.get(0).getLvHvVal().equals("고압")) {
                KepcoAmiVO kepcoAmiVO = amiDataList.get(0);
                resultMinute = kepcoAmiMapper.insertHighAmi15MinuteAccmltData(kepcoAmiVO);
                resultHour = kepcoAmiMapper.insertHighAmiHourData(kepcoAmiVO);
                resultDay = kepcoAmiMapper.insertHighAmiDayData(kepcoAmiVO);
            }
            else {
                resultHour = kepcoAmiMapper.insertAmiHourData(amiDataList);
                resultDay = kepcoAmiMapper.insertAmiDayData(amiDataList.get(0));
                //0015 ~ 0045까지 누적값 데이터 보정
                kepcoAmiMapper.updateCorrectDayStartAccmltMeteringVal(amiDataList.get(0));
            }

            if (resultMinute * resultHour * resultDay > 0 && !errorExist) {
                kepcoAmiMapper.updateSingleApiResult(amiDataList.get(0));
            }

            //바뀐 데이터가 존재한다면
            if(cblManageList.size() > 0) {
                logger.debug("--------------------- CBL을 새로 계산해야 하는 건이 존재 합니다. ---------------------");
                logger.debug("AMI Idx : " + cblManageList.get(0).getAmiIdx() + " 날짜 : " + cblManageList.get(0).getMeteringDate());
                logger.debug("총 : " + kepcoAmiMapper.insertRefreshDataToCblTable(cblManageList) + "개 누락 시간대 등록되었습니다.");
                logger.debug("-----------------------------------------------------------------------------");
            }

        } catch (Exception e) {
            logger.error("insertAmiData Exception 발생");
            logger.error(e.getMessage());
            logger.error(e.getLocalizedMessage());
        }
    }

    /**
     * 한전 AMI 데이터 등록
     *
     * @return
     */
    public void updateSingleApiResult(KepcoAmiVO amiData) { kepcoAmiMapper.updateSingleApiResult(amiData); }
}
