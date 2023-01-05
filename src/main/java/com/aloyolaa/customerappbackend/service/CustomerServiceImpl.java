package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Customer;
import com.aloyolaa.customerappbackend.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
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
        return customerRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public Customer update(Long id, Customer customer) {
        Customer customerById = this.findById(id);
        customerById.setFirstName(customer.getFirstName());
        customerById.setLastName(customer.getLastName());
        customerById.setEmail(customer.getEmail());
        customerById.setBirthDate(customer.getBirthDate());
        return this.save(customerById);
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            return true;
        } else {
            throw new EntityNotFoundException();
        }
    }
}
