package com.company.springdemo.fortune.impl;

import com.company.springdemo.fortune.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
