package com.aloyolaa.customerappbackend.exception;

public class EntityNotFound extends RuntimeException {
    public EntityNotFound(Long id) {
        super("There is no data related to the ID " + id);
    }
}
