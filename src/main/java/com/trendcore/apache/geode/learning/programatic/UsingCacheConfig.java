package com.trendcore.apache.geode.learning.programatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingCacheConfig {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic-cache-config.xml");
        Object gemfireCache = applicationContext.getBean("gemfireCache");

        System.out.println(gemfireCache);
    }

}
