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
public class DefaultAuthorizationManager implements ReactiveAuthorizationManager<AuthorizationContext> {

    private final Set<String> permitAll = new ConcurrentHashSet<>();
    private static final AntPathMatcher antPathMatcher = new AntPathMatcher();

    public DefaultAuthorizationManager (){
        // permitAll url
        permitAll.add("");
    }

    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> authentication, AuthorizationContext authorizationContext) {
        ServerWebExchange exchange = authorizationContext.getExchange();
        String requestPath = exchange.getRequest().getURI().getPath();
        // 资源放行
        if(permitAll(requestPath)){
            return Mono.just(new AuthorizationDecision(true));
        }
        return authentication.map(auth-> new AuthorizationDecision(checkAuthorities(exchange,auth,requestPath))).defaultIfEmpty(new AuthorizationDecision(false));
    }

    private boolean permitAll(String requestPath) {
        return permitAll.stream()
                .anyMatch(r -> antPathMatcher.match(r, requestPath));
    }

    @Override
    public Mono<Void> verify(Mono<Authentication> authentication, AuthorizationContext object) {
        return null;
    }

    private boolean checkAuthorities(ServerWebExchange exchange,Authentication auth,String requestPath){
        return true;
    }
}
