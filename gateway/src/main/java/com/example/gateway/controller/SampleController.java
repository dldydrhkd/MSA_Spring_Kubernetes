package com.example.gateway.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @ApiOperation(value="테스트222")
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
