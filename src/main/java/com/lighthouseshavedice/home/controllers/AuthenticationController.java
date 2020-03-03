package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

import static java.lang.System.*;

@Controller
public class AuthenticationController {

    private final UserRepository userDao;

    public AuthenticationController(UserRepository userDao){
        this.userDao = userDao;

    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "index";
    }

    @PostMapping("/login")
    public String loginToSite(@RequestParam String username,  @RequestParam String password ) throws NullPointerException {
        User u = new User();
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Date d = new Date();

        out.println("============= First signed in message " + user.getUsername());

        try {
            u = userDao.findByUsername(username);
            u.setLast_login(d.toString());
            user.setLast_login(d.toString());

            saveUserLoginTime(username, u.getId(), user) ;
        } catch (NullPointerException e){
            return "index";
        }

        out.println("========= Third signed in message");
        out.println("user.getUsername() = " + user.getUsername());



//        return "redirect:/dashboard/" + u.getId();
        return "redirect:/dashboard?success";

    }

    @GetMapping("/logout")
    public String logout(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
//        model.addAttribute("users", userDao.getOne(id));/
        model.addAttribute("isLoggedOut", true);
//        model.addAttribute("smoke", smokeDao.getOne(id));

        return "index";
    }


    public void saveUserLoginTime(String username, long id, User user ){
        System.out.println("username = " + username);
        out.println("id = " + id);
        out.println("user.getId() = " + user.getId());

    }

}
