package com.platform.common.core.base;

import com.platform.common.core.enums.HttpEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 自定义返回类
 * @author: 吴邪
 * @date: 2020/5/13 15:17
 */
@Data
@AllArgsConstructor
public class R<T>{
    private String code;
    private String msg;
    private T data;

    public static R success(){
        return new R(HttpEnum.SUCCESS,null);
    }

    public static R fail(HttpEnum HttpEnum){
        return new R(HttpEnum,null);
    }

    public static R fail(String errorMsg){
        return new R(HttpEnum.INTERNAL,errorMsg,null);
    }

    public static R exception(){
        return new R(HttpEnum.INTERNAL,null);
    }

    public static<T> R success(T data){
        return new R(HttpEnum.SUCCESS,data);
    }

    public R(HttpEnum HttpEnum, T data){
        this.code = HttpEnum.getCode();
        this.msg = HttpEnum.getMsg();
        this.data = data;
    }

    public R(HttpEnum HttpEnum, String errorMsg, T data){
        this.code = HttpEnum.getCode();
        this.msg = errorMsg;
        this.data = data;
    }
}
