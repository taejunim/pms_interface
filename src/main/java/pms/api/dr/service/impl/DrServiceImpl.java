package pms.api.dr.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pms.api.dr.service.DrMapper;
import pms.api.dr.service.DrService;
import pms.api.dr.service.vo.DrBaseVO;
import pms.api.dr.service.vo.DrEventVO;
import pms.api.dr.service.vo.DrReportVO;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : pms.api.dr.service.impl
 * fileName       : DrServiceImpl
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
@Service
public class DrServiceImpl implements DrService {

    @Autowired
    private SqlSession sqlSession;

    //등록된 DR 정보 가져오기
    public DrBaseVO selectDrBase() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectDrBase(drMapper.selectDrBusinessId());
    }

    //VEN 아이디, DR 등록 아이디 등록
    public int createPartyRegistration(DrBaseVO drBaseVO) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.createPartyRegistration(drBaseVO);
    }

    //VEN 아이디, DR 등록 아이디 해제
    public int cancelPartyRegistration(String drBusinessId) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.cancelPartyRegistration(drBusinessId);
    }

    //레포트 정보 삭제
    public int deleteReportList() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.deleteReportList();
    }

    //레포트 정보 등록
    public int insertReportList(ArrayList<DrReportVO> drReportVOArrayList) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.insertReportList(drReportVOArrayList);
    }

    //DR 참여중인 모든 한전고객번호 가져오기
    public List<String> selectRId() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectRId();
    }

    //등록된 레포트 아이디 개수
    public int selectReportIdCount() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectReportIdCount();
    }

    //DR Event 등록/수정
    public int updateDrEvent(DrEventVO drEventVO) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.updateDrEvent(drEventVO);
    }

    //현재 시간에 가장 근접한 DR Event 시작 시간과의 차이
    public int selectEventTimeGap() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectEventTimeGap();
    }
}
