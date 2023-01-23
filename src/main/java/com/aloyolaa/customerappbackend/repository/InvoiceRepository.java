package com.aloyolaa.customerappbackend.repository;

import com.aloyolaa.customerappbackend.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}