package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    private final UserRepository userDao;

    public StoreController(UserRepository userDao){
        this.userDao = userDao;
    }

    @GetMapping("/storeDashboard")
    public String dashboardStore(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        User signedInUser = userDao.getOne(id);

        model.addAttribute("user", signedInUser);

        return "store-inventory-dashboard";
    }


}
