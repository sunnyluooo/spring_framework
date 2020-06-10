package com.platform.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.security.auth.login.Configuration;

/**
 * @author: 吴邪
 * @date: 2020/6/10 14:32
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Configuration.class,args);
    }
}
