package com.platform.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色关联表 
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_user_role")
public class UserRole  {

    /**
     * 自增id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 角色id 角色id
     */
    @TableField("role_id")
    private Integer roleId;
}
