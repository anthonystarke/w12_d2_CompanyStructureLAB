package com.codeclan.example.CompanyStructure;

import com.codeclan.example.CompanyStructure.Models.Project;
import com.codeclan.example.CompanyStructure.repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectTest {

    Project project;


    @Test
        public void contextLoads() {
    }

    @Autowired
    ProjectRepository projectRepository;

    @Test
    public void canSaveToDatabase() {
        project = new Project("Joe", 5);
        projectRepository.save(project);
    }
}
