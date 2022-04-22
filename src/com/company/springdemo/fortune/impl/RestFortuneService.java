package com.company.springdemo.fortune.impl;

import com.company.springdemo.fortune.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Rest fortune";
    }
}
