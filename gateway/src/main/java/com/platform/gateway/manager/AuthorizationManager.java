package com.platform.gateway.manager;

import cn.hutool.core.collection.ConcurrentHashSet;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.ReactiveAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;

/**
 * @author: 吴邪
 * @date: 2020/8/5 17:48
 */
@Component
public class AuthorizationManager implements ReactiveAuthorizationManager<AuthorizationContext> {

    private Set<String> permitAll = new ConcurrentHashSet<>();
    private static final AntPathMatcher antPathMatcher = new AntPathMatcher();

    public AuthorizationManager (){

    }

    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> authentication, AuthorizationContext authorizationContext) {
        ServerWebExchange exchange = authorizationContext.getExchange();
        String requestPath = exchange.getRequest().getURI().getPath();
        if(permitAll(requestPath)){
            return Mono.just(new AuthorizationDecision(true));
        }
        return null;
    }

    private boolean permitAll(String requestPath) {
        return permitAll.stream()
                .anyMatch(r -> antPathMatcher.match(r, requestPath));
    }
}
