package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public class DemoResource {

    @GetMapping
    public String sayHello(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
