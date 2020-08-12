package com.platform.admin.service.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.platform.admin.api.entity.OauthClient;
import com.platform.admin.service.service.OauthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Oauth2客户端认证表  前端控制器
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@RestController
@RequestMapping("/oauthClient")
public class OauthClientController {

    @Autowired
    OauthClientService oauthClientService;

    @GetMapping("byClientId")
    public OauthClient getByClientId(String clientId){
        return oauthClientService.getOne(Wrappers.<OauthClient>lambdaQuery().eq(OauthClient::getClientId,clientId));
    }
}

