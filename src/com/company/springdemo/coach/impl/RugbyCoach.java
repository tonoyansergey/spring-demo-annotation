package com.company.springdemo.coach.impl;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public RugbyCoach() {
        System.out.println(">>>>> Inside RugbyCoach default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your throw";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">>>>> Inside RugbyCoach setter");
//        this.fortuneService = fortuneService;
//    }
}
