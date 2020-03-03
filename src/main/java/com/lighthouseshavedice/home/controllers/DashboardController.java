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


        System.out.println("user.getUsername() + user.getId() = " + user.getUsername() + user.getId());

        return "dashboard";
    }

    @GetMapping("/dashboard/success")
    public String initialLogInDashboard(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        User signedInUser = userDao.getOne(id);
        model.addAttribute("user", signedInUser);
        Date d = new Date();

        System.out.println("Username is signed in " + signedInUser.getUsername());
        System.out.println("Date signed in " + d);
        User u = userDao.getOne(id);
//        Set users login date
        u.setLast_login(d.toString());
        userDao.save(u);

        return "dashboard";
    }

}
