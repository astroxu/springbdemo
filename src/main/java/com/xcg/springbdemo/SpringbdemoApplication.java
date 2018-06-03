package com.xcg.springbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(SpringbdemoApplication.class, args);
        //通过getEnvironment(),getProperty()方法获取配置属性值
        //System.out.println("name: " + context.getEnvironment().getProperty("name") + ",age: "+ context.getEnvironment().getProperty("age"));
    }
}
