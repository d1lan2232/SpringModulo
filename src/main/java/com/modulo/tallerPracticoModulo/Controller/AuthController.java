package com.modulo.tallerPracticoModulo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "Auth/login";
    }

    @GetMapping("/register")
    public String register() {
        return "Auth/register";
    }
}

