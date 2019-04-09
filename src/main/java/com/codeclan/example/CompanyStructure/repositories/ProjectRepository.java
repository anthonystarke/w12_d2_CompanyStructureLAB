package com.codeclan.example.CompanyStructure.repositories;


import com.codeclan.example.CompanyStructure.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
