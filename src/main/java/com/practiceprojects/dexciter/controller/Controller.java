package com.practiceprojects.dexciter.controller;


import com.practiceprojects.dexciter.entities.Generator;
import com.practiceprojects.dexciter.entities.publicData;
import com.practiceprojects.dexciter.service.dataService;
import com.practiceprojects.dexciter.service.generatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {

    @Autowired
    private dataService dataServ;
    @Autowired
    private generatorService genServ;

    @GetMapping("/home")
    public String home(){
        return "This is the home page";
    }

    @GetMapping("/data")
    public List<publicData> getData(){
        return this.dataServ.getData();
    }

    @GetMapping("/generator")
    public Generator getGenerator(){
        return this.genServ.getGenerator();
    }

}
