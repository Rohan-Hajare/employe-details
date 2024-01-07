package com.empDetails.Controller;

import com.empDetails.Payload.empDetailsDto;
import com.empDetails.Repository.empRepository;
import com.empDetails.Service.ServiceImpl.empServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class empDetailsController {

 private empServiceImpl empService;

    public empDetailsController(empServiceImpl empService) {

        this.empService = empService;
    }
@PostMapping
    public ResponseEntity<empDetailsDto> createEmpDetails(@RequestBody empDetailsDto empDto)
    {
        empDetailsDto dto = empService.createEmpDetailsService(empDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
