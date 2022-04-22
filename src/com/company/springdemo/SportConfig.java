package com.company.springdemo;

import com.company.springdemo.coach.Coach;
import com.company.springdemo.fortune.FortuneService;
import com.company.springdemo.fortune.impl.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company.springdemo")
public class SportConfig {

//    @Bean
//    public FortuneService sadFortuneService() {
//        return new SadFortuneService();
//    }
//
//    @Bean
//    public Coach swimCoach() {
//        return new SwimCoach(sadFortuneService());
//    }
}
