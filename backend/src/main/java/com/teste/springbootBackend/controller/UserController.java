package com.teste.springbootBackend.controller;

import com.teste.springbootBackend.model.User;
import com.teste.springbootBackend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}
