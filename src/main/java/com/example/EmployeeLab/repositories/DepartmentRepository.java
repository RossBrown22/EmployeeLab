package com.example.EmployeeLab.repositories;

import com.example.EmployeeLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
