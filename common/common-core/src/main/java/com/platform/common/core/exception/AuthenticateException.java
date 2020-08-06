package com.platform.common.core.exception;


import com.platform.common.core.enums.HttpEnum;

/**
 * @author 吴邪
 * craeted: 2020/1/10
 */
public class AuthenticateException extends BusinessException {

    public AuthenticateException(String msg) {
        super(HttpEnum.AUTHENTICATE_FAIL, msg);
    }

    public AuthenticateException() {
        super(HttpEnum.AUTHENTICATE_FAIL);
    }
}
