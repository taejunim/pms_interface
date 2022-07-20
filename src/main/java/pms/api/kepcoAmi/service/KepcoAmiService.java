package pms.api.kepcoAmi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
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
    public void insertAmiData(List<KepcoAmi> amiDataList) {

        int resultMinute = kepcoAmiMapper.insertAmi15MinuteData(amiDataList);
        int resultHour   = kepcoAmiMapper.insertAmiHourData(amiDataList);
        int resultDay    = kepcoAmiMapper.insertAmiDayData(amiDataList);

        if(resultMinute * resultHour * resultDay > 0) kepcoAmiMapper.updateSingleApiResult(amiDataList.get(0));
    }

    /**
     * 한전 AMI 데이터 등록
     *
     * @return
     */
    public void updateSingleApiResult(KepcoAmi amiData) { kepcoAmiMapper.updateSingleApiResult(amiData); }
}
