package com.abhijeet.eventseat.controller;

import com.abhijeet.eventseat.model.User;
import com.abhijeet.eventseat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping
    public List<User>getAllUsers(){
        return userRepository.findAll();
    }


}
