package com.example.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting")
public class GreetingResource {

    @GetMapping("/{name}")
    public String sayHi(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping
    public String sayHiWorld() {
        return "Hello world";
    }

}
