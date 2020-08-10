package com.platform.common.generator.wrapper;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.platform.common.generator.config.GeneratorConfig;

/**
 * 参考文档： https://mp.baomidou.com/config/generator-config.html#dbtype
 *
 * @author 吴邪
 * @date 2020/8/10 17:49
 */
public class AutoGeneratorWrapper {
    private static AutoGenerator mpg;

    public AutoGenerator getDefaultInstance(){
        if(mpg != null){
            return mpg;
        }else{
            return mpg = defaultInit(new AutoGenerator());
        }
    }

    private AutoGenerator defaultInit(AutoGenerator mpg){

        return mpg;
    }

    /**
     * 全局配置
     */
    public AutoGenerator setGlobalConfig(){
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(GeneratorConfig.outputDirPath);
        gc.setAuthor(GeneratorConfig.author);
        gc.setMapperName(GeneratorConfig.mapperName);
        gc.setXmlName(GeneratorConfig.xmlName);
        gc.setServiceName(GeneratorConfig.serviceName);
        gc.setServiceImplName(GeneratorConfig.serviceImplName);
        gc.setControllerName(GeneratorConfig.controllerName);
        mpg.setGlobalConfig(gc);
        return mpg;
    }

    /**
     * 数据源配置
     */
    public AutoGenerator setDataSourceConfig(){
        return mpg;
    }

    /**
     * 数据库表配置
     */
    public AutoGenerator setStrategyConfig(){
        return mpg;
    }

    /**
     * 包名配置
     */
    public AutoGenerator setPackageConfig(){
        return mpg;
    }
}
