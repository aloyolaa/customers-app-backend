package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    Page<Customer> pagination(Pageable pageable);

    Customer save(Customer customer);

    Customer update(Long id, Customer customer);

    Boolean delete(Long id);
}
