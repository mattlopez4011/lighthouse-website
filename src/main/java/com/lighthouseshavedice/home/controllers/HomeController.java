package com.lighthouseshavedice.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String landingPage(Model model){

//        model.addAttribute("users", userDao.findAll());

        return "index";
    }
}
