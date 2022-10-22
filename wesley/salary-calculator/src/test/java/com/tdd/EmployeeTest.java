package com.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Employee employee = null;

    @BeforeEach
    public void init(){
        employee = new Employee("Wesley Santos", "wesley123@gmail.com", 6000.0, Position.DEVELOPER);
    }

    @Test
    @DisplayName("Employee data is retrievable")
    void whenEmployeeIsCreatedThenAllDataIsRetrievable() {
        assertEquals(employee.getName(), "Wesley Santos");
        assertEquals(employee.getEmail(), "wesley123@gmail.com");
        assertEquals(employee.getBaseSalary(), 6000);
        assertEquals(employee.getPosition(), Position.DEVELOPER);
    }
}
