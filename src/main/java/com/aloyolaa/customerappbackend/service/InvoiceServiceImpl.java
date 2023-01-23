package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Invoice;
import com.aloyolaa.customerappbackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.customerappbackend.exception.EntityNotFound;
import com.aloyolaa.customerappbackend.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Override
    @Transactional(readOnly = true)
    public Invoice findById(Long id) {
        try {
            return invoiceRepository.findById(id).orElseThrow(() -> new EntityNotFound(id));
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }

    @Override
    @Transactional
    public Invoice save(Invoice invoice) {
        try {
            return invoiceRepository.save(invoice);
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Data saving error", e);
        }
    }

    @Override
    @Transactional
    public Boolean delete(Long id) {
        try {
            if (invoiceRepository.existsById(id)) {
                invoiceRepository.deleteById(id);
                return true;
            } else {
                throw new EntityNotFound(id);
            }
        } catch (DataAccessException e) {
            throw new DataIntegrityViolationException("Data deleted error", e);
        }
    }
}
