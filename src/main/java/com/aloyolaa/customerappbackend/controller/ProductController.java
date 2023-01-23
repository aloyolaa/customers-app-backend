package com.aloyolaa.customerappbackend.controller;

import com.aloyolaa.customerappbackend.entity.Product;
import com.aloyolaa.customerappbackend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/byName/{name}")
    public ResponseEntity<List<Product>> getByName(@PathVariable String name) {
        return new ResponseEntity<>(productService.findByNameContainsIgnoreCase(name), HttpStatus.OK);
    }
}
