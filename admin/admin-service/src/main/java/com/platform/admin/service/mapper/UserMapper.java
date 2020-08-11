package com.platform.admin.service.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.platform.admin.api.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2020-08-11
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
