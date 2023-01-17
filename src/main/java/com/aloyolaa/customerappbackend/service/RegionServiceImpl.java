package com.aloyolaa.customerappbackend.service;

import com.aloyolaa.customerappbackend.entity.Region;
import com.aloyolaa.customerappbackend.exception.DataAccessExceptionImpl;
import com.aloyolaa.customerappbackend.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAll() {
        try {
            return regionRepository.findAll();
        } catch (DataAccessException e) {
            throw new DataAccessExceptionImpl("Data access error", e);
        }
    }
}
