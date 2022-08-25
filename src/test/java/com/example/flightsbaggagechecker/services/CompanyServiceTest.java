package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.Company;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

    private static Company company1;
    private static Company company2;

    @Test
    @Order(1)
    void save(){
        company1 = new Company(1, "A company");
        company2 = companyService.save(company1);
        System.err.println(company2);
        Assertions.assertEquals(company1, company2);
    }

    @Test
    @Order(2)
    void findAll(){
        companyService.findAll().forEach(System.err::println);
    }
}
