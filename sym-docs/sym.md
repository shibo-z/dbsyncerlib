## Symmetric-ds 简述
symmetric-ds将文件同步的流程与数据库同步的流程设计为一样的。
数据库同步：
* 使用jdbc，一般利用数据库的触发器来实现。
    * 但并不总是这样，因为symmetric-ds支持的数据库种类中，有不支持触发器的。
* 普通sym服务向主服务注册，所有信息存储在主服务的数据库中。主服务的数据库有两种选则：
    * 将同步节点数据库作为主服务的库，将sym服务的所有相关信息存储在同步节点上
    * （推荐）主服务拥有自己的数据库，但要注意，每组任务的信息要独立存储，用h2或sqlite比较合适。若数据库为load only,则只能使用这种架构支持

文件同步：
* 自然只能选取主服务自带库的方式啦
* 在同步目录的根下生成agent

## 部署架构图

## 软件架构图
swagger-ui已合并入server  
csv已合并入io
![](imgs/sym_arch_simple.png)

## 软件模块说明
### [server](sym-server.md)
内置jetty作为容器，为sym提供http接口，多服务间通过http进行交互

### [clent](sym-client.md)
sym的命令客户端，也作为server模块的低级封装

### [core](sym-core.md)
sym的核心

### [jdbc](sym-jdbc.md)
对各种数据库的支持，能通过jdbc创建触发器和查询

### [io](sym-io.md)
包含用于读、写与转换的处理器

### [db](sym-db.md)
使用sql与数据库交互