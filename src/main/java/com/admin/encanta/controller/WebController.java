package com.admin.encanta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "servicios";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/politicas-privacidad")
    public String politicasPrivacidad() {
        return "politicas-privacidad";
    }

    @GetMapping("/terminos-condiciones")
    public String terminosCondiciones() {
        return "terminos-condiciones";
    }

    @GetMapping("/preguntas-frecuentes")
    public String preguntasFrecuentes() {
        return "preguntas-frecuentes";
    }

    @GetMapping("/derechos-arco")
    public String derechosArco() {
        return "derechos-arco";
    }

    @GetMapping("/galeria")
    public String galeria() {
        return "galeria";
    }
}

