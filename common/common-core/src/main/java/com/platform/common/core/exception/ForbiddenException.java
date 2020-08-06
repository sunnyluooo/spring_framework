package com.platform.common.core.exception;


import com.platform.common.core.enums.HttpEnum;

/**
 * @author 吴邪
 * craeted: 2020/1/10
 */
public class ForbiddenException extends BusinessException {

    public ForbiddenException(String msg) {
        super(HttpEnum.FORBIDDEN, msg);
    }

    public ForbiddenException() {
        super(HttpEnum.FORBIDDEN);
    }
}
