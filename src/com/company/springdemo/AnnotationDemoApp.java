package com.company.springdemo;

import com.company.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // create Spring context/ read Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from context
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // run daily workout method
        System.out.println(coach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // close context
        context.close();
    }
}
