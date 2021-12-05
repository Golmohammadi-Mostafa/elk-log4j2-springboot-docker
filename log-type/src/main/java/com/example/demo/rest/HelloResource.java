package com.example.demo.rest;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HelloResource {


    @GetMapping(value = "/")
    public ResponseEntity<String> listAllUsers() {

        String msg = "**************** HI ***************************";
        log.info(msg);
        log.warn(msg);
        log.debug(msg);
        log.error(msg);
        return new ResponseEntity<>("HI DEAR", HttpStatus.OK);
    }
}
