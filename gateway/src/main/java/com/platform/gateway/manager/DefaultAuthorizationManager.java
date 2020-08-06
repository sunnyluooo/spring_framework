package com.platform.gateway.manager;

import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.ReactiveAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: 吴邪
 * @date: 2020/8/5 17:48
 */
@Component
public class DefaultAuthorizationManager implements ReactiveAuthorizationManager<AuthorizationContext> {

    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> authentication, AuthorizationContext authorizationContext) {
        ServerWebExchange exchange = authorizationContext.getExchange();
        String requestPath = exchange.getRequest().getURI().getPath();
        return authentication.map(auth-> new AuthorizationDecision(checkAuthorities(exchange,auth,requestPath))).defaultIfEmpty(new AuthorizationDecision(false));
    }

    private boolean checkAuthorities(ServerWebExchange exchange,Authentication auth,String requestPath){
        return true;
    }
}
