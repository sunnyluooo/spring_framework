package com.platform.gateway.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author: 吴邪
 * @date: 2020/8/5 16:11
 */
@Component
public class DefaultAuthenticationManager implements ReactiveAuthenticationManager {

    @Autowired
    RedisTokenStore tokenStore;

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
//        return Mono.justOrEmpty(authentication)
//                .filter(a -> a instanceof BearerTokenAuthenticationToken)
//                .cast(BearerTokenAuthenticationToken.class)
//                .map(BearerTokenAuthenticationToken::getToken)
//                .flatMap((accessToken ->{
//                    OAuth2AccessToken oAuth2AccessToken = this.tokenStore.readAccessToken(accessToken);
//                    //根据access_token从数据库获取不到OAuth2AccessToken
//                    if(oAuth2AccessToken == null){
//                        return Mono.error(new InvalidTokenException("invalid access token,please check"));
//                    }else if(oAuth2AccessToken.isExpired()){
//                        return Mono.error(new InvalidTokenException("access token has expired,please reacquire token"));
//                    }
//
//                    OAuth2Authentication oAuth2Authentication =this.tokenStore.readAuthentication(accessToken);
//                    if(oAuth2Authentication == null){
//                        return Mono.error(new InvalidTokenException("Access Token 无效!"));
//                    }else {
//                        return Mono.just(oAuth2Authentication);
//                    }
//                })).cast(Authentication.class);
        return null;
    }
}