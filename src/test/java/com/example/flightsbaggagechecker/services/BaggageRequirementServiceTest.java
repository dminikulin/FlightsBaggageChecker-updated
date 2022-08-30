package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.BaggageRequirement;
import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.models.Company;
import com.example.flightsbaggagechecker.repositories.BaggageRequirementRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaggageRequirementServiceTest {
    @Autowired
    private BaggageRequirementService baggageRequirementService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private BaggageTypeService baggageTypeService;

    private static BaggageRequirement requirement1, requirement2;

    @Test
    @Order(1)
    void save(){
        Company company = new Company(1, "A company");
        company = companyService.save(company);
        BaggageType baggageType = new BaggageType(1, "Hand baggage");
        baggageType = baggageTypeService.save(baggageType);
        requirement1 = new BaggageRequirement(1L,
                company, baggageType,
                8.0, 30, 20, 40);
        requirement2 = baggageRequirementService.save(requirement1);
//        System.err.println(requirement2);
        Assertions.assertEquals(requirement1, requirement2);
    }

    @Test
    @Order(2)
    void findByCompany_IdAndBaggageType_Id(){
        Company company = new Company(1, "A Company");
        BaggageType baggageType = new BaggageType(2, "Hand baggage");
        baggageRequirementService.findByCompany_IdAndBaggageType_Id(company.getId(), baggageType.getId())
                .forEach(System.err::println);
    }

    @Test
    @Order(3)
    void findAll(){
        baggageRequirementService.findAll().forEach(System.err::println);
    }
}
