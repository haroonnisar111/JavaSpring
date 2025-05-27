package com.example.demo.rest;

import com.example.demo.Coach;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Override
    public String getCoach() {
        return "I am HOCKEY Coach";
    }
}
