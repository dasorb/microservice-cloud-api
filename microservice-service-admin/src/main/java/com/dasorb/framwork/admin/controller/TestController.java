package com.dasorb.framwork.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenJie
 * @date 2019-08-05
 **/
@RequestMapping("/hello")
@RestController
public class TestController {


    @GetMapping("/world")
    public Object test() {
        List<String> list = new ArrayList<>();
        list.add("helloWorld");
        list.add("world");
        return list;
    }
}
