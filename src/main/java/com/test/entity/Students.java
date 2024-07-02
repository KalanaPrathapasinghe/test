package com.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long studentId;
    private String studentName;
    private String  address;
    @Column(nullable = true)
    private int status;
}
