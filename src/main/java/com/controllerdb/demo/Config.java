package com.controllerdb.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    public JdbcTemplate getJdbc(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}

