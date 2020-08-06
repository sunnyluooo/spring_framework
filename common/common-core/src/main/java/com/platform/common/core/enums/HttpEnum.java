package com.platform.common.core.enums;

import lombok.AllArgsConstructor;

/**
 * HTTP状态枚举类
 * @author: 吴邪
 * @date: 2020/5/13 15:20
 */
@AllArgsConstructor
public enum HttpEnum {
    SUCCESS("200","成功"),
    BAD_REQUEST("400", "无效的参数"),
    UNAUTHORIZED("401", "尚未认证"),
    AUTHENTICATE_FAIL("402", "认证失败"),
    FORBIDDEN("403", "权限不足"),
    INTERNAL("500","系统内部异常");


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
