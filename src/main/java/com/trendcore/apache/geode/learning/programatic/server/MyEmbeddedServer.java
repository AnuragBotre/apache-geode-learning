package com.trendcore.apache.geode.learning.programatic.server;

import org.apache.geode.distributed.ServerLauncher;

public class MyEmbeddedServer {

    public static void main(String[] args){
        ServerLauncher serverLauncher  = new ServerLauncher.Builder()
                .setMemberName("server1")
                .setServerPort(40405)
                .set("jmx-manager", "true")
                .set("jmx-manager-start", "true")
                .build();

        serverLauncher.start();

        serverLauncher.waitOnServer();

        System.out.println("Cache server successfully started");
    }
}
