package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hema")
public class demo {
    @RequestMapping("/one")
    public String String(){
        return  "Hello World";
    }
}