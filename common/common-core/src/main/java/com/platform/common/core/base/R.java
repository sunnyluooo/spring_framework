package com.platform.common.core.base;

import com.platform.common.core.enums.HttpStatusEnum;
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

    private int errorCode;
    private String errorMsg;
    private T data;

    public static R success(){
        return new R(HttpStatusEnum.SUCCESS,null);
    }

    public static R fail(HttpStatusEnum HttpStatusEnum){
        return new R(HttpStatusEnum,null);
    }

    public static R fail(String errorMsg){
        return new R(999,errorMsg,null);
    }

    public static R exception(){
        return new R(HttpStatusEnum.EXCEPTION,null);
    }

    public static<T> R success(T data){
        return new R(HttpStatusEnum.SUCCESS,data);
    }

    public R(HttpStatusEnum HttpStatusEnum,T data){
        this.errorCode = HttpStatusEnum.code;
        this.errorMsg = HttpStatusEnum.msg;
        this.data = data;
    }



}
