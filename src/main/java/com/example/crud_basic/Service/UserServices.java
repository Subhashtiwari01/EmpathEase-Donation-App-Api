package com.example.crud_basic.Service;

import com.example.crud_basic.Model.User;
import com.example.crud_basic.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;
    public User userSignUp(User user) {
        userRepository.save(user);
        return (user);
    }



    public List<User> getAllUser() {
        return userRepository.findAll();
    }



}
