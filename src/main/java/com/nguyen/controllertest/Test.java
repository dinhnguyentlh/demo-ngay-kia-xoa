package com.nguyen.controllertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-v2")

public class Test {
    @GetMapping("/xcv")
    public String auj() {
        return "ogggggggggggk";
    }
}
