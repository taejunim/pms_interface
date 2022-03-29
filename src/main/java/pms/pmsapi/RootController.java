package pms.pmsapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String main() {
        return "home";
    }

    @RequestMapping("/api-docs")
    public String swaggerRedirect() {
        return "redirect:/api-docs.html";
    }
}
