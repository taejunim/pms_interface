package pms.api.essApi.base;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pms.api.essApi.base.service.BaseService;
import pms.api.essApi.base.service.model.ESS;

import java.util.List;

/**
 * BaseController.java
 *
 * 기초 정보 Controller
 *
 * Created by Ki-Jeong Kang on 2022/03/29.
 */

@RestController
@RequestMapping("/base")
@Tag(name = "Base", description = "기초 정보 API")
public class BaseController {

    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    /**
     * 전체 ESS 기초 정보 목록 조회
     *
     * @return ESS List
     */
    @GetMapping(value = "/getAllEss", produces = { "application/json" })
    @Operation(summary = "ESS 기초 정보 목록 조회", description = "전체 ESS 기초 정보 목록 조회")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    public ResponseEntity<List<ESS>> getAllEss() {
        return baseService.getAllEss();
    }

    /**
     * ESS 기초 정보 조회
     *
     * @param essCode ESS 코드
     * @return ESS
     */
    @GetMapping(value = "getEss/{essCode}", produces = { "application/json" })
    @Operation(summary = "ESS 기초 정보 조회", description = "ESS 코드를 이용하여 ESS 기초 정보 조회")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Invalid ESS Code supplied", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    public ResponseEntity<ESS> getEss(
            @Parameter(name = "essCode", description = "ESS 코드", required = true, in = ParameterIn.PATH) @PathVariable("essCode") String essCode) {
        return baseService.getEss(essCode);
    }
}
