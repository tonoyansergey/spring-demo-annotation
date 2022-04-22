package com.company.springdemo;

import com.company.springdemo.coach.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // create Spring context/ read Spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retrieve bean from context
        Coach coach = context.getBean("swimCoach", Coach.class);

        // run daily workout method
        System.out.println(coach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
