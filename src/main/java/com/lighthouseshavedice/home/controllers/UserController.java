package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class UserController {
    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user){
        Date d = new Date();
        System.out.println("==========================================");
        System.out.println("user.getName() = " + user.getName());
        System.out.println("user.getUsername() = " + user.getUsername());
        System.out.println("user.getPassword() = " + user.getPassword());
        System.out.println("user.getIs_admin = " + user.getIs_admin());
        System.out.println("user.getPhone_number() = " + user.getPhone_number());
        System.out.println("user.getGender() = " + user.getGender());
        System.out.println("user.getProfile_pic() = " + user.getProfile_pic());
        System.out.println("user.getLast_login() = " + user.getLast_login());
        System.out.println("Date " + d);



        System.out.println("THE END!!");


        //        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
        user.setDate_created(d.toString());
        user.setProfile_pic("https://cdn.filestackcontent.com/zubgVyqDTwK4ineQYCCp");
        userDao.save(user);
        return "redirect:/login?successNewUser";



    }
}
