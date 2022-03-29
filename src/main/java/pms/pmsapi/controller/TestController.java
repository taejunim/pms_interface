package pms.pmsapi.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@Tag(name="test")
public class TestController {

    @GetMapping("/testing")
    public String testing() {
        return "Hello, Test!";
    }
}
