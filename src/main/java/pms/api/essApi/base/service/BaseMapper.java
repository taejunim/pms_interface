package pms.api.essApi.base.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.essApi.base.service.model.ESS;

import java.util.List;

/**
 * BaseMapper.java
 *
 * 기초 정보 Mapper
 *
 * Created by Ki-Jeong Kang on 2022/03/29.
 */

@Mapper
@Repository
public interface BaseMapper {

    /**
     * 전체 ESS 기초 정보 목록 조회
     *
     * @return ESS List
     */
    List<ESS> getAllEss();

    /**
     * ESS 기초 정보 조회
     *
     * @param essCode ESS 코드
     * @return ESS
     */
    ESS getEss(String essCode);
}
