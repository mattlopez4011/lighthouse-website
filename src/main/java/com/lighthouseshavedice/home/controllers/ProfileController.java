package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {

    private final UserRepository userDao;

    public ProfileController(UserRepository userDao){
        this.userDao = userDao;
    }

    @GetMapping("/profile/{id}")
    public String showProfile(Model model, @PathVariable long id){

        model.addAttribute("user", userDao.getOne(id));

        return "profile";
    }
}
