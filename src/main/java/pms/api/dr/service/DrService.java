package pms.api.dr.service;

import pms.api.dr.service.vo.DrBaseVO;
import pms.api.dr.service.vo.DrEventVO;
import pms.api.dr.service.vo.DrReportVO;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : pms.api.dr.service
 * fileName       : DrService
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
public interface DrService {

    DrBaseVO selectDrBase() throws Exception;

    int createPartyRegistration(DrBaseVO drBaseVO) throws Exception;

    int cancelPartyRegistration(String drBusinessId) throws Exception;

    int deleteReportList() throws Exception;

    int insertReportList(ArrayList<DrReportVO> drReportVOArrayList) throws Exception;

    List<String> selectRId() throws Exception;

    int updateDrEvent(DrEventVO drEventVO) throws Exception;
}
