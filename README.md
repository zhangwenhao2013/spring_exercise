**Spring 基础学习**

第1:

1 : IoC , 控制反转,  类本身不创建其依赖对象，而是由其他外键实体将其传入；
 IoC 控制反转也是 Java 7大设计原则之一 依赖倒置,单一职责的一种体现；
 
2: Ioc 中的Dependency Injection 依赖注入,注入方式有 : 
    2.1 构造注入
    2.2 set注入
    2.3 接口注入
    目的都是为了给目标类提供相应的实例对象;
    
3:  Spring  bean 初始化的方式;
    
    1:BeanFactory 是一个接口,用于从获取配置文件中的类的实例;
    
    2:ApplicationContext :也是一个接口,具体的实现类是IoC 的容器;
    
    3: XML 注册方式:
    
        3.1: 创建配置文件.根<beans> </beans>
        
        3.2: 添加需要注册的对象,使用<bean/> 标签; 可以设置id ,class
        
        3.3: 类与类之间的依赖关系,通过 set注入, 构造注入两种方式实现
        分别使用 <bean>下的标签<property>  <constructor-arg>;
        
        3.4 : set 注入: <property name="iDao" ref="daoImpl"/> 其中的 name 必须和对象中的字段名一致 ;
        而且需要提供相应的set 方法;
        
        3.5 : 构造注入:  <constructor-arg name="iDao" ref="daoImpl"/> 其中name 是构造函数的字段名;
        
4: Aware 接口

    1:  实现了Aware接口的Bean 可以在完成注册之后 ,拿到IoC 容器的一些信息; 比如 BeanNameAware 可以获取到ID名称
    ApplicationContextAware 可以获取到ApplicationContext 容器;
    
    
5: XML 注册方式的  自动装配

    1 : <beans  default-autowire="byName" ></beans> 
    
    2 : 自动装配的类型有,  No, byName (id 的形式) , byType (类型), construct (构造,其本质也是 byType);
    
    
6: 使用注解方式 实现Bean的自动检测 和  自动注册

    1: 自动检测的基础  Bean 需要被类注解注解 ;@Component 及其 被@Component注解的注解;
    
    2: 容器配置文件 
    
        2.1:<context:annotation> 在类注册完成之后, 在类注册完成之后, 在类注册完成之后, 处理 属性 ,方法的注解;
            具体使用暂时还不清楚, 可能是使用这个标签会激活 一些注解;
        
        2.2:<context:coponent-scan> 自动扫描包下的Bean;
        
        2.3: 扫描的过滤规则'
            <context:exclude-filter type="5种规则" expression="xxx"/>
            
            annotation , assignable (类名), aspectj ,regex ,custom (实现了Spring 下的TypeFilter 接口的实现类)
            
        2.4 : 禁用自动发信与注册 use-default-filter = "false"
        
        2.5: @Component  注解(通用注解)
             @Repository  注解(DAO)
             @Service      注解(service)
             @Controller   注解(MVC)的Controller类
        
    

    
    
        
      
    


