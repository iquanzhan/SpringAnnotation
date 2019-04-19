# SpringAnnotation
Spring 注解开发，梳理常用注解。目标：无配置文件化，使用class进行配置

### 1.使用配置类，把对象加入spring容器中

```
@Configuration
public class MainConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
```

### 2.配置包扫描

配置类上添加以下注解

```
@ComponentScan(value="com.chengxiaoxiao")
```