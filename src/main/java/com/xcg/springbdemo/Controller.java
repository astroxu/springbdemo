package com.xcg.springbdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/say: host=" + serviceInstance.getHost()+",service_id="+serviceInstance.getServiceId());
        return "Hello World!";

    }
}
/*@Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/

//return "Hello Spring Boot! name: " + name + ",age:" + age + "  content:" + content+"热部署";