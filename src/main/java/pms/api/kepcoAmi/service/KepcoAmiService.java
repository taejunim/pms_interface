package pms.api.kepcoAmi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pms.api.holidayInterface.HolidayInterfaceScheduler;
import pms.api.kepcoAmi.service.model.KepcoAmi;

import java.util.HashMap;
import java.util.List;

@Service
public class KepcoAmiService {

    //로그 설정
    private static final Logger logger = LoggerFactory.getLogger(HolidayInterfaceScheduler.class);

    private final KepcoAmiMapper kepcoAmiMapper;

    public KepcoAmiService(KepcoAmiMapper kepcoAmiMapper) {
        this.kepcoAmiMapper = kepcoAmiMapper;
    }


    /**
     * 소비데이터 등록 안된 고객번호 조회
     *
     * @return
     */
    public List<KepcoAmi> selectCallApiList() {
        return kepcoAmiMapper.selectCallApiList();
    }

    /**
     * CEMS와 한전 AMI 비교
     *
     * @return
     */
    public List<KepcoAmi> getRegisterAmi(HashMap<String,Object> amiList) {
        return kepcoAmiMapper.getRegisterAmi(amiList);
    }

    /**
     * 한전 API 응답 결과 테이블 데이터 등록 및 업데이트
     *
     * @return
     */
    public void insertApiResultList(List<KepcoAmi> amiDataList) {
        kepcoAmiMapper.insertApiResultList(amiDataList);
    }

    /**
     * 한전 AMI 데이터 등록 gn
     *
     * @return
     */
    public void insertAmiData(List<KepcoAmi> amiDataList, Boolean errorExist) {

        try {
            //15분 데이터 등록
            int resultMinute = kepcoAmiMapper.insertAmi15MinuteData(amiDataList);
            //한시간 데이터 등록
            int resultHour = kepcoAmiMapper.insertAmiHourData(amiDataList);
            //하루 데이터 등록
            int resultDay = kepcoAmiMapper.insertAmiDayData(amiDataList.get(0));

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

            if (amiDataList.get(95).getAccmltMeteringVal().equals("")) {
                HashMap<String, Object> data = new HashMap<>();
                data.put("amiIdx", amiDataList.get(95).getAmiIdx());
                data.put("meteringDate", amiDataList.get(95).getMeteringDate());
                data.put("meteringTime", amiDataList.get(95).getMeteringTime());
                data.put("previousDate", amiDataList.get(94).getMeteringDate());
                kepcoAmiMapper.updateCorrectDayLastAccmltMeteringVal(data);
            }

            if (resultMinute * resultHour * resultDay > 0 && !errorExist)
                kepcoAmiMapper.updateSingleApiResult(amiDataList.get(0));
        } catch (Exception e) {
            logger.error("insertAmiData Exception 발생");
            logger.error(e.getMessage());
            logger.error(e.getLocalizedMessage());
        }
    }

    /**
     * 한전 AMI 에러 데이터 등록
     *
     * @return
     */
    public void insertAmiErrorData(List<KepcoAmi> amiDataList) {
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
    public void updateSingleApiResult(KepcoAmi amiData) { kepcoAmiMapper.updateSingleApiResult(amiData); }
}
