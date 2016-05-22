package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration

public class HelloController {
	@RequestMapping("/jp")
    @ResponseBody
    public String start() {
        return "Hello Japan!";
    }
}
