package com.platform.common.generator.wrapper;

import com.baomidou.mybatisplus.core.enums.SqlLike;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.platform.common.core.base.BaseEntity;
import com.platform.common.generator.config.GeneratorConfig;

/**
 * 参考文档： https://mp.baomidou.com/config/generator-config.html#dbtype
 *
 * @author 吴邪
 * @date 2020/8/10 17:49
 */
public class AutoGeneratorWrapper {
    private static AutoGenerator mpg;

    public static AutoGenerator getDefaultInstance(){
        if (mpg == null) {
            mpg = new AutoGenerator();
            defaultInit();
        }
        return mpg;
    }

    private static void defaultInit(){
        setGlobalConfig();   //全局配置
        setDataSourceConfig(); //数据源配置
        setStrategyConfig();   //策略配置
        setPackageConfig();    //包名配置
    }

    /**
     * 全局配置
     */
    private static void setGlobalConfig(){
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(GeneratorConfig.outputDirPath);
        gc.setAuthor(GeneratorConfig.author);
        gc.setMapperName(GeneratorConfig.mapperName);
        gc.setXmlName(GeneratorConfig.xmlName);
        gc.setServiceName(GeneratorConfig.serviceName);
        gc.setServiceImplName(GeneratorConfig.serviceImplName);
        gc.setControllerName(GeneratorConfig.controllerName);
        mpg.setGlobalConfig(gc);
    }

    /**
     * 数据源配置
     */
    private static void setDataSourceConfig(){
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(GeneratorConfig.url);
        dsc.setDriverName(GeneratorConfig.driverName);
        dsc.setUsername(GeneratorConfig.username);
        dsc.setPassword(GeneratorConfig.password);
        mpg.setDataSource(dsc);
    }

    /**
     * 数据库表配置
     */
    private static void setStrategyConfig(){
        StrategyConfig sc = new StrategyConfig();
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setSuperEntityClass(BaseEntity.class);
        sc.setTablePrefix(GeneratorConfig.tablePrefix);
        sc.setSuperEntityColumns("createBy","createTime","updateBy","updateTime","delFlag");
        sc.setLikeTable(new LikeTable(GeneratorConfig.tablePrefix, SqlLike.RIGHT));
        sc.setRestControllerStyle(true);
        sc.setEntityTableFieldAnnotationEnable(true);
        sc.setLogicDeleteFieldName("delFlag");
        mpg.setStrategy(sc);
    }

    /**
     * 包名配置
     */
    private static void setPackageConfig(){
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(GeneratorConfig.moduleName);
        pc.setParent(GeneratorConfig.packageName);
        mpg.setPackageInfo(pc);
    }
}
