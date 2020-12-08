package com.carrisoft.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Hola y bienvenido a la nueva aplicación de gestión de hermanos, de la Hermandad del Rocío de Carrión.";
    }
}
