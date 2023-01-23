package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Product;
import com.aloyolaa.customerappbackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.customerappbackend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findByNameContainsIgnoreCase(String name) {
        try {
            return productRepository.findByNameContainsIgnoreCase(name);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }
}
