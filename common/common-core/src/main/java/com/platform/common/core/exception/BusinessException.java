package com.platform.common.core.exception;

import com.platform.common.core.enums.HttpEnum;
import lombok.Data;

/**
 * @author 吴邪
 * craeted: 2020/1/9
 */
@Data
public abstract class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -6175808415650755522L;
    private String code;
    private String msg;

    public BusinessException(HttpEnum status) {
        super(status.getMsg());
        this.code = status.getCode();
        this.msg = status.getMsg();
    }

    public BusinessException(HttpEnum status, String msg) {
        super(msg);
        this.code = status.getCode();
        this.msg = msg;
    }

    public BusinessException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

}
