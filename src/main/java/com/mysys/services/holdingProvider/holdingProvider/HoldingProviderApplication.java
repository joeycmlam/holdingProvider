package com.mysys.services.holdingProvider.holdingProvider;


import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class HoldingProviderApplication implements Controller {


    @Autowired
    private EurekaClient eurekaClient;



    @Value("${spring.application.name}")
    private String appName;


    public static void main(String[] args) {
        SpringApplication.run(HoldingProviderApplication.class, args);
    }

    @Override
    public String home() {
        return String.format("[%s]: version 1.0", eurekaClient.getApplication(appName).getName());
    }

    @Override
    public String healthCheck() {
        return String.format("[%tc]: SpringBoot [%s] started.", (new Date()), this.appName);
    }
}
