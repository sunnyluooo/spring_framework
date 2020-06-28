package com.platform.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author: 吴邪
 * @date: 2020/6/27 17:54
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = "info")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
