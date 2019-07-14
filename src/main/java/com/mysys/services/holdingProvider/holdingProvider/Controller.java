package com.mysys.services.holdingProvider.holdingProvider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String home() {
        return "version 1.0";
    }

    @RequestMapping("/test")
    public String healthCheck() {
        return "Springboot started.";
    }
}
