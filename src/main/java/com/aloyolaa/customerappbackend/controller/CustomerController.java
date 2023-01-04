package com.aloyolaa.customerappbackend.controller;

import com.aloyolaa.customerappbackend.entity.Customer;
import com.aloyolaa.customerappbackend.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
@CrossOrigin(origins = "htp://localhost:4200")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
