package pms.pmsapi.base;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
@Tag(name="base")
public class BaseController {
    @GetMapping("/getESS")
    public String getESS() {
        return "Hello, ESS!";
    }
}
