package com.platform.common.generator.config;

/**
 * @author 吴邪
 * @date 2020/8/10 17:33
 */
public class GeneratorConfig {

    /** 作者 */
    public static final String author = "admin";

    /** 生成包路径 */
    public static final String packageName = "com.platform";
    public static final String moduleName = "admin";

    /** 代码输出路径 */
    public static final String outputDirPath = "/platform-codegen/";

    /** 数据源URL */
    public static final String url = "jdbc:mysql://localhost:3306/platform_admin?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    public static final String driverName = "com.mysql.cj.jdbc.Driver";
    public static final String username = "root";
    public static final String password = "123456";

    /** 表前缀*/
    public static final String tablePrefix = "sys";

    /** 文件名 */
    public static final String mapperName = "%sMapper";
    public static final String xmlName = "%sMapper";
    public static final String serviceName = "%sService";
    public static final String serviceImplName = "%sServiceImpl";
    public static final String controllerName = "%sController";

}
