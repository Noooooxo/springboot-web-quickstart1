package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: Controller
 * Package: com.springboot.controller
 * Description:
 *
 * @Author Toy
 * @Create 2023/6/8 23:42
 * @Version 1.0
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello,Srping boot");
        return "Hello,Srping boot";
    }
}
