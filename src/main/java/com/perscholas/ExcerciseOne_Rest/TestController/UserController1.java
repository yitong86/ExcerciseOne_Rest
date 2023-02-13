package com.perscholas.ExcerciseOne_Rest.TestController;

import com.perscholas.ExcerciseOne_Rest.model.User3;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController1 {
    @PostMapping("/users")
    public void printData(@RequestBody User3 user) {
        System.out.println("Printing the user data:"+user);
    }}

