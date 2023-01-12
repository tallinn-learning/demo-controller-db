package com.controllerdb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    @Autowired
    CalcService service;

    @GetMapping("/random")
    public double getRandomNumber() {

        return service.generateRandom();

    }

}
