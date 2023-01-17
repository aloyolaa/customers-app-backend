package com.aloyolaa.customerappbackend.repository;

import com.aloyolaa.customerappbackend.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}