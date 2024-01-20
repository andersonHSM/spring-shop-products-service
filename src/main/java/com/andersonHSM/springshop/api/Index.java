package com.andersonHSM.springshop.api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Index {

    @KafkaListener(id = "index", topics = "customer-dispatching")
    public void listener(String message) {
        System.out.println(message);
    }
}
