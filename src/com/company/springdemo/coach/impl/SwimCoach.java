package com.company.springdemo.coach.impl;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.fortune.FortuneService;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim butterfly 200m";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
