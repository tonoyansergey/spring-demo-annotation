package com.company.springdemo.coach.impl;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.fortune.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class BoxCoach implements Coach {

    private FortuneService fortuneService;

    public BoxCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Train punches";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
