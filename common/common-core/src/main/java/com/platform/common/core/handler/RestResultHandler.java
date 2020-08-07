package com.platform.common.core.handler;

import cn.hutool.json.JSONUtil;
import com.platform.common.core.base.R;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;

/**
 * @author 吴邪
 * @date: 2020/8/6 14:42
 */
@RestControllerAdvice
public class RestResultHandler implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        Class<?> declaringClass = methodParameter.getDeclaringClass();
        Method method = methodParameter.getMethod();
        if (!declaringClass.getPackage().getName().startsWith("com.platform")) {
            return false;
        }

        // 类标注@RestController注解的所有接口返回值都需要特殊处理
        // 方法标注@ResponseBody注解的接口返回值需要特殊处理
        RestController restController = declaringClass.getAnnotation(RestController.class);

        if (restController != null && method != null) {
            return method.getAnnotation(ResponseBody.class) != null;
        }

        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        // 接口返回的是RestResult响应格式不用处理直接返回出去
        if (body instanceof R) {
            return body;
        }

        // 返回字符串要单独处理(HttpMessageConverter)
        if (body instanceof String || mediaType == MediaType.TEXT_PLAIN) {
            if (serverHttpResponse instanceof ServletServerHttpResponse) {
                serverHttpResponse.getHeaders().set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
            }
            return JSONUtil.toJsonStr(R.success(body));
        }

        return R.success(body);
    }
}
