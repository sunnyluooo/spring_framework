package com.platform.common.core.enums;

import lombok.AllArgsConstructor;

/**
 * HTTP状态枚举类
 * @author: 吴邪
 * @date: 2020/5/13 15:20
 */
@AllArgsConstructor
public enum HttpStatusEnum {
    SUCCESS(200,"成功"),
    BAD_REQUEST(400, "无效的参数"),
    UNAUTHORIZED(401, "认证失败"),
    FORBIDDEN(403, "权限不足"),
    EXCEPTION(500,"系统异常");

    public int code;
    public String msg;
}
