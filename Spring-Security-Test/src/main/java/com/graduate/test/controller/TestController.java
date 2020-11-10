package com.graduate.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping({"/", "/index"})
    public String index() {
        System.out.println("这是index");
        return "index";
    }

    @GetMapping("/toLogin")
    public String toLogin() {
        return "views/login";
    }

    @GetMapping("/level1/{id}")
    public String level1(@PathVariable("id") int id) {
        System.out.println("level1");
        return "views/level1/";
    }

    @GetMapping("/level2/{id}")
    public String level2(@PathVariable("id") int id) {
        System.out.println("level2");
        return "views/level2/";
    }

    @GetMapping("/level3/{id}")
    public String level3(@PathVariable("id") int id) {
        System.out.println("level3");
        return "views/level3/";
    }

}