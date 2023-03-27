package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username"+username+",password"+password);
        return "test_params";
    }

    @RequestMapping("/testControllerParams")
    public String testControllerParams(String username, String password){
        System.out.println("username="+username+", password="+password);
        return "test_params";
    }
}
