package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private  String coachName;
    @Value("${team.name}")
    private  String teamName ;
    @GetMapping("/")
    public String sayHello(){
        return "nallay berozga";
    }
    @GetMapping("/teaminfo")
    public Map<String, String> teaminfo() {
        Map<String, String> info = new HashMap<>();
        info.put("teamName", teamName);
        info.put("coach name", coachName);
        return info;
    }
    @GetMapping("/welcomeMessage")
    public String getWelcomeMessage(){
        return "Hello man welcome to spring boot and spring";
    }
}
