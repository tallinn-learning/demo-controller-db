package com.controllerdb.demo;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public double generateRandom(){
        return Math.random() * 100;
    }

}
