package com.aloyolaa.customerappbackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "invoices")
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "observation")
    private String observation;

    @Column(name = "create_date")
    private Instant createDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "invoices"}, allowSetters = true)
    private Customer customer;

    @Size(min = 1)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "invoice_id", nullable = false)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<InvoiceItem> invoiceItems = new LinkedHashSet<>();

    @PrePersist
    private void prePersist() {
        this.createDate = Instant.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Invoice invoice = (Invoice) o;
        return id != null && Objects.equals(id, invoice.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    public Double getTotal() {
        Double total = 0.0;
        for (InvoiceItem invoiceItem : this.invoiceItems) {
            total += invoiceItem.getAmount();
        }
        return total;
    }
}