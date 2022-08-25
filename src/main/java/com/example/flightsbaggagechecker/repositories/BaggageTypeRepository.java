package com.example.flightsbaggagechecker.repositories;

import com.example.flightsbaggagechecker.models.BaggageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaggageTypeRepository extends JpaRepository<BaggageType, Long> {
}
