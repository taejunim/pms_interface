package pms.api.kepcoAmi.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.kepcoAmi.service.model.KepcoAmi;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface KepcoAmiMapper {

    /**
     * CEMS와 한전 AMI 비교
     *
     * @return
     */
    List<KepcoAmi> getRegisterAmi(HashMap<String,Object> amiList);

    /**
     * 소비데이터 등록 안된 고객번호 조회
     *
     * @return
     */
    List<KepcoAmi>  selectCallApiList();

    /**
     * 한전 API 응답 결과 테이블 데이터 등록 및 업데이트
     *
     * @return
     */
    void insertApiResultList(List<KepcoAmi> amiDataList);

    /**
     * 한전 API 결과 테이블 단건 업데이트
     *
     * @return
     */
    void updateSingleApiResult(KepcoAmi amiData);

    /**
     * 15분 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmi15MinuteData(List<KepcoAmi> amiDataList);

    /**
     * 한시간 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmiHourData(List<KepcoAmi> amiDataList);

    /**
     * 하루 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmiDayData(List<KepcoAmi> amiDataList);

}
