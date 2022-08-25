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

    private static BaggageRequirement requirement1, requirement2;

    private Company company;
    private BaggageType baggageType;

    @Test
    @Order(1)
    void save(){
        company = new Company(1, "A company");
        baggageType = new BaggageType(1, "Hand baggage");
        requirement1 = new BaggageRequirement(1L,
                company, baggageType,
                8.0, 30, 20, 40);
        requirement2 = baggageRequirementService.save(requirement1);
        System.err.println(requirement2);
        Assertions.assertEquals(requirement1, requirement2);
    }

    @Test
    @Order(2)
    void findAll(){
        baggageRequirementService.findAll().forEach(System.err::println);
    }
}
