package net.newbiz.dc.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration

public class HelloController {
	@RequestMapping("/")
    @ResponseBody
    public String start() {
        return "Hello World!";
    }
}
