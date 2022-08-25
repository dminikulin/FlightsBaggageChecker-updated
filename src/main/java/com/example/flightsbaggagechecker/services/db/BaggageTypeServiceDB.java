package com.example.flightsbaggagechecker.services.db;

import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.repositories.BaggageTypeRepository;
import com.example.flightsbaggagechecker.services.BaggageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaggageTypeServiceDB implements BaggageTypeService {

    @Autowired
    private BaggageTypeRepository baggageTypeRepository;

    @Override
    public List<BaggageType> findAll() {
        return baggageTypeRepository.findAll();
    }

    @Override
    public BaggageType save(BaggageType baggageType) {
        return baggageTypeRepository.save(baggageType);
    }
}
