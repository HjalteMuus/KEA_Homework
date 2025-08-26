package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ek")
public class WelcomeController {
    @GetMapping("welcome")
    public ResponseEntity<String> welcome(@RequestParam(name = "userName") String name){
        return new ResponseEntity<>("Velkommen til 2. semester " + name, HttpStatus.OK) ;
    }

    @GetMapping("classes")
    public ResponseEntity<String> classes(){
        return new ResponseEntity<>("Velkommen til programmeringsklassen", HttpStatus.OK);
    }
}
