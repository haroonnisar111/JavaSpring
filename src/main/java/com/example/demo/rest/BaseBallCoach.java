package com.example.demo.rest;

import com.example.demo.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseBallCoach implements Coach {
    @Override
    public String getCoach() {
        return "Hello i am the BB Coach";
    }
    @PostConstruct
    public void startUpStuff(){
        System.out.println("Start upnstuff: " + getClass().getSimpleName());
    }
    @PreDestroy
    public void cleanUpStuff(){
        System.out.println("cleanUpStuff : " +  getClass().getSimpleName());
    }
}
