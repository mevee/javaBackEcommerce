package vcorp.ecom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vcorp.ecom.models.User;
import vcorp.ecom.service.AuthService;
import vcorp.ecom.service.UserService;
import vcorp.ecom.service.UserServiceImpl;

import javax.websocket.server.PathParam;

//import org.springframework.web.bind.annotation.GetMapping;


//
//import javax.websocket.server.PathParam;
//
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AuthService authService;

//    @GetMapping("")
//    String check() {
//
//        return "check usr controller";
//    }

    @GetMapping("")
    String isValidUser(@RequestParam(value = "userid") String userid) {
        System.out.println("UserController-> isValidUser() userid : " + userid);

        if (userid==null||userid.isBlank()){
            return "User id required";
        }
        boolean isValid = authService.isValid(userid);
        if (isValid) {
            return "User is valid";

        } else {

            return "User is not valid";
        }
    }

    @PostMapping("/{token}")
    String getUser(@RequestParam(value = "userId") String userId) {
        System.out.println("UserController-> getUser() token : " + userId);

        return userService.getProfileWithToken(userId).toString();
    }

    @PostMapping("")
    String addUser(@RequestBody User user) {
        System.out.println("UserController-> getUser() token : " + user.toString());
        userService.updateProfile(user);
        return userService.getProfileWithToken(user.getToken()).toString();
    }

}
