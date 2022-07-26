package com.example.eurekaclient.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/jsp")
    public String jsp()
    {
        System.out.println("main");
        return "main";
    }
}
