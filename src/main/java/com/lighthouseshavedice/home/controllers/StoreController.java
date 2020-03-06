package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.FlavorRepository;
import com.lighthouseshavedice.home.repositories.UserRepository;
import com.lighthouseshavedice.home.util.UtilMethods;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    private final UserRepository userDao;
    private final FlavorRepository flavorDao;

    public StoreController(UserRepository userDao, FlavorRepository flavorDao){
        this.flavorDao = flavorDao;
        this.userDao = userDao;
    }

    @GetMapping("/storeDashboard")
    public String dashboardStore(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        User signedInUser = userDao.getOne(id);

//        Capitalize User name
//        UtilMethods u = new UtilMethods();
        String capUsername =  UtilMethods.capString(signedInUser.getName());

        model.addAttribute("user", signedInUser);
        model.addAttribute("capName", capUsername);
        model.addAttribute("flavor", flavorDao.findAll()); // Return list of all the flavors

        return "store-inventory-dashboard";
    }


}
