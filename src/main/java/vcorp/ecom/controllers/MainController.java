package vcorp.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vcorp.ecom.service.UserService;
import vcorp.ecom.service.UserServiceImpl;

@RestController("/")
public class MainController {
@Autowired
UserService userService;


    @GetMapping("")
    String home(){
        return "This is home page deigned by vikesh";
    }

    @GetMapping("home")
    String homeNamed(){
        return "homeNamed() This is home page vikesh";
    }

}
