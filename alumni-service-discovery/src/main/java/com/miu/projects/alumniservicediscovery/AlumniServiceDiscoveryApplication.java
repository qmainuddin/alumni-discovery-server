package com.miu.projects.alumniservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AlumniServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlumniServiceDiscoveryApplication.class, args);
    }

}
