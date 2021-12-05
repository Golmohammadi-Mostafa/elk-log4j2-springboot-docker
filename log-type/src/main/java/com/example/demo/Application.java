package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        log.info("START********************************************info");
        log.warn("START********************************************warn");
        log.error("START********************************************error");
        log.info("START********************************************END");
        SpringApplication.run(Application.class, args);
    }

}
