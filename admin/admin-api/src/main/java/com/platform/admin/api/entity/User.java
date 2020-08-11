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
 * 用户表 
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码 密码
     */
    @TableField("password")
    private String password;

    /**
     * 手机号 手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 昵称 昵称
     */
    @TableField("nick_name")
    private String nickName;

}
