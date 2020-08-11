package com.platform.admin.service.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.admin.api.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 角色菜单关联表  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Repository
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

}
