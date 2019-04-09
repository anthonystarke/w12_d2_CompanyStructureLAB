package com.codeclan.example.CompanyStructure;

import com.codeclan.example.CompanyStructure.Models.Employee;
import com.codeclan.example.CompanyStructure.repositories.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {

    Employee employee;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void contextLoads() {
    }

    @Before
    public void before() {
        employee = new Employee("John", "Smith", 1234);
    }

    @Test
    public void canGetName() {
        assertEquals("John", employee.getFirstName());
        assertEquals("Smith", employee.getSecondName());
    }

    @Test
    public void canGetEmployeeNumber() {
        assertEquals(1234, employee.getEmployeeNumber());
    }

    @Test
    public void canSaveToDatabase(){
        Employee newEmployee = new Employee("John","Smith",1234);
        employeeRepository.save(newEmployee);
    }

}
