package com.platform.service.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 吴邪
 * @date: 2020/6/12 9:13
 */
@RestController
public class TestController {

//    @PreAuthorize("AAA")
//    @GetMapping("/test")
//    public String test(){
//        return SecurityContextHolder.getContext().getAuthentication().getName();
//    }

    @GetMapping("test")
    public String test(){
        return "test";
    }
}
