package com.example.crud_basic.Controller;


import com.example.crud_basic.Model.User;
import com.example.crud_basic.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("/postUser")

    public User userSignUp(@RequestBody User user) {
        return userServices.userSignUp(user);
    }


    @GetMapping("/getUser")
    public List<User> getAllUser(){
        return userServices.getAllUser();
    }








}
