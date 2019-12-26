package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("profile/{id}/edit")
    public String editProfile(Model model, @PathVariable long id){
        model.addAttribute("user", userDao.getOne(id));

        return "editProfile";
    }

    @PostMapping("profile/{id}/edit")
    public String postProfile(@PathVariable long id, @RequestParam String name, @RequestParam String username){
        User oldUserProfile = userDao.getOne(id);

        oldUserProfile.setName(name);
        oldUserProfile.setUsername(username);

        userDao.save(oldUserProfile);

        return "redirect:/profile/" +id;
    }

}
