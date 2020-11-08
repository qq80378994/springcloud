package com.ylc.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    public Object showInfo(){
        return "测试";
    }
}
