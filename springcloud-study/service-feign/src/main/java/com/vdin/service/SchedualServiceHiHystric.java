package com.vdin.service;

import org.springframework.stereotype.Component;

/**
 * @author 杨磊
 *         2019/9/9
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
