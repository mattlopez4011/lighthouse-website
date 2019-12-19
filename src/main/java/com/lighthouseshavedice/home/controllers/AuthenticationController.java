package com.lighthouseshavedice.home.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class AuthenticationController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

}
