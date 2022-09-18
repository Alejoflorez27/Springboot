package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class Controller {
    @GetMapping(value = "/saludo")
    public ResponseEntity<?> saludar(){

        return new ResponseEntity("Hola mundo", HttpStatus.OK);
    }
}
