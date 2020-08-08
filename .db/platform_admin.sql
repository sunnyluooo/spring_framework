DROP TABLE sys_dict;;/*SkipError*/
CREATE TABLE sys_dict(
    del_flag INT    COMMENT '删除标识 删除标识0否1是' ,
    created_by VARCHAR(32)    COMMENT '创建人 创建人id' ,
    created_time DATETIME    COMMENT '创建时间 创建时间' ,
    updated_by VARCHAR(32)    COMMENT '更新人 更新人id' ,
    updated_time DATETIME    COMMENT '更新时间 更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '自增id 自增id' ,
    type VARCHAR(32)    COMMENT '类型 类型' ,
    label VARCHAR(32)    COMMENT '字典名称 字典名称' ,
    value VARCHAR(32)    COMMENT '字典值 字典值' ,
    description VARCHAR(128)    COMMENT '描述 描述' ,
    PRIMARY KEY (id)
) COMMENT = '字典表 字典表';;

ALTER TABLE sys_dict COMMENT '字典表';;
DROP TABLE sys_user;;/*SkipError*/
CREATE TABLE sys_user(
    del_flag INT    COMMENT '删除标识 删除标识0否1是' ,
    created_by VARCHAR(32)    COMMENT '创建人 创建人id' ,
    created_time DATETIME    COMMENT '创建时间 创建时间' ,
    updated_by VARCHAR(32)    COMMENT '更新人 更新人id' ,
    updated_time DATETIME    COMMENT '更新时间 更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT 'id 自增id' ,
    username VARCHAR(128)    COMMENT '用户名 用户名' ,
    password VARCHAR(128)    COMMENT '密码 密码' ,
    mobile VARCHAR(32)    COMMENT '手机号 手机号' ,
    nick_name VARCHAR(32)    COMMENT '昵称 昵称' ,
    PRIMARY KEY (id)
) COMMENT = '用户表 ';;

ALTER TABLE sys_user COMMENT '用户表';;
DROP TABLE sys_menu;;/*SkipError*/
CREATE TABLE sys_menu(
    del_flag INT    COMMENT '删除标识 删除标识0否1是' ,
    created_by VARCHAR(32)    COMMENT '创建人 创建人id' ,
    created_time DATETIME    COMMENT '创建时间 创建时间' ,
    updated_by VARCHAR(32)    COMMENT '更新人 更新人id' ,
    updated_time DATETIME    COMMENT '更新时间 更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT 'id 自增id' ,
    name VARCHAR(32)    COMMENT '菜单名称 菜单名称' ,
    permission VARCHAR(32)    COMMENT '菜单权限标识 菜单权限标识' ,
    parent_id INT    COMMENT '父节点id 父节点id' ,
    type INT    COMMENT '菜单类型 菜单类型（0菜单 1按钮）' ,
    path VARCHAR(128)    COMMENT '菜单路径 菜单路径' ,
    PRIMARY KEY (id)
) COMMENT = '菜单表 ';;

ALTER TABLE sys_menu COMMENT '菜单表';;
DROP TABLE sys_role;;/*SkipError*/
CREATE TABLE sys_role(
    del_flag INT    COMMENT '删除标识 删除标识0否1是' ,
    created_by VARCHAR(32)    COMMENT '创建人 创建人id' ,
    created_time DATETIME    COMMENT '创建时间 创建时间' ,
    updated_by VARCHAR(32)    COMMENT '更新人 更新人id' ,
    updated_time DATETIME    COMMENT '更新时间 更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '自增id 自增id' ,
    name VARCHAR(32)    COMMENT '角色名称 角色名称' ,
    code VARCHAR(32)    COMMENT '角色编码 角色编码' ,
    description VARCHAR(128)    COMMENT '角色描述 角色描述' ,
    PRIMARY KEY (id)
) COMMENT = '角色表 ';;

ALTER TABLE sys_role COMMENT '角色表';;
DROP TABLE sys_user_role;;/*SkipError*/
CREATE TABLE sys_user_role(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '自增id 自增id' ,
    user_id INT    COMMENT '用户id 用户id' ,
    role_id INT    COMMENT '角色id 角色id' ,
    PRIMARY KEY (id)
) COMMENT = '用户角色关联表 ';;

ALTER TABLE sys_user_role COMMENT '用户角色关联表';;
DROP TABLE sys_role_menu;;/*SkipError*/
CREATE TABLE sys_role_menu(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '自增id 自增id' ,
    role_id INT    COMMENT '角色id 角色id' ,
    menu_id INT    COMMENT '菜单id 菜单id' ,
    PRIMARY KEY (id)
) COMMENT = '角色菜单关联表 ';;

ALTER TABLE sys_role_menu COMMENT '角色菜单关联表';;
DROP TABLE sys_oauth_client;;/*SkipError*/
CREATE TABLE sys_oauth_client(
    del_flag INT    COMMENT '删除标识 删除标识0否1是' ,
    created_by VARCHAR(32)    COMMENT '创建人 创建人id' ,
    created_time DATETIME    COMMENT '创建时间 创建时间' ,
    updated_by VARCHAR(32)    COMMENT '更新人 更新人id' ,
    updated_time DATETIME    COMMENT '更新时间 更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '自增id 自增id' ,
    client_id VARCHAR(128)    COMMENT '客户端id 客户端id' ,
    client_secret VARCHAR(128)    COMMENT '客户端秘钥 客户端秘钥' ,
    scope VARCHAR(32)    COMMENT '范围 范围' ,
    authorized_grant_types VARCHAR(128)    COMMENT '认证类型 认证类型（password,refresh_token）' ,
    PRIMARY KEY (id)
) COMMENT = 'Oauth2客户端认证表 ';;

ALTER TABLE sys_oauth_client COMMENT 'Oauth2客户端认证表';;
