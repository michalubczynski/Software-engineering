package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @EventListener
    public void onApplicationReady(ApplicationReadyEvent event) {
        System.out.println("HI");
    }
}

