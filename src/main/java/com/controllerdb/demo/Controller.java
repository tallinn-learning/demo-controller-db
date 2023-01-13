package com.controllerdb.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    CalcService service;

    @GetMapping("/random")
    public double getRandomNumber() {
        logger.info("requested to generate random number");
        service.logRequest();
        double random = service.generateRandom();
        logger.info("Generated value {}", random);
        return random;
    }
    @GetMapping("/count")
    public int getCount() {
        logger.info("requested to get number of records in DB");
        return service.calcCount();
    }

    @GetMapping("/clear")
    public void clearData() {
        logger.info("requested to clear records in DB");
        service.clear();
        service.create();
    }

}
