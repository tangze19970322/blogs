package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("/home")
    public String goHome() {
        return "/index2";
    }
}
