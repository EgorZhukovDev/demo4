package com.zhukov.demo4.controller;

import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

    @RestController
    public class MessageSqrtController2 {
    @RequestMapping(value = "/sqrt/{x}", method = GET)
    public String convertToSqrt1(
            @PathVariable("x") double x) {
        return "y= " + Math.sqrt(x);
    }

    @RequestMapping(value = "/sqrt", method = GET)
    public String convertToSqrt2(double x) {
        return "y= " + Math.sqrt(x);
    }
}