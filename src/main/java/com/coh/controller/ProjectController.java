package com.coh.controller;

import com.coh.pojo.Project;
import com.coh.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping ("welcome")
    public String index(){
        System.out.println("ProjectController.index");
        return "login";
    }

    @GetMapping
    public Map<String,Object> select(){
        Map<String,Object>map=new HashMap<>();
        try {
            List<Project> projects= projectService.findAll();
            map.put("projectList",projects);
            map.put("result",true);
        }catch (Exception e){

            map.put("result",false);
        }
        System.out.println("ProjectController.login");
        return map;
    }
}
