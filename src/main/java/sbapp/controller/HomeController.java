package sbapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1")
public class HomeController {

    @RequestMapping(path = "/api/{name}")
    public String welcomeUser(@PathVariable String name){
        return "welcome Mr."+name+", to Bhushan IT !!!";
    }
}
