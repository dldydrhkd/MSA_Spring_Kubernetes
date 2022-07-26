package com.example.eurekaclient.controller;

import com.example.eurekaclient.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @Autowired
    KafkaController(KafkaProducer producer){
        this.producer = producer;
    }

    @PostMapping
    public String sendMessage(@RequestParam("txtSource") String message){
        System.out.println("hello");
        this.producer.sendMessage(message);
        return message;
    }

}
