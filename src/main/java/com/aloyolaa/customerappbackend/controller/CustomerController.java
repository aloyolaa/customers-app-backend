package com.aloyolaa.customerappbackend.controller;

import com.aloyolaa.customerappbackend.entity.Customer;
import com.aloyolaa.customerappbackend.exception.UploadFileException;
import com.aloyolaa.customerappbackend.service.CustomerService;
import com.aloyolaa.customerappbackend.service.UploadService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    private final CustomerService customerService;

    private final UploadService uploadService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getOne(@PathVariable Long id) {
        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.update(id, customer), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        uploadService.delete(customer.getPhoto());
        return new ResponseEntity<>(customerService.delete(id), HttpStatus.OK);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Customer>> pagination(Pageable pageable) {
        return new ResponseEntity<>(customerService.pagination(pageable), HttpStatus.OK);
    }

    @GetMapping("/page/{page}")
    public ResponseEntity<Page<Customer>> paginationByPage(@PathVariable Integer page) {
        return new ResponseEntity<>(customerService.pagination(PageRequest.of(page, 4)), HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<Customer> upload(@RequestParam MultipartFile file, @RequestParam Long id) {
        Customer customer = customerService.findById(id);
        String fileName = null;
        try {
            fileName = uploadService.save(file);
        } catch (IOException e) {
            throw new UploadFileException("Error uploading photo", e);
        }
        uploadService.delete(customer.getPhoto());
        customer.setPhoto(fileName);
        customerService.save(customer);
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }

    @GetMapping("/upload/img/{fileName:.+}")
    public ResponseEntity<Resource> getPhoto(@PathVariable String fileName) {
        Resource resource;
        try {
            resource = uploadService.charge(fileName);
        } catch (MalformedURLException e) {
            throw new UploadFileException("Error loading photo", e);
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"");
        return new ResponseEntity<>(resource, httpHeaders, HttpStatus.OK);
    }
}
