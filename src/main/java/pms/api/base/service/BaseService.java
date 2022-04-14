package pms.api.base.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pms.api.mapper.BaseMapper;
import pms.api.model.base.ESS;

import java.util.List;

/**
 * BaseService.java
 *
 * 기초 정보 Service
 *
 * Created by Ki-Jeong Kang on 2022/03/29.
 */

@Service
public class BaseService {
    private final BaseMapper baseMapper;

    public BaseService(BaseMapper baseMapper) {
        this.baseMapper = baseMapper;
    }

    /**
     * 전체 ESS 기초 정보 목록 조회
     *
     * @return ESS List
     */
    public ResponseEntity<List<ESS>> getAllEss() {
        return ResponseEntity.ok(baseMapper.getAllEss());
    }

    /**
     * ESS 기초 정보 조회
     *
     * @param essCode ESS 코드
     * @return ESS
     */
    public ResponseEntity<ESS> getEss(String essCode) {
        return ResponseEntity.ok(baseMapper.getEss(essCode));
    }
}
