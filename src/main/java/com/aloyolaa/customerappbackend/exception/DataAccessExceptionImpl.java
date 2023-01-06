package com.aloyolaa.customerappbackend.exception;

import org.springframework.dao.DataAccessException;

public class DataAccessExceptionImpl extends DataAccessException {

    public DataAccessExceptionImpl(String msg, Throwable cause) {
        super(msg, cause);
    }
}
