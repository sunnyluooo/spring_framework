package com.platform.auth.service.impl;

import cn.hutool.core.util.StrUtil;
import com.platform.auth.feign.UserFeignClient;
import com.platform.common.core.base.R;
import com.platform.common.core.feign.FeignOptional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 吴邪
 * @date: 2020/6/12 14:17
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserFeignClient userFeignClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        R<com.platform.admin.api.entity.User> byUsername = userFeignClient.getByUsername(username);
        com.platform.admin.api.entity.User user = FeignOptional.of(byUsername).orElseThrow(() -> new UsernameNotFoundException("用户名或密码错误"));
        if(StrUtil.equals(username,"admin")){
            String password = passwordEncoder.encode("admin");
            System.out.println(password);
            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            return new User(username,password, grantedAuthorities);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
