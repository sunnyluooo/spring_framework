package com.platform.gateway.config;

import com.platform.gateway.manager.DefaultAuthenticationManager;
import com.platform.gateway.manager.DefaultAuthorizationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.oauth2.server.resource.web.server.ServerBearerTokenAuthenticationConverter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.AuthenticationWebFilter;

/**
 * @author: 吴邪
 * @date: 2020/7/31 20:26
 */
@Configuration
@EnableResourceServer
@EnableWebFluxSecurity
public class SecurityConfig  {

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    /** 认证管理器 */
    @Autowired
    DefaultAuthenticationManager authenticationManager;
    /** 授权管理器 */
    @Autowired
    DefaultAuthorizationManager authorizationManager;

    @Bean
    public RedisTokenStore redisTokenStore(){
        return new RedisTokenStore(redisConnectionFactory);
    }

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
        AuthenticationWebFilter authenticationWebFilter = new AuthenticationWebFilter(authenticationManager);
        authenticationWebFilter.setServerAuthenticationConverter(new ServerBearerTokenAuthenticationConverter());

        return http.csrf().disable()
                .httpBasic().disable()
                .authorizeExchange()
                .pathMatchers(HttpMethod.OPTIONS,"/oauth/**").permitAll() // 路径白名单
                .anyExchange().access(authorizationManager)
                .and().addFilterAt(authenticationWebFilter, SecurityWebFiltersOrder.AUTHENTICATION).build();
    }
}
