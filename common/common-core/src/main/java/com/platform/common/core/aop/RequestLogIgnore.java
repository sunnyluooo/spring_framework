package com.platform.common.core.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略记录接口日志注解
 * @author 吴邪
 * @date: 2020/6/5 14:26
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface RequestLogIgnore {
}
