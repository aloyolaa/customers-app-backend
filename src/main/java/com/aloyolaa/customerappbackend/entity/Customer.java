package com.aloyolaa.customerappbackend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "customers", uniqueConstraints = {
        @UniqueConstraint(name = "uc_customer_email", columnNames = {"email"})
})
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "{NotBlank.customer.firstName}")
    @Size(message = "{Size.customer.firstName}", min = 4, max = 45)
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @NotBlank(message = "{NotBlank.customer.lastName}")
    @Size(message = "{Size.customer.lastName}", min = 4, max = 45)
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Email(message = "{Email.customer.email}")
    @NotBlank(message = "{NotBlank.customer.email}")
    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Past(message = "{Past.customer.birthDate}")
    @NotNull(message = "{NotNull.customer.birthDate}")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @PrePersist
    private void prePersist() {
        this.createDate = LocalDateTime.now();
    }
}