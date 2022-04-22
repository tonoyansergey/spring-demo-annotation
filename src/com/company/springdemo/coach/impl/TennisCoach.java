package com.company.springdemo.coach.impl;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("customFortuneService") FortuneService fortuneService) {
        System.out.println(">>>>> Inside Tennis default constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Train with wall 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    @Qualifier("randomFortuneService")
//    public void testAutowiredWithCustomMethod(FortuneService fortuneService) {
//        System.out.println(">>>>> Inside Tennis testAutowiredWithCustomMethod");
//        this.fortuneService = fortuneService;
//    }
}
