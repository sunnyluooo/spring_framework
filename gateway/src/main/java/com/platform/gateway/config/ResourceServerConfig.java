package com.platform.gateway.config;

import com.platform.gateway.manager.DefaultAuthenticationManager;
import com.platform.gateway.manager.DefaultAuthorizationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @author: 吴邪
 * @date: 2020/7/31 20:26
 */
@Configuration
@EnableWebFluxSecurity
public class ResourceServerConfig {

    @Autowired
    RedisConnectionFactory redisConnectionFactory;
    @Autowired
    DefaultAuthenticationManager authenticationManager;
    @Autowired
    DefaultAuthorizationManager authorizationManager;

    @Bean
    public RedisTokenStore redisTokenStore(){
        return new RedisTokenStore(redisConnectionFactory);
    }

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){

        return null;
    }
}
