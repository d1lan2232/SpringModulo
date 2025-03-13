package com.modulo.tallerPracticoModulo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Usuario {

    @GetMapping("/")
    public String escuela() {
        return "index"; // Carga la página principal (index.html)
    }

    @GetMapping("/informacion")
    public String informacion() {
        return "pages/vistaInformativa";
    }
}