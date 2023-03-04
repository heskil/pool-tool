package com.management.poolmanagement.controller;

import com.management.poolmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public ResponseEntity<ResponseStatus> postUser() {
        System.out.println("Boop!");
        //public ResponseEntity postUser(@RequestBody UserDetails userDetails) {
        userService.saveAndPrintUser();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
