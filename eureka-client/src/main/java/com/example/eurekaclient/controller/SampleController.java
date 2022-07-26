package com.example.eurekaclient.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @ApiOperation(value="테스트")
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

    @ApiOperation(value = "kafka producer data", notes = "kafka에 넣을 데이터")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 404, message = "404 에러 발생, Not Found !"),
            @ApiResponse(code = 500, message = "500 에러 발생, Internal Server Error !")
    })
    @PostMapping("/inputText")
    public String inputText(@RequestBody String input){
        System.out.println(input);
        return input;
    }

    @ApiOperation(value = "kafka consumer", notes = "kafka 데이터를 word count")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 404, message = "404 에러 발생, Not Found !"),
            @ApiResponse(code = 500, message = "500 에러 발생, Internal Server Error !")
    })
    @GetMapping("/wordcount")
    public String wordCount(@RequestBody String input){

        return input;
    }
}
