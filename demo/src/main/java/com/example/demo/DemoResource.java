package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
