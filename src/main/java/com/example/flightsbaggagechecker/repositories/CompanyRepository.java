package com.example.flightsbaggagechecker.repositories;

import com.example.flightsbaggagechecker.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
