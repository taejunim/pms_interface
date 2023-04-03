package pms.api.dr.service.vo;

import lombok.Data;

/**
 * packageName    : pms.api.dr.service.vo
 * fileName       : DrBaseVO
 * author         : tjlim
 * date           : 2023/03/30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30        tjlim       최초 생성
 */
@Data
public class DrBaseVO {

    public String drBusinessId;     //수요관리사업자 아이디
    public String drVenId;          //통신에 사용될 Ven 아이디
    public String drRegistrationId; //DR 등록 아이디
}
