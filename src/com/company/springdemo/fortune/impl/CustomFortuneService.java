package com.company.springdemo.fortune.impl;

import com.company.springdemo.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.Random;

@Component
@PropertySource("classpath:fortunes.properties")
public class CustomFortuneService implements FortuneService {

    @Value("${happy_fortune}")
    private String happyFortune;

    @Value("${sad_fortune}")
    private String sadFortune;

    @Value("${crazy_fortune}")
    private String crazyFortune;

    private Random random = new Random();

    @Override
    public String getFortune() {
        String[] fortuneArray = {happyFortune, sadFortune, crazyFortune};
        return fortuneArray[random.nextInt(fortuneArray.length)];
    }

    @PostConstruct
    public void before() {
        try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("src/postconstruct.txt")))){
            System.out.println(inputStream.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
