package com.platform.admin.service.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.platform.admin.api.entity.User;
import com.platform.admin.service.service.UserService;
import com.platform.common.core.constant.ConstantPublic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户表  前端控制器
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    HttpServletRequest servletRequest;

    @RequestMapping(value = "byUsername",method = {RequestMethod.GET, RequestMethod.POST})
    public User getByUsername(@RequestParam("username") String username){
        User one = userService.getOne(Wrappers.<User>lambdaQuery()
                .eq(User::getUsername, username)
                .eq(User::getDelFlag, ConstantPublic.NO));
        return one;
    }
}

