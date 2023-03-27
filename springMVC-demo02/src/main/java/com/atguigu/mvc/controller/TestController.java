package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        System.out.println("gitTest");
        System.out.println("gitTest1");
        return "index";
    }

    @RequestMapping("/params")
    public String paramsTest(){
        return "test_params";
    }
}
