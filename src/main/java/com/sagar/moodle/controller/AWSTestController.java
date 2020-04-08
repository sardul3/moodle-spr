package com.sagar.moodle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicd")
public class AWSTestController {

    @GetMapping
    public String cicd() {
        return "CI / CD works! {V-0.0.1}";
    }
}
