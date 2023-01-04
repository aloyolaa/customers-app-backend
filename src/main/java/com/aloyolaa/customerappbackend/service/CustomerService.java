package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
