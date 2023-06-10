package com.springboot.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: RequestController
 * Package: com.springboot.controller
 * Description:
 *
 * @Author Toy
 * @Create 2023/6/10 11:53
 * @Version 1.0
 */
@RestController
public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//        return "OK";
//    }


//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name, int age) {
//        System.out.println(name + ":" + age);
//        return "OK";
//    }

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name = "name") String username, int age) {
        System.out.println(username + ":" + age);
        return "OK";
    }
}
