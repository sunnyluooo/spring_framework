package com.platform.common.core.exception;


import com.platform.common.core.enums.HttpEnum;

/**
 * @author 吴邪
 * craeted: 2020/1/9
 */
public class UnauthorizedException extends BusinessException {

    public UnauthorizedException() {
        super(HttpEnum.UNAUTHORIZED);
    }

    public UnauthorizedException(String reason) {
        super(HttpEnum.UNAUTHORIZED, reason);
    }
}
