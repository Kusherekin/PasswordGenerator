package com.example.passwordgenerator.controller;

import com.example.passwordgenerator.PasswordgeneratorApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public PasswordgeneratorApplication.PasswordGenerator generator;

    @GetMapping("/")
    public String index() {
        return "Ваш случайный пароль, состоящий из десяти символов: " + generator.generate(10);
    }

}