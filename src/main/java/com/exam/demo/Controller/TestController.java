package com.exam.demo.Controller;

import com.exam.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public String Test(){
        System.out.println(this.testService.check().getUsername());
        return "hello,world!";
    }
}
