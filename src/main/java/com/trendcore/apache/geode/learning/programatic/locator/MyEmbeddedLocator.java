package com.trendcore.apache.geode.learning.programatic.locator;

import org.apache.geode.distributed.LocatorLauncher;

public class MyEmbeddedLocator {

    public static void main(String[] args) throws InterruptedException {
        LocatorLauncher locatorLauncher  = new LocatorLauncher.Builder()
                .setMemberName("locator1")
                .setPort(13489)
                .build();

        locatorLauncher.start();

        locatorLauncher.waitOnLocator();

        System.out.println("Locator successfully started");
    }

}
