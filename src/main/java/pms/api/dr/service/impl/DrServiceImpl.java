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

    public DrBaseVO selectDrBase() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectDrBase(drMapper.selectDrBusinessId());
    }

    public int createPartyRegistration(DrBaseVO drBaseVO) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.createPartyRegistration(drBaseVO);
    }

    public int cancelPartyRegistration(String drBusinessId) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.cancelPartyRegistration(drBusinessId);
    }

    public int deleteReportList() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.deleteReportList();
    }

    public int insertReportList(ArrayList<DrReportVO> drReportVOArrayList) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.insertReportList(drReportVOArrayList);
    }

    public List<String> selectRId() throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.selectRId();
    }

    public int updateDrEvent(DrEventVO drEventVO) throws Exception {
        DrMapper drMapper = sqlSession.getMapper(DrMapper.class);
        return drMapper.updateDrEvent(drEventVO);
    }
}
