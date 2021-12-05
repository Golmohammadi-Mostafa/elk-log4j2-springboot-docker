package com.example.demo.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : M.GolMohammadi
 * @Email : M.GolMohammadi@emofid.com
 * @created : 12/4/2021, Saturday
 **/


@Log4j2
@RestController
public class HelloResource {

    @GetMapping(value = "/")
    public ResponseEntity<String> listAllUsers() {

        String msgLog = "**************** HI ***************************";
        log.info(msgLog);
        log.warn(msgLog);
        log.debug(msgLog);
        log.error(msgLog);
        return new ResponseEntity<>("HI DEAR", HttpStatus.OK);
    }
}
