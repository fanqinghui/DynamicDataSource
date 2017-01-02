# DynamicDataSource
spring-mybatis读写分离多数据源Aop实现方式
##原理：
DataSourceAdvice类进行aop切面扫描。扫描到
query，use,count,get，find，list，load等操作的时候
在DynamicDataSource里从slaves里选择相应读数据源进行操作
默认用master主数据源进行数据库操作

##示例演示：
演示了一主一从的apo实现方式，一主多从增加从库配置即可
另外，一些负载均衡策略有需要的可以自己设置
代码只是示例。主要传播思想。。如果能满足您的需求，可以借鉴进行随意改进优化！
