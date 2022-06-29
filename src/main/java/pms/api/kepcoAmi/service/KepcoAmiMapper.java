package pms.api.kepcoAmi.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.kepcoAmi.service.model.KepcoAmi;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface KepcoAmiMapper {

    List<KepcoAmi> getRegisterAmi(HashMap<String,Object> amiList);

    /**
     * 15분 한전 AMI 데이터 등록
     *
     * @return
     */
    void insertAmi15MinuteData(List<KepcoAmi> amiDataList);

    /**
     * 한시간 한전 AMI 데이터 등록
     *
     * @return
     */
    void insertAmiHourData(List<KepcoAmi> amiDataList);

    /**
     * 하루 한전 AMI 데이터 등록
     *
     * @return
     */
    void insertAmiDayData(List<KepcoAmi> amiDataList);
}
