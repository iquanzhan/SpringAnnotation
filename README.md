# SpringAnnotation
Spring 注解开发，梳理常用注解

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

2.