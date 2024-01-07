package com.empDetails.Service.ServiceImpl;

import com.empDetails.Entity.empDetails;
import com.empDetails.Payload.empDetailsDto;
import com.empDetails.Repository.empRepository;
import com.empDetails.Service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empServiceImpl implements empService {
    @Autowired
    private empRepository empRepo;
    @Override
    public empDetailsDto createEmpDetailsService(empDetailsDto empDto) {
        empDetails emp=new empDetails();
        emp.setName(empDto.getName());
        emp.setDesignation(empDto.getDesignation());
        emp.setSalary(empDto.getSalary());
        empDetails saved = empRepo.save(emp);

        empDetailsDto dto=new empDetailsDto();
        dto.setName(saved.getName());
        dto.setDesignation(saved.getDesignation());
        dto.setSalary(saved.getSalary());

        return dto;


    }
}
