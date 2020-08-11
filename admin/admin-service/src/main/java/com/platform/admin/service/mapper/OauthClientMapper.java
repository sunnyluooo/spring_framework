package com.platform.admin.service.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.admin.api.entity.OauthClient;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Oauth2客户端认证表  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Repository
public interface OauthClientMapper extends BaseMapper<OauthClient> {

}
