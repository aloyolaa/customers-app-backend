package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Customer;
import com.aloyolaa.customerappbackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.customerappbackend.exception.EntityNotFound;
import com.aloyolaa.customerappbackend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        try {
            return customerRepository.findAll();
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        try {
            return customerRepository.findById(id).orElseThrow(() -> new EntityNotFound(id));
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Customer> pagination(Pageable pageable) {
        try {
            return customerRepository.findAll(pageable);
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        try {
            return customerRepository.save(customer);
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Data saving error", e);
        }
    }

    @Override
    @Transactional
    public Customer update(Long id, Customer customer) {
        Customer customerById = customerRepository.findById(id).orElseThrow(() -> new EntityNotFound(id));
        try {
            customerById.setFirstName(customer.getFirstName());
            customerById.setLastName(customer.getLastName());
            customerById.setEmail(customer.getEmail());
            customerById.setBirthDate(customer.getBirthDate());
            return customerRepository.save(customerById);
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Data updating error", e);
        }
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        try {
            if (customerRepository.existsById(id)) {
                customerRepository.deleteById(id);
                return true;
            } else {
                throw new EntityNotFound(id);
            }
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Data deleted error", e);
        }
    }
}
