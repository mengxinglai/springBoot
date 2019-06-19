package com.shineyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName HelloApplication
 * @Description TODO
 * @Author lenovo
 * @Date 2019/6/18 18:15
 * @Version 1.0
 **/
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
        System.out.println("Start SUCCESS");
    }
}
