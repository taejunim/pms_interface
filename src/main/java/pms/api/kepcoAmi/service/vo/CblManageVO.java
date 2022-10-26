package pms.api.kepcoAmi.service.vo;

import lombok.Data;

/**
 * CblManageVO.java
 *
 * 누락 후 새로 들어온 데이터에 관한 insert용 VO
 *
 * Created by Youyeong Jo on 2022/10/26.
 */
@Data
public class CblManageVO {

    private String amiIdx;                      //amiIdx
    private String meteringDate;                //날짜 (테이블엔 startDate, endDate로 분리되어있으나 실제로는 같은 값이 들어감.)
    private String startHhmm;                   //갱신 시작 시간
    private String endHhmm;                     //갱신 종료 시간
}
