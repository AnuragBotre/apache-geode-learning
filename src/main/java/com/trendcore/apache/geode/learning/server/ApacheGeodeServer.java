package com.trendcore.apache.geode.learning.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;

@SpringBootApplication
@CacheServerApplication(locators = "localhost[10334]")
public class ApacheGeodeServer {

    public static void main(String[] args) {
        SpringApplication.run(ApacheGeodeServer.class,args);
    }

}
