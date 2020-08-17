package com.platform.admin.service.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.platform.admin.api.entity.User;
import com.platform.admin.service.service.UserService;
import com.platform.common.core.constant.ConstantPublic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("byUsername")
    public User getByUsername(@RequestParam("username") String username){
        return userService.getOne(Wrappers.<User>lambdaQuery()
                .eq(User::getUsername,username)
                .eq(User::getDelFlag, ConstantPublic.NO));
    }
}

