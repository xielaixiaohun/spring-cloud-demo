package com.vdin.web;

import com.vdin.service.RibbonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨磊
 *         2019/8/20
 */
@RestController
public class RibbonTestController {
    @Autowired
    RibbonTestService ribbonTestService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return ribbonTestService.hiService(name);
    }
}
