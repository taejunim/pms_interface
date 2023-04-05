package pms.api.dr.service.vo;

import lombok.Data;

/**
 * packageName    : pms.api.dr.service.vo
 * fileName       : DrEventVO
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
@Data
public class DrEventVO {

    public String issueDate;        //수요관리사업자 아이디
    public String issueHhmm;        //DR 시작일시
    public String endHhmm;          //DR 종료일시
    public String cntncHh;          //DR 지속시간
    public String kpxDrRscId;       //수요반응자원ID
    public String eventId;          //DR Event 아이디
    public String eventSttusCd;     //DR Event 상태

    public String value;            //감축량
    public int uid;                 //인터벌 차수

    public long modificationNumber; //수정번호

}
