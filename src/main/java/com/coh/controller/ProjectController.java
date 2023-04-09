package com.coh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("project")
public class ProjectController {
    @RequestMapping("welcome")
    public String index(){
        System.out.println("ProjectController.index");
        return "login";
    }
}
