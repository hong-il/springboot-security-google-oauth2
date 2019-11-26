package boot.security.oauth2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WebRestController {

    @GetMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
