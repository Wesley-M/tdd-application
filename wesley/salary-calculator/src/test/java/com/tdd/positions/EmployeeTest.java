package com.tdd.positions;

import com.tdd.enums.Position;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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
    @DisplayName("Negative or zero salary when employee is created")
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
    @DisplayName("Negative or zero salary when setting employee base salary")
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

    @Test
    @DisplayName("Null fields throw exception")
    void checkIfNullFieldsThrowException() {
        checkForIllegal(
                () -> new Developer(null, "wesley@gmail.com", 4000.0),
                "name can't be null"
        );

        checkForIllegal(
                () -> new Developer("Wesley", null, 4000.0),
                "email can't be null"
        );

        checkForIllegal(
                () -> new Developer("Wesley", "wesley@gmail.com", null),
                "base salary can't be null"
        );
    }

    @Test
    @DisplayName("Empty fields throw exception")
    void checkIfEmptyFieldsThrowException() {
        checkForIllegal(
                () -> new Developer("", "wesley@gmail.com", 4000.0),
                "name can't be empty"
        );

        checkForIllegal(
                () -> new Developer("Wesley", "", 4000.0),
                "email can't be empty"
        );
    }

    private void checkForIllegal(Executable exe, String message) {
        IllegalArgumentException thrownNeg = assertThrows(
                IllegalArgumentException.class,
                exe,
                message
        );

        assertTrue(thrownNeg.getMessage().contains(message));
    }
}
