package com.youziji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author youziji
 * @create 2020-04-19 10:40
 **/
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("c成功");
        return "Hello World!";

    }
}
