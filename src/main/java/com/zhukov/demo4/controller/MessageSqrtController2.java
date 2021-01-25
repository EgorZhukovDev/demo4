package com.zhukov.demo4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sqrt")
public class MessageSqrtController2 {

    @GetMapping()
    public double convertToSqrt(double x) {
        return Math.sqrt(x);
    }

}
