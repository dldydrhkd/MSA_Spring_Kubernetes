package com.example.eurekaclient.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    //    회원가입
    @ApiOperation(value = "최신 블로그 검색", notes = "특정 관광지와 관련된 가장 최신의 블로그 2개를 검색")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK !!"),
            @ApiResponse(code = 404, message = "404 에러 발생, Not Found !"),
            @ApiResponse(code = 500, message = "500 에러 발생, Internal Server Error !")
    })
    @GetMapping("/recentTwo")
    public String blogRecentTwo(
            @ApiParam(value = "관광지 이름", required=false, example = "우도(해양도립공원)")
            @RequestParam String source){
        return source;
    }
}
