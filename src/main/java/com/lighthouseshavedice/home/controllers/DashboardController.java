package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

import java.util.Date;

@Controller
public class DashboardController {
    private final UserRepository userDao;

    public DashboardController(UserRepository userDao){
        this.userDao = userDao;

    }

    @GetMapping("/dashboard")
    public String dashboardMenu(Model model ) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        User signedInUser = userDao.getOne(id);

        model.addAttribute("user", signedInUser);


        return "dashboard";
    }

    @GetMapping("/dashboard/success")
    public String initialLogInDashboard(Model model){
        Date d = new Date();
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        User signedInUser = userDao.getOne(id);
        model.addAttribute("user", signedInUser);
//        Set users login date
        signedInUser.setLast_login(d.toString());
        userDao.save(signedInUser);

        return "dashboard";
    }

}
