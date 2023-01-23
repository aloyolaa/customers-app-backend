package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findByNameContainsIgnoreCase(String name);
}
