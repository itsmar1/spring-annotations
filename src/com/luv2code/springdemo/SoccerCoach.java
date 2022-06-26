package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Score 3 goals in each game";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
