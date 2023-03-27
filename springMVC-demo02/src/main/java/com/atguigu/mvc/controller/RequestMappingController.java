package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/Hello")
public class RequestMappingController {
    @RequestMapping(
            value={"/testRequestMapping","/test"},
            method={RequestMethod.GET, RequestMethod.POST}
            )
    public String success(){
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(value="/testPut", method=RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value="/testParamsAndHeaders",
            params={"username","password=123456"},
            headers={"Host=localhost:8080"}
    )
    public String testParams(){
        return "success";
    }

    @RequestMapping("/a?a/testAnt")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id:"+id);
        return "success";
    }
}
