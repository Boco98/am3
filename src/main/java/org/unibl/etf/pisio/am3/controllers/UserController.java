package org.unibl.etf.pisio.am3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.unibl.etf.pisio.am3.services.UserService;

@Controller //govori da ce se klasa koristiti za generisanje html koda

public class UserController {
    private UserService userService;
    @Autowired
    void setUserService(UserService userService){
        this.userService = userService;

    }
}
