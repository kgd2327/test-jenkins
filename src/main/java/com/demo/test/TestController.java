package com.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/{id}")
    public String test(@PathVariable("id") String id){
        return id + " String";
    }
    @GetMapping("/")
    public String test(){
        return "ok";
    }
    @GetMapping("/{id}")
    public String test(@PathVariable("id") Integer id){
        return "ok Integer";
    }
}
