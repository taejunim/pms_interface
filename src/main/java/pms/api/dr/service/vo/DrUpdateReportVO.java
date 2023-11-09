package pms.api.dr.service.vo;

import lombok.Data;

/**
 * packageName    : pms.api.dr.service.vo
 * fileName       : DrUpdateReportVO
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
@Data
public class DrUpdateReportVO {

    public String meteringDate;        //검침일자
    public String hhmm;                //시분
    public String mid;                 //미터기아이디
    public String kepcoCstmrNo;        //한전고객번호
    public String accmltMeteringVal;   //누적검침값
    public long reportStartTime;   //레포트 시작시간
    public String duration;      //PT5M, PT15M
    public int intervalNum;             //차수
    public String drVenId;          //통신에 사용될 Ven 아이디
    public String resltCd;          //결과 코드
    public String resltMsg;         //결과 메시지
}
