package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    Customer save(Customer customer);

    Customer update(Long id, Customer customer);

    Boolean delete(Long id);
}
