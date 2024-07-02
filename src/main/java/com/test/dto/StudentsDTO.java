package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsDTO {
    private long studentId;
    private String studentName;
    private String  address;
}
