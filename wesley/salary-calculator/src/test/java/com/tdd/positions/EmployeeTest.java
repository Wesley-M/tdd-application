package com.tdd.positions;

import com.tdd.enums.Position;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Negative salary when employee is created")
    void givenNegativeOrZeroSalaryWhenEmployeeIsCreatedThenEmployeeThrowsException() {
        IllegalArgumentException thrownNeg = assertThrows(
                IllegalArgumentException.class,
                () -> new Developer("Wesley Santos", "wesley123@gmail.com", -6000.0),
                "Expected to throw exception, but nothing happened"
        );

        assertTrue(thrownNeg.getMessage().contains("Base salary can't be negative or zero"));

        IllegalArgumentException thrownZero = assertThrows(
                IllegalArgumentException.class,
                () -> new Developer("Wesley Santos", "wesley123@gmail.com", 0.0),
                "Expected to throw exception, but nothing happened"
        );

        assertTrue(thrownZero.getMessage().contains("Base salary can't be negative or zero"));
    }

    @Test
    @DisplayName("Negative salary when setting employee base salary")
    void givenNegativeOrZeroSalaryWhenSettingBaseSalaryThenThrowsException() {
        IllegalArgumentException thrownNeg = assertThrows(
                IllegalArgumentException.class,
                () -> employee.setBaseSalary(-1000.0),
                "Expected to throw exception, but nothing happened"
        );

        assertTrue(thrownNeg.getMessage().contains("Base salary can't be negative or zero"));

        IllegalArgumentException thrownZero = assertThrows(
                IllegalArgumentException.class,
                () -> employee.setBaseSalary(0.0),
                "Expected to throw exception, but nothing happened"
        );

        assertTrue(thrownZero.getMessage().contains("Base salary can't be negative or zero"));
    }
}
