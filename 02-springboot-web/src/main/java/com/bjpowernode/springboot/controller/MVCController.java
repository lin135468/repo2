package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lhw on 2018/12/23.
 */
@RestController
public class MVCController {

    @RequestMapping("/boot/getUser")
    public Object getUser(){
        User user = new User();
        user.setId(100);
        user.setName("索隆");
        return user;
    }
}
