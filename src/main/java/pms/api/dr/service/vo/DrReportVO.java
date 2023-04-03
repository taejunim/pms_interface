package pms.api.dr.service.vo;

import lombok.Data;

/**
 * packageName    : pms.api.dr.service.vo
 * fileName       : DrReportVO
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
@Data
public class DrReportVO {

    public String drBusinessId;     //수요관리사업자 아이디
    public String kepcoCstmrNo;
    public String reportReqstId;
    public String reportUnit;
    public String reportCycle;
    public String reportStartDt;
    public String reportCntncPd;

}
