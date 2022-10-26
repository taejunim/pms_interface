package pms.api.kepcoAmi.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.kepcoAmi.service.vo.CblManageVO;
import pms.api.kepcoAmi.service.vo.KepcoAmiVO;

import java.util.HashMap;
import java.util.List;

/**
 * KepcoAmiMapper.java
 *
 * 한전 AMI 사용량 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/06/14.
 */

@Mapper
@Repository
public interface KepcoAmiMapper {

    /**
     * CEMS와 한전 AMI 비교
     *
     * @return
     */
    List<KepcoAmiVO> selectRegisterAmi(HashMap<String,Object> amiList);

    /**
     * 소비데이터 등록 안된 고객번호 조회
     *
     * @return
     */
    List<KepcoAmiVO>  selectCallApiList(List<KepcoAmiVO> amiList);

    /**
     * 한전 API 응답 결과 테이블 데이터 등록 및 업데이트
     *
     * @return
     */
    void insertApiResultList(List<KepcoAmiVO> amiDataList);

    /**
     * 한전 API 결과 테이블 단건 업데이트
     *
     * @return
     */
    void updateSingleApiResult(KepcoAmiVO amiData);

    /**
     * 15분 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmi15MinuteData(List<KepcoAmiVO> amiDataList);

    /**
     * 한시간 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmiHourData(List<KepcoAmiVO> amiDataList);

    /**
     * 하루 한전 AMI 데이터 등록
     *
     * @return
     */
    int insertAmiDayData(KepcoAmiVO amiDataList);

    /**
     * 15분 한전 AMI 에러 데이터 등록
     *
     * @return
     */
    int insertAmi15MinuteErrorData(List<KepcoAmiVO> amiDataList);

    /**
     * 한전 AMI 15분 누적 데이터 교정(00시 15분 ~ 45분)
     *
     * @return
     */
    void updateCorrectDayStartAccmltMeteringVal(KepcoAmiVO ami);

    /**
     * 15분 한전 AMI 누적 데이터 등록 (고압)
     *
     * @return
     */
    int insertHighAmi15MinuteAccmltData(KepcoAmiVO ami);

    /**
     * 한시간 한전 AMI 데이터 등록 (고압)
     *
     * @return
     */
    int insertHighAmiHourData(KepcoAmiVO ami);

    /**
     * 하루 한전 AMI 데이터 등록(고압)
     *
     * @return
     */
    int insertHighAmiDayData(KepcoAmiVO ami);

    /**
     * 누락됬다 새로 들어온 데이터 조회
     *
     * @return
     */
    List<CblManageVO> selectNewData(HashMap<String,Object> amiList);

    /**
     * 새로 들어온 데이터 CBL 관리 테이블 등록
     *
     * @return
     */
    int insertRefreshDataToCblTable(List<CblManageVO> cblManageList);
}
