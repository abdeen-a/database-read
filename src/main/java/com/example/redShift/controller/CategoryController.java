package com.example.redShift.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public interface CategoryController {

    @GetMapping("/redshift/{param}")
    public ResponseEntity<?> getData(@PathVariable String param) ;


}
