package com.vdin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 杨磊
 *         2019/8/21
 */
@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
