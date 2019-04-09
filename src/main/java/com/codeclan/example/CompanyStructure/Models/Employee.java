package com.codeclan.example.CompanyStructure.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "employee_number")
    private int employeeNumber;

//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(
//            name = "employees_projects",
//            joinColumns = { @JoinColumn(
//                    name = "employee_id",
//                    nullable = false,
//                    updatable = false)
//            },
//            inverseJoinColumns = { @JoinColumn(
//                    name = "project_id",
//                    nullable = false,
//                    updatable = false)
//            }
//    )
//    private List<Project> projects;

    public Employee() {};

    public Employee(String firstName, String secondName, int employeeNumber) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.employeeNumber = employeeNumber;
//        this.projects = new ArrayList<>();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

//    public List<Project> getProjects() {
//        return projects;
//    }
//
//    public void setProjects(Project project) {
//        this.projects.add(project);
//    }
}
