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
    
    
6: 使用注解方式(其实是使用XML 配合注解的方式,后面有 纯注解的方式 @Bean) 实现Bean的自动检测 和  自动注册 

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
           
    3: 命名规则 bean名称默认是有BeanNameGenerator 生成;
    
        3.1 : 修改name 生成规则
            3.1.1: 实现BeanNameGenerator; 一定要有默认构造;
            3.1.2: 配置name-generator
                 
    4: 作用域 Scope 
        
        4.1: @Scope(scopename = "xxx")
        4.2: 自定义Scope 
            4.2.1 :实现ScopeMetadataResolver接口; 一定要有默认构造;
            4.2.2 :配置 scope-resolver ="自定义scope" 
            
 7: @Autowired
    
    1:Autowired 可以用再  构造 , 方法, 属性上
    
    2:非必要的参数  可以使用@Autowired(required = false)
    
    3:如果参数是接口, 接口又有多实例,可以配合 @Qualifier(限定)使用
    
 8: Autowired 额外提供
 
    1: Autowired 可以提供众所周知的对象的实例, 比如 ApplicationContext
    
    2: Autowired 可以提供 容器中 同属性的类的集合, 可以是 集合 ,数组 ,Map
    
    3: 如果希望数组是有序的,可以让bean实现 org.springframework.core.Ordered 接口;
    或者使用@Order注解;  order 只针对 数组有效
    
    4: Autowired 还可以通过泛型 自动装载
    
 9: 使用 Autowired  注意事项
 
    1:  @Autowired  注解是Spring BeanPostProcessor处理的,所以不能再自己的BeanPostProcessor
    或者BeanFactoryPostProcessor类型应用这些注解;这些类型必须通过XML或者Spring的@Bean注解加载;
    
 10 : @Bean
 
    1:@Bean 标识一个用于配置和初始化一个 有SpringIoC容器管理的新对象的方法，类似XML 中的<bean/>
    
    2:可以在Spring 的@Component 注解的类中使用@Bean 注解任何方法（仅仅是可以）
    
    3:通常是使用 @Configuration 配合 @Bean 使用
    
    

    ```
   
      	@Configuration
      public  class AppConfig{
      
         @Bean
         public Myservice myService( ){
            return new Myservice( );
          }
      }
      		@Bean(name = "相当于xml 中的id")
      			如果定义在方法上  默认名字是方法名
      		@Bean(initMethod = " init")
      			类似xml 中的
      		@Bean( destroyMethod ="cleanup")
      			类似xml 中的
      	<beans>
        <bean id = "myService" class = 'xxx,xxx,xxx,MyServiceIMpl">
      </beans>
      	两种效果等价
      	
      	 ```
      	 
      	 
      	
  11: 配置文件
    
    xml 方式
    
    1: 加载配置文件 <context:property location =" class:/com.ame/jdbc.properties"">
    
    2: 读取配置文件中的 key value , value = "${key}"
    
    注解方式
    
    1:加载配置文件: 类上使用 @Configuration  配合 @ImportResource("classpath:/com/ame/jdbc.properties")
    
    2:读取配置文件中的 key  value , 使用 @Value("${key}")
    
    3: 注意!!!!!  properties 的key值 ;
    
    
  12 : CustomAutowireConfigurer
  
         CustomAutowireConfigurer 是 BeanFactoryPostProcessor 的子类, 通过他可以注册自己的
         qualifier 注册类型(即使没有使用Spring的@Qualifier注解)
        
        
        这里不是 很清楚!!!!
         
         
  13 : @Resource   @PostConstruct  @preDestroy  JSR-250 标准
  
        @Resource : 默认的名称 是属性名  或者 setter 方法得出的名字.
        
        @PostConstruct: 在构造之后立即执行
        
        @PreDestroy: 在销毁之前执行
    

  14: Spring3.0 开始支持 JSR330 标准注解  
    
    1:需要引入 javax.inject 包
    
    2;@Inject 等效于 @Autowired, 可以用再类,属性,方法,构造器上;
        
    3:@Named 如果使用特定的名称进行依赖住,使用@Name 于 @Component是等效的;
        3.1 作用在方法的参数上,类似qualifier 用来限制方法传入的参数;
        3.2 用来指定某个类的 name    
      
    
 15:  AOP base  基于配置xml 的使用
 
    1:需要引入AspectJ AOP 的依赖
    
    2:<aop:config> <aop:aspect> <aop:pointcut> <aop:advice(具体看情况)>顺序固定
    
    3:advice 有 before , after , after-returnning ,after-throwing ,arround 
    
    4: introduction 配合<aop:declare-parents>
    
        types-matching中匹配到的对象，相当于会给此类添加一个父类. 即使是该类已经继承过了;
        
    

 