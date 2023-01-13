package com.controllerdb.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class CalcService {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public double generateRandom(){
        return Math.random() * 100;
    }

    public int calcCount() {
        logger.info("requested to generate random number of records in DB");
        return jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM PERSON", Integer.class);
    }
    public void logRequest() {
        jdbcTemplate.update(
                "insert into person values(1, 'leo')");
    }

    public void clear() {
        jdbcTemplate.execute(
                "drop table if exists person");

    }

    public void create() {
        jdbcTemplate.execute(
                "create table  IF NOT EXISTS person (id integer, name string)");
    }
}
