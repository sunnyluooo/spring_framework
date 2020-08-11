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
 * 菜单表 
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_menu")
public class Menu extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单名称 菜单名称
     */
    @TableField("name")
    private String name;

    /**
     * 菜单权限标识 菜单权限标识
     */
    @TableField("permission")
    private String permission;

    /**
     * 父节点id 父节点id
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * 菜单类型 菜单类型（0菜单 1按钮）
     */
    @TableField("type")
    private Integer type;

    /**
     * 菜单路径 菜单路径
     */
    @TableField("path")
    private String path;

}
