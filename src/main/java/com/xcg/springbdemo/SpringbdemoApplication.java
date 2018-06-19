package com.xcg.springbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Controller.class,args);
        //ConfigurableApplicationContext context= SpringApplication.run(Controller.class, args);
        //通过getEnvironment(),getProperty()方法获取配置属性值
        //System.out.println("name: " + context.getEnvironment().getProperty("name") + ",age: "+ context.getEnvironment().getProperty("age"));
    }
}
