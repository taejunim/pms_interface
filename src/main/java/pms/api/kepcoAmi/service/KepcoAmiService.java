package pms.api.kepcoAmi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pms.api.holiday.HolidayScheduler;
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
    public List<KepcoAmiVO> selectCallApiList() {
        return kepcoAmiMapper.selectCallApiList();
    }

    /**
     * CEMS와 한전 AMI 비교
     *
     * @return
     */
    public List<KepcoAmiVO> getRegisterAmi(HashMap<String,Object> amiList) {
        return kepcoAmiMapper.getRegisterAmi(amiList);
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
            //15분 데이터 등록
            int resultMinute = kepcoAmiMapper.insertAmi15MinuteData(amiDataList);
            //한시간 데이터 등록
            int resultHour = 0;
            int resultDay  = 0;

            if(amiDataList.get(0).getLvHvVal() != null && amiDataList.get(0).getLvHvVal().equals("고압")) {
                KepcoAmiVO kepcoAmiVO = amiDataList.get(0);
                kepcoAmiVO.setNextDate(amiDataList.get(amiDataList.size()-1).getMeteringDate());
                resultMinute = kepcoAmiMapper.insertHighAmi15MinuteAccmltData(kepcoAmiVO);
                resultHour = kepcoAmiMapper.insertHighAmiHourData(kepcoAmiVO);
                resultDay = kepcoAmiMapper.insertHighAmiDayData(kepcoAmiVO);
            }
            else {
                resultHour = kepcoAmiMapper.insertAmiHourData(amiDataList);
                resultDay = kepcoAmiMapper.insertAmiDayData(amiDataList.get(0));
            }

            //0015 ~ 0045까지 누적값 데이터 보정
            for (int i = 0; i < 3; i++) {
                HashMap<String, Object> data = new HashMap<>();
                data.put("amiIdx", amiDataList.get(i).getAmiIdx());
                data.put("meteringDate", amiDataList.get(i).getMeteringDate());
                data.put("meteringTime", amiDataList.get(i).getMeteringTime());
                if (i == 0) data.put("previousTime", "0000");
                else data.put("previousTime", amiDataList.get(i - 1).getMeteringTime());

                kepcoAmiMapper.updateCorrectDayStartAccmltMeteringVal(data);
            }

            if (resultMinute * resultHour * resultDay > 0 && !errorExist) {
                kepcoAmiMapper.updateSingleApiResult(amiDataList.get(0));
            }
        } catch (Exception e) {
            logger.error("insertAmiData Exception 발생");
            e.printStackTrace();
            logger.error(e.getMessage());
            logger.error(e.getLocalizedMessage());
        }
    }

    /**
     * 한전 AMI 에러 데이터 등록
     *
     * @return
     */
    public void insertAmiErrorData(List<KepcoAmiVO> amiDataList) {
        try {
            int resultMinute = kepcoAmiMapper.insertAmi15MinuteErrorData(amiDataList);
        } catch (Exception e) {
            logger.error("insertAmiErrorData Exception 발생");
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
