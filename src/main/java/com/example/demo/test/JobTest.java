package com.example.demo.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobTest {

    @Scheduled(cron = "${index.job}")
    public void hello1(){
        System.out.println("==========");
    }
}
