package com.mysys.services.holdingProvider.holdingProvider;

import org.springframework.web.bind.annotation.RequestMapping;


public interface Controller {

    @RequestMapping("/")
    public String home();

    @RequestMapping("/test")
    public String healthCheck();

}
