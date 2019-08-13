package com.trendcore.apache.geode.learning.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.CacheServerApplication;
import org.springframework.data.gemfire.config.annotation.EnableLocator;
import org.springframework.data.gemfire.config.annotation.EnableManager;

@CacheServerApplication(locators = "localhost[10334]")
@SpringBootApplication
public class ApacheGeodeLocator {

    @Configuration
    @EnableLocator
    @EnableManager(start = true)
    public static class LocatorConfiguration{
    }

    public static void main(String[] args) {
        SpringApplication.run(ApacheGeodeLocator.class,args);
    }

}
