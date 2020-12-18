package com.shopskill.auth.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationRestController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    public AuthenticationRestController() {
    }

    @GetMapping
    public ResponseEntity<String> login() {
        LOG.info("Working.");
        return ResponseEntity.accepted().body("I Am Working !");
    }

}
