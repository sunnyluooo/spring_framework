package com.platform.admin.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.admin.api.entity.OauthClient;
import com.platform.admin.service.mapper.OauthClientMapper;
import com.platform.admin.service.service.OauthClientService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Oauth2客户端认证表  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Service
public class OauthClientServiceImpl extends ServiceImpl<OauthClientMapper, OauthClient> implements OauthClientService {

}
