package com.empDetails.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class empDetailsDto {
    private long id;

    private String name;
    private String designation;
    private long salary;
}
