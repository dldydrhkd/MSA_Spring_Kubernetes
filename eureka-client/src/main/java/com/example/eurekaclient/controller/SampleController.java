package com.example.eurekaclient.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ResponseEntity<Map<String, String>> sample() {
        System.out.println("Hello");
        ResponseEntity<Map<String, String>> response = null;

        Map<String, String> resMap = new HashMap<String, String>();
        resMap.put("type", "First eureka client!");
        resMap.put("message", "Spring Cloud is awesome!");

        response = new ResponseEntity<Map<String, String>>(resMap, HttpStatus.OK);

        return response;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    ResponseEntity<Map<String, String>> sample2() {
        System.out.println("Hello");
        ResponseEntity<Map<String, String>> response = null;

        Map<String, String> resMap = new HashMap<String, String>();
        resMap.put("type", "First eureka client!222");
        resMap.put("message", "Spring Cloud is awesome!2222");

        response = new ResponseEntity<Map<String, String>>(resMap, HttpStatus.OK);

        return response;
    }
}
