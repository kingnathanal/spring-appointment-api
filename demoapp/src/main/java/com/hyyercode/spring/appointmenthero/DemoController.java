package com.hyyercode.spring.appointmenthero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value="/hello")
    public String getHelloWorld() {
        return "Hello World5";
    }

    // Adding comment

}