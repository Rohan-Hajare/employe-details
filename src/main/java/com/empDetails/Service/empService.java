package com.empDetails.Service;

import com.empDetails.Payload.empDetailsDto;

public interface empService {

    empDetailsDto createEmpDetailsService(empDetailsDto empDto);

    void deleteEmpDetailsService(long empId);
}
