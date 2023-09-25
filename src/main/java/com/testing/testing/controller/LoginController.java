package com.testing.testing.controller;

import com.testing.testing.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.testing.testing.service.LoginService;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody Users users){

        return new ResponseEntity<>(loginService.login(users), HttpStatus.OK);
    }
}
