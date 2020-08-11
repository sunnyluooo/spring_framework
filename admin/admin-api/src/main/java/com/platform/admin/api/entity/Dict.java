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
 * 字典表 字典表
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Data
@Accessors(chain = true)
@TableName("sys_dict")
public class Dict extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 自增id 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型 类型
     */
    @TableField("type")
    private String type;

    /**
     * 字典名称 字典名称
     */
    @TableField("label")
    private String label;

    /**
     * 字典值 字典值
     */
    @TableField("value")
    private String value;

    /**
     * 描述 描述
     */
    @TableField("description")
    private String description;
}
