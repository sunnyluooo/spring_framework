package com.platform.service.admin.config;

/**
 * @author: trayvonn
 * @date: 2020/6/12 23:15
 */
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//        resources.resourceId("*").stateless(true);
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and().requestMatchers().anyRequest()
//                .and().anonymous()
//                .and().authorizeRequests()
//                .antMatchers("/**/api/**").authenticated();  //配置访问权限控制，必须认证过后才可以访问
//    }
//}
