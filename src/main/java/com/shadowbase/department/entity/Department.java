
package com.shadowbase.department.entity;

import com.shadowbase.employee.entity.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name = "departments")
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name", nullable = false, unique = true, length = 100)
    private String departmentName;

    @Column(length = 150)
    private String location;

    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
}