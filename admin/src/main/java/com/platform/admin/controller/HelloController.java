package com.platform.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lcw
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020-05-07
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("")
    public String hello(){
        return "hello world";
    }
}
