package com.lighthouseshavedice.home.controllers;

import com.lighthouseshavedice.home.models.Person;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

    @PostMapping(path = "/save-cust-info")
    public String customerInformation(@RequestBody Person person){
        /* You can write your DAO logic here.
         * For the time being I am printing the customer data just to show the POST call is working.
         */

        return  "Customer information saved successfully ::. " + person.getPersonId() + " " + person.getName() + " " + person.getCountry();

    }
}
