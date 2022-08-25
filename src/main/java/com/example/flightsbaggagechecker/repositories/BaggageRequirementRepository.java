package com.example.flightsbaggagechecker.repositories;

import com.example.flightsbaggagechecker.models.BaggageRequirement;
import com.example.flightsbaggagechecker.models.BaggageType;
import com.example.flightsbaggagechecker.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaggageRequirementRepository extends JpaRepository<BaggageRequirement, Long> {
//    List<BaggageRequirement> findByCompanyAndType(Company company, BaggageType type);
    List<BaggageRequirement> findByCompany_IdAndBaggageType_Id(Integer companyId, Integer baggageTypeId);
}
