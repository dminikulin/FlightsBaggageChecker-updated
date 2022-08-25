package com.example.flightsbaggagechecker.services.db;

import com.example.flightsbaggagechecker.models.Company;
import com.example.flightsbaggagechecker.repositories.CompanyRepository;
import com.example.flightsbaggagechecker.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceDB implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
