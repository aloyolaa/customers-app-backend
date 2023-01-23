package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Invoice;

public interface InvoiceService {
    Invoice findById(Long id);

    Invoice save(Invoice invoice);

    Boolean delete(Long id);
}
