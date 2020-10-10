package com.platform.admin.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: 吴邪
 * @date: 2020/6/12 23:24
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.platform")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
