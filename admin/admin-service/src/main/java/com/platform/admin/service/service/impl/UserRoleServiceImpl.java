package com.platform.admin.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.admin.api.entity.UserRole;
import com.platform.admin.service.mapper.UserRoleMapper;
import com.platform.admin.service.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
