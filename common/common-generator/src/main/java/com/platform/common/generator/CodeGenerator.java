package com.platform.common.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.platform.common.generator.wrapper.AutoGeneratorWrapper;

/**
 * @author 吴邪
 * @date 2020/8/10 17:14
 */
public class CodeGenerator  {

    public static void main(String[] args) {
        AutoGenerator defaultInstance = AutoGeneratorWrapper.getDefaultInstance();
        defaultInstance.execute();
    }
}
