package com.example.demo.rest;

import com.example.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public  DemoController(Coach theCoach){
         myCoach=theCoach;

    }
    @GetMapping("/getCoach")
    public  String getMycoachName(){
        return myCoach.getCoach();
    }
}
