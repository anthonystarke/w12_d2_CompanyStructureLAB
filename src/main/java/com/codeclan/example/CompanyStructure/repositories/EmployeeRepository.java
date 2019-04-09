package com.codeclan.example.CompanyStructure.repositories;

import com.codeclan.example.CompanyStructure.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
