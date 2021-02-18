package com.nagp.ucp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UcpDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UcpDiscoveryServerApplication.class, args);
    }

}
