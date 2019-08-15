package com.trendcore.apache.geode.learning.programatic;

import org.apache.geode.cache.Cache;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.RegionFactory;
import org.apache.geode.cache.RegionShortcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreatingRegions {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("basic-cache-config.xml");
        Cache cache = (Cache) applicationContext.getBean("gemfireCache");

        RegionFactory<Object, Object> regionFactory = cache.createRegionFactory(RegionShortcut.REPLICATE);

        Region<Object, Object> customerRegion = regionFactory.create("Customer");

        Region<Object, Object> region = customerRegion;
        region.create("abc","pqr");

        Object abc = region.get("abc");

        System.out.println(abc);

        System.out.println(cache);
    }

}
