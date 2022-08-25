package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.BaggageType;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaggageTypeServiceTest {
    @Autowired
    private BaggageTypeService baggageTypeService;

    private static BaggageType baggageType1, baggageType2;

    @Order(1)
    @Test
    void save(){
        baggageType1 = new BaggageType(1, "Hand baggage");
        baggageType2 = baggageTypeService.save(baggageType1);
        System.err.println(baggageType2);
        Assertions.assertEquals(baggageType1, baggageType2);
    }

    @Order(2)
    @Test
    void findAll(){
        baggageTypeService.findAll().forEach(System.err::println);
    }
}
