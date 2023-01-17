package com.aloyolaa.customerappbackend.controller;

import com.aloyolaa.customerappbackend.entity.Region;
import com.aloyolaa.customerappbackend.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/regions")
@CrossOrigin(origins = "http://localhost:4200")
public class RegionController {
    private final RegionService regionService;

    @GetMapping("/")
    public ResponseEntity<List<Region>> getAll() {
        return new ResponseEntity<>(regionService.findAll(), HttpStatus.OK);
    }
}
