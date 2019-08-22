package com.qf.j1904.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("loginview")
    public String loginview(){
        return "login";
    }
}
