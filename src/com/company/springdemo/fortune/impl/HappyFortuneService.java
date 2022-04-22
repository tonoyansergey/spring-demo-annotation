package com.company.springdemo.fortune.impl;

import com.company.springdemo.fortune.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is lucky day!";
    }
}
