package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * idea web测试
 *
 * @author: mouse
 * @date: 2019-05-19 00:48
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    public String index(){
        return "Hello World! idea";
    }
}
