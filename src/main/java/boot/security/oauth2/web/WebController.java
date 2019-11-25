package boot.security.oauth2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"","/"})
    public String getAuthorizationMessage() {
        return "index";
    }

    @GetMapping("/login")
    public String login() { return "login"; }

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        return "loginSuccess";
    }

    @GetMapping("/loginFailure")
    public String loginFailure() {
        return "loginFailure";
    }
}
