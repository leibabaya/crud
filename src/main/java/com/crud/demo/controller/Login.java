package com.crud.demo.controller;

import com.crud.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

    @Autowired
    UserService userService;

    @GetMapping(value = {"/","login","index"})
    public String welcomeJump(){
        System.out.println("登录页跳转");
        System.out.println(userService.selectUser());
        return "index";
    }
}
