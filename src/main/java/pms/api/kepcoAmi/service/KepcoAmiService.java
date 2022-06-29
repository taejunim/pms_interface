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

    public List<KepcoAmi> getRegisterAmi(HashMap<String,Object> amiList) {
        return kepcoAmiMapper.getRegisterAmi(amiList);
    }

    /**
     * 한전 AMI 데이터 등록
     *
     * @return
     */
    public void insertAmiData(List<KepcoAmi> amiDataList) {

        try {
            kepcoAmiMapper.insertAmi15MinuteData(amiDataList);
        } catch (DataIntegrityViolationException e) {
            logger.error("기존에 등록된 한전 15분 단위 AMI 데이터 입니다.");
        }
        kepcoAmiMapper.insertAmiHourData(amiDataList);
        kepcoAmiMapper.insertAmiDayData(amiDataList);
    }
}
