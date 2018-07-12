package com.caiduoduo.web.controller;

import com.caiduoduo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auhtor: Cazen
 * @Description:
 * @version: Created in 15:42 2018/7/10
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value ="/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
