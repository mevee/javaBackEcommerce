package vcorp.ecom.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/{token}")
    String isAutharized(@PathVariable() String token){
        return "isAutharized()-> " +token+
                " false";
    }

    @GetMapping("/expired")
    String isExpired(){
        return "isExpired";
    }

}
