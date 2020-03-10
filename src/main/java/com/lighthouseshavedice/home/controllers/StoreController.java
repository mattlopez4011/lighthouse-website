package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.Flavor;
import com.lighthouseshavedice.home.models.User;
import com.lighthouseshavedice.home.repositories.FlavorRepository;
import com.lighthouseshavedice.home.repositories.UserRepository;
import com.lighthouseshavedice.home.util.UtilMethods;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
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

    @PostMapping(path = "/rest/flavor-update")
    public Flavor updateFlavor(@RequestBody Flavor flavor) throws Exception{
        System.out.println("==================Flavor JSON: " + flavor);
        System.out.println("==================Flavor.name JSON: " + flavor.getFlavor_name());
        System.out.println("==================Flavor.gal JSON: " + flavor.getFlavor_amt_gal());
        System.out.println("==================Flavor.qt JSON: " + flavor.getFlavor_amt_qt());
        System.out.println("==================Flavor.color JSON: " + flavor.getFlavor_color());
        //Send location in response
//        return ResponseEntity.created(location).build();

        return flavor;

    }

    }

//    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) throws Exception
//    {
//        //
//    }

//    Post request parsing JSON data with Jackson
//    @RequestMapping(method = RequestMethod.POST, value = "math")
//    @ResponseBody
//    public Result math(@RequestBody final Request request) {
//        final Result result = new Result();
//        result.setAddition(request.getLeft() + request.getRight());
//        result.setSubtraction(request.getLeft() - request.getRight());
//        result.setMultiplication(request.getLeft() * request.getRight());
//        return result;
//    }




//    @PostMapping("/profile/{id}/edit")
//    public String updateProfile(@PathVariable long id, @RequestParam String username, @RequestParam String city, @RequestParam String state, @RequestParam String profilePic) {
//        User oldUserProfile = userDao.getOne(id);
//
//        oldUserProfile.setUsername(username);
//        oldUserProfile.setCity(city);
//        oldUserProfile.setState(state);
//        oldUserProfile.setProfilePic(profilePic);
//
//        userDao.save(oldUserProfile);
//
//        return "redirect:/profile/" + id;
//    }

//}
