package com.platform.common.core.exception;


import com.platform.common.core.enums.HttpEnum;

/**
 * @author 吴邪
 * craeted: 2020/1/9
 */
public class ParameterException extends BusinessException {

    public ParameterException() {
        super(HttpEnum.BAD_REQUEST);
    }

    public ParameterException(String reason) {
        super(HttpEnum.BAD_REQUEST, reason);
    }
}
