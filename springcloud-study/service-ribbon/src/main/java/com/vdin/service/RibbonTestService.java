package com.vdin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 杨磊
 *         2019/8/20
 */
@Service
public class RibbonTestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
