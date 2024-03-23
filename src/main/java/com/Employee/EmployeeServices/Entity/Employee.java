package com.Employee.EmployeeServices.Entity;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name; // Changed from Name to name (consider Java naming conventions)
    private String department;
}
