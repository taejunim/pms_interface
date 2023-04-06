package pms.api.dr.service;

import pms.api.dr.service.vo.DrBaseVO;
import pms.api.dr.service.vo.DrEventVO;
import pms.api.dr.service.vo.DrReportVO;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : pms.api.dr.service
 * fileName       : DrMapper
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
public interface DrMapper {

    //수요관리사업자 아이디 가져오기
    String selectDrBusinessId() throws Exception;

    //등록된 DR 정보 가져오기
    DrBaseVO selectDrBase(String drBusinessId) throws Exception;

    //VEN 아이디, DR 등록 아이디 등록
    int createPartyRegistration(DrBaseVO drBaseVO) throws Exception;

    //VEN 아이디, DR 등록 아이디 해제
    int cancelPartyRegistration(String drBusinessId) throws Exception;

    //레포트 정보 삭제
    int deleteReportList() throws Exception;

    //레포트 정보 등록
    int insertReportList(ArrayList<DrReportVO> drReportVOArrayList) throws Exception;

    //DR 참여중인 모든 한전고객번호 가져오기
    List<String> selectRId() throws Exception;

    //DR Event 등록/수정
    int updateDrEvent(DrEventVO drEventVO) throws Exception;

    //현재 시간에 가장 근접한 DR Event 시작 시간과의 차이
    int selectEventTimeGap() throws Exception;
}
