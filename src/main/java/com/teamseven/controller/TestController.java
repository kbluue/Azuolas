package com.teamseven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @RequestMapping("/user")
    public String test(){
        return "User is here";
    }
}