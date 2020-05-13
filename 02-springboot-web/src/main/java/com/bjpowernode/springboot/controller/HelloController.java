package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lhw on 2018/12/23.
 */
@Controller
public class HelloController {

    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "Hello Spring Boot";
    }
}
