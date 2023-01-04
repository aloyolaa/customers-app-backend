package com.aloyolaa.customerappbackend.repository;

import com.aloyolaa.customerappbackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}