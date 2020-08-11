package com.platform.admin.service.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.admin.api.entity.Menu;
import com.platform.admin.service.mapper.MenuMapper;
import com.platform.admin.service.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表  服务实现类
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
