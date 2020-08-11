package com.platform.admin.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.admin.api.entity.Role;
import com.platform.admin.service.mapper.RoleMapper;
import com.platform.admin.service.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
