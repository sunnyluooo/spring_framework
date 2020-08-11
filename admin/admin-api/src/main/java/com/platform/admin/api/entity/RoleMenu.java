package com.platform.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色菜单关联表 
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_role_menu")
public class RoleMenu {

    private static final long serialVersionUID=1L;

    /**
     * 自增id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色id 角色id
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 菜单id 菜单id
     */
    @TableField("menu_id")
    private Integer menuId;

}
