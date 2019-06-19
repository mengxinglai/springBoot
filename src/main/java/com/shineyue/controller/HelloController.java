package com.shineyue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lenovo
 * @Date 2019/6/18 18:20
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "你好Spring Boot";
    }
}
