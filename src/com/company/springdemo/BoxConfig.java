package com.company.springdemo;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.coach.impl.BoxCoach;
import com.company.springdemo.fortune.FortuneService;
import com.company.springdemo.fortune.impl.LuckyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxConfig {

    @Bean
    public FortuneService luckyFortuneService() {
        return new LuckyFortuneService();
    }

    @Bean
    public Coach boxCoach() {
        return new BoxCoach(luckyFortuneService());
    }
}
