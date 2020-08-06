package com.platform.common.core.exception;


import com.platform.common.core.enums.HttpEnum;

/**
 * @author 吴邪
 * craeted: 2020/1/13
 */
public class InternalException extends BusinessException {

    public InternalException() {
        super(HttpEnum.INTERNAL);
    }

    public InternalException(String reason) {
        super(HttpEnum.INTERNAL, reason);
    }
}
