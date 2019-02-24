package com.appsdeveloperblog.app.ws.ui.controller;


import com.appsdeveloperblog.app.ws.ui.model.request.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String getUser(){
        return "";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetails userDetails) {
        return "";
    }

    @PutMapping
    public String updateUser(){
        return"";
    }
    @DeleteMapping
    public String deleteUser(){
        return"";
    }



}
