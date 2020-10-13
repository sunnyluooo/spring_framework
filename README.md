# platform

* **eureka** *2.2.2.RELEASE*
* **spring cloud config** *2.2.2.RELEASE*
* **spring boot**  *2.2.6.RELEASE*

### 包结构

```
platform-cloud
|
├──common --通用包
|  |
|  ├──core --核心包
|
├──config --cloud统一配置中心
|
├──eureka --注册中心
|
├──gateway --网关
|
├──admin --admin服务模块
|  |
|  ├──admin-api --系统业务api
|  |
|  ├──admin-service --系统业务service
|

```

### 启动顺序
1. eureka
2. config
3. gateway
4. auth
5. admin

### 获取token
```
 Basic Auth : username: client password: client 
 http://localhost:9002/auth/oauth/token?grant_type=password&username=admin&password=admin&scope=all
```

