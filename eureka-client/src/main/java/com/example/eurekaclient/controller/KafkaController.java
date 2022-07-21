package com.example.eurekaclient.controller;

import com.example.eurekaclient.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @Autowired
    KafkaController(KafkaProducer producer){
        this.producer = producer;
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message){
        System.out.println("hello");
        this.producer.sendMessage(message);
        return message;
    }

}
