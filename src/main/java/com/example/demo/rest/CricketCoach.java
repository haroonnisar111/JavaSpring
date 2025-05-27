package com.example.demo.rest;

import com.example.demo.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements Coach {

    @Override
    public String getCoach() {
        return "I am a Hockey coach !!!!";
    }

}
