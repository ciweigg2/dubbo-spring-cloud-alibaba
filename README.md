### Dubbo Spring Cloud Alibaba

多表关联那个Diboot查询 但是Diboot只能在当前模块使用 因为正常架构是每个服务一个数据库的

数据库设计的时候就要想好表之间的关系 才能开始写代码 否则会导致循环依赖等问题的

这是一套dubbo比较基础的框架 数据库脚本存放在笔记中 搜索dubbo-spring-cloud-alibaba.sql

集成Seata解决分布式事务的问题

集成Nacos注册中心

集成Mysql数据库

集成Dubbo解决Rpc调用

集成Diboot解决多表查询