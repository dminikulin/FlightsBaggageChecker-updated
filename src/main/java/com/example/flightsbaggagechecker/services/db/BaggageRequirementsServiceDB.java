package com.example.flightsbaggagechecker.services.db;

import com.example.flightsbaggagechecker.models.BaggageRequirement;
import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.models.Company;
import com.example.flightsbaggagechecker.repositories.BaggageRequirementRepository;
import com.example.flightsbaggagechecker.services.BaggageRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaggageRequirementsServiceDB implements BaggageRequirementService {

    @Autowired
    private BaggageRequirementRepository baggageRequirementRepository;

    @Override
    public List<BaggageRequirement> findAll() {
        return baggageRequirementRepository.findAll();
    }

    @Override
    public BaggageRequirement save(BaggageRequirement requirement) {
        return baggageRequirementRepository.save(requirement);
    }

    @Override
    public List<BaggageRequirement> findByCompany_IdAndBaggageType_Id(Integer companyId, Integer baggageTypeId) {
        return baggageRequirementRepository.findByCompany_IdAndBaggageType_Id(companyId, baggageTypeId);
    }
}
