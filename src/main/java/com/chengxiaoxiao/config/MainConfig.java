package com.chengxiaoxiao.config;

import com.chengxiaoxiao.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MainConfig
 * @description:
 * @author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2019-04-19
 */
@Configuration
public class MainConfig {

    @Bean
    public Person person() {
        return new Person(18, "做全栈攻城狮");
    }
}
