package com.platform.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.platform.common.core.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * Oauth2客户端认证表 
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_oauth_client")
public class OauthClient extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 自增id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客户端id 客户端id
     */
    @TableField("client_id")
    private String clientId;

    /**
     * 客户端秘钥 客户端秘钥
     */
    @TableField("client_secret")
    private String clientSecret;

    /**
     * 范围 范围
     */
    @TableField("scope")
    private String scope;

    /**
     * 认证类型 认证类型（password,refresh_token）
     */
    @TableField("authorized_grant_types")
    private String authorizedGrantTypes;

}
