## dbsyncerlib
* 基于symmetric-ds框架3.13.10版本  
* symmetric-ds是一个国外开源的数据库同步（重心）与文件同步的框架，详见[官网](https://www.symmetricds.org/)，如果使用sym框架，务必仔细阅读官方文档  
* 本项目对symmetric-ds提供一些扩展，集成在自己的项目中，使得自己的项目支持数据库同步（就是要集成入一个项目再使用，因为symmetric-ds开源版是不包含界面的）

## 目录说明
dbsyncerlib是个单纯的文件夹，symmetric-assemble是项目入口
```text
dbsyncerlib             -- 单纯的文件夹 
 ├── symmetric-assemble -- 项目入口，用于构建。使用idea打开此文件夹 
 ├── symmetric-client   -- 低级客户端(命令)，可视为server模块的低级封装
 ├── symmetric-core     -- 核心 
 ├── symmetric-csv      -- 读写csv进行输入输出 
 ├── symmetric-db       -- 使用sql操作数据库 
 ├── symmetric-io       -- 读写与数据转换的处理 
 ├── symmetric-jdbc     -- 对数据库进行操作的功能扩展 
 ├── symmetric-server   -- 以服务方式启动，提供http接口管理节点与任务 
 ├── symmetric-util     -- 通用工具 
 └── symmetric-wrapper  -- 打包到各个容器的抽象层 
```
模块依赖如图：swagger-ui已合并入server
![](sym-docs/imgs/sym_arch_simple.png)

## 初始化
> gradle解析并加载模块
```shell
gradlew develop
```

## 集成
### 依赖
* 本项目源码放到源项目中
* 本项目执行以下命令（assemble中），生成jar包。原项目直接对这些jar包进行依赖

```shell
gradlew jar
```

### 原项目做些什么
* 提供服务配置文件
* 页面的参数足够生成数据库节点的配置文件，sym会根据这个配置文件创建节点对象。symmetric-ds比较灵活，生成什么样的配置文件（节点间如何同步），取决于业务需要
* symmetric-ds本身复杂度比较高，可以扩展些代码提高系统健壮性，比如检查，强制保持一致性等

## 升级
笨方法，嘿嘿。  
有缘人，用这个版本就用（目前官方正在维护3.14版本，等稳定了更新）。嫌版本低的话，看了这个项目你自己也就会了。