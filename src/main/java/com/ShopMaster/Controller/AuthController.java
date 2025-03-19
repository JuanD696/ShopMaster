package com.ShopMaster.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
 
        @GetMapping("/login")
        public String loginPage() {
        return "Login";
    }
 
        @GetMapping("/home")
        public String homePage() {
        return "home";
    }
}
