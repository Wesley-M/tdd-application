package com.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Developer employee = null;

    @BeforeEach
    public void init(){
        employee = new Developer("Wesley Santos", "wesley123@gmail.com", 6000.0);
    }

    @Test
    @DisplayName("Employee data is retrievable")
    void whenEmployeeIsCreatedThenAllDataIsRetrievable() {
        assertEquals(employee.getName(), "Wesley Santos");
        assertEquals(employee.getEmail(), "wesley123@gmail.com");
        assertEquals(employee.getBaseSalary(), 6000);
        assertEquals(employee.getPosition(), Position.DEVELOPER);
    }

    @Test
    @DisplayName("Validating all employee possible positions")
    void allEmployeePositionsAreValid() {
        Employee auxEmployee = new Developer("Wesley Santos", "wesley123@gmail.com", 6000.0);
        assertEquals(auxEmployee.getPosition(), Position.DEVELOPER);

        auxEmployee = new Dba("Wesley Santos", "wesley123@gmail.com", 6000.0);
        assertEquals(auxEmployee.getPosition(), Position.DBA);

        auxEmployee = new Tester("Wesley Santos", "wesley123@gmail.com", 6000.0);
        assertEquals(auxEmployee.getPosition(), Position.TESTER);

        auxEmployee = new Manager("Wesley Santos", "wesley123@gmail.com", 6000.0);
        assertEquals(auxEmployee.getPosition(), Position.MANAGER);
    }

    @Test
    @DisplayName("Setters work [successful]")
    void whenSetterIsUsedThenDataChanges() {
        employee.setName("Wesley");
        assertEquals(employee.getName(), "Wesley");

        employee.setEmail("wesley@gmail.com");
        assertEquals(employee.getEmail(), "wesley@gmail.com");

        employee.setBaseSalary(7500.0);
        assertEquals(employee.getBaseSalary(), 7500);
    }
}
