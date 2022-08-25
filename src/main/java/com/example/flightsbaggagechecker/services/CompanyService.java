package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    Company save(Company company);
}
