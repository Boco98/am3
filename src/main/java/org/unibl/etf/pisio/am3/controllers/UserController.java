package org.unibl.etf.pisio.am3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.unibl.etf.pisio.am3.services.UserService;
import java.util.List;
import org.unibl.etf.pisio.am3.models.User;
@Controller //govori da ce se klasa koristiti za generisanje html koda
@RequestMapping("/users") //govori sa kojim --prefiksom-- cemo kreirati nas endpoint
public class UserController {
    private UserService userService;
    @Autowired
    void setUserService(UserService userService){
        this.userService = userService;
    }

    //spring sam konvertuje u json format objekte...
    @GetMapping
    public @ResponseBody List<User> getAll(){
        return userService.getAll();
    }
}
//@RestController notacije ide kako bi se izbjegla @Controller i @RequestMapping, jer su
//u @RestController ustvari obe notacije