package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lhw on 2018/12/23.
 */
@Controller
public class JSPController {

    @GetMapping("/boot/index")
    public String infx(Model model){
        model.addAttribute("msg","springboot集成jsp");
        return  "index";
    }
}
