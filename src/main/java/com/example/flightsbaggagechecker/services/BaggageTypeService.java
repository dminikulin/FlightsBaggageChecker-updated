package com.example.flightsbaggagechecker.services;

import com.example.flightsbaggagechecker.models.BaggageType;

import java.util.List;

public interface BaggageTypeService {
    List<BaggageType> findAll();

    BaggageType save(BaggageType baggageType);
}
