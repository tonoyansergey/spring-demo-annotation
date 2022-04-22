package com.company.springdemo.fortune.impl;

import com.company.springdemo.fortune.FortuneService;
import org.springframework.stereotype.Service;

@Service
public class LuckyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today you will win with KO";
    }
}
