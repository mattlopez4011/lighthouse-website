package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {

    private final UserRepository userDao;

    public AuthenticationController(UserRepository userDao){
        this.userDao = userDao;

    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginToSite(@RequestParam String username,  @RequestParam String password ) throws NullPointerException {
        User u = new User();

        try {
            u = userDao.findByUsername(username);
        } catch (NullPointerException e){
            return "login";
        }

        return "redirect:/dashboard/" + u.getId();
    }

}
