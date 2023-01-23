package com.aloyolaa.customerappbackend.controller;

import com.aloyolaa.customerappbackend.entity.Invoice;
import com.aloyolaa.customerappbackend.service.InvoiceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/invoices")
@CrossOrigin(origins = "http://localhost:4200")
public class InvoiceController {
    private final InvoiceService invoiceService;

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getOne(@PathVariable Long id) {
        return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Invoice> save(@Valid @RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceService.save(invoice), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return new ResponseEntity<>(invoiceService.delete(id), HttpStatus.OK);
    }
}
