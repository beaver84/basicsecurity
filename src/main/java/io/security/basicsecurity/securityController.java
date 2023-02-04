package io.security.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class securityController {

    @GetMapping("/")
    public String index() {
        return "home";
    }
}
