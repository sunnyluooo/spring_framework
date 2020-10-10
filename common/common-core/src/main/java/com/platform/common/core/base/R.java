package com.platform.common.core.base;

import com.platform.common.core.enums.HttpEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义返回类
 * @author: 吴邪
 * @date: 2020/5/13 15:17
 */
@Data
@NoArgsConstructor
public class R<T>{
    private String code;
    private String msg;
    private T data;

    public static R success(){
        return new R(HttpEnum.SUCCESS,null);
    }

    public static R fail(HttpEnum status){
        return new R(status,null);
    }

    public static R fail(HttpEnum status,String msg){
        return new R(status,msg,null);
    }

    public static R fail(String code,String msg){
        return new R(code,msg,null);
    }

    public static R fail(String msg){
        return new R(HttpEnum.INTERNAL,msg,null);
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

    public R(HttpEnum HttpEnum, String msg, T data){
        this.code = HttpEnum.getCode();
        this.msg = msg;
        this.data = data;
    }

    public R(String code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
