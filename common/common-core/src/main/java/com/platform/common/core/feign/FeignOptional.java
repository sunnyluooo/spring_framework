package com.platform.common.core.feign;

import com.platform.common.core.base.R;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * 用来操作feign返回结果的容器类，处理对象为R<T>
 * {@link java.util.Optional}
 *
 * @author 吴邪
 * @date 2020/8/12 16:37
 */
public class FeignOptional<T> {
    /**
     * 结果值
     */
    private R<T> value;

    public FeignOptional(R<T> value){
        this.value = Objects.requireNonNull(value);
    }

    /**
     * 将R对象设置到value
     * @param value R<T>
     * @param <T> T
     * @return FeignOptional<T>
     */
    public static <T> FeignOptional<T> of(R<T> value){
        return new FeignOptional<>(value);
    }

    /**
     * 正常获取R.data的值，默认成功
     * @return T
     */
    public T get(){
        return value.getData();
    }

    /**
     * 获取R.data的值，假设data的值为null，则返回替代对象
     * @return T
     */
    public T orElse(T other){
        return value.getData() == null?other:value.getData();
    }

    /**
     * 获取R.data的值，假设data的值为null，则抛出异常
     * @param ex ex
     * @return T
     * @throws Throwable ex
     */
    public <E extends Throwable> T orElseThrow(Supplier<? extends E> ex) throws E {
        if(value.getData()!=null){
            return value.getData();
        }else{
            throw ex.get();
        }
    }
}
