# SpringBoot+MyBatis 实现 多数据源切换
大致实现步骤如下:  
1, 在application.yml 中配置多个数据源
2, 手动创建多个数据源 bean
3, 创建 MyBatis 操作数据源相关实例: SqlSessionFactory, SqlSessionTemplate
4, 创建 Spring 提供的事务管理器 实例: DataSourceTransactionManager 



优点:  
实现简单

缺点:  
无法动态切换数据源(只能把 mapper接口 放在 **指定的包** 下, 然后利用 @MapperScan 扫描 **指定的包** 来实现多数据源的切换)