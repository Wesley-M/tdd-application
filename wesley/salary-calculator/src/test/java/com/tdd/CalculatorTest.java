package com.tdd;

import com.tdd.positions.Dba;
import com.tdd.positions.Developer;
import com.tdd.positions.Manager;
import com.tdd.positions.Tester;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Get dev salary")
    void whenDevGetSalaryThenSalaryIsRetrieved() {
        // base salary >= 3000
        Developer auxDev = new Developer("Wesley Santos", "wesley123@gmail.com", 3000.0);
        assertEquals(SalaryCalculator.getSalary(auxDev), auxDev.getBaseSalary() * 0.8);

        // base salary < 3000
        auxDev = new Developer("Wesley Santos", "wesley123@gmail.com", 2000.0);
        assertEquals(SalaryCalculator.getSalary(auxDev), auxDev.getBaseSalary() * 0.9);
    }

    @Test
    @DisplayName("Get dba salary")
    void whenDbaGetSalaryThenSalaryIsRetrieved() {
        // base salary >= 2000
        Dba auxDba = new Dba("Wesley Santos", "wesley123@gmail.com", 3000.0);
        assertEquals(SalaryCalculator.getSalary(auxDba), auxDba.getBaseSalary() * 0.75);

        // base salary < 2000
        auxDba = new Dba("Wesley Santos", "wesley123@gmail.com", 1500.0);
        assertEquals(SalaryCalculator.getSalary(auxDba), auxDba.getBaseSalary() * 0.85);
    }

    @Test
    @DisplayName("Get tester salary")
    void whenTesterGetSalaryThenSalaryIsRetrieved() {
        // base salary >= 2000
        Tester auxTester = new Tester("Wesley Santos", "wesley123@gmail.com", 3000.0);
        assertEquals(SalaryCalculator.getSalary(auxTester), auxTester.getBaseSalary() * 0.75);

        // base salary < 2000
        auxTester = new Tester("Wesley Santos", "wesley123@gmail.com", 1500.0);
        assertEquals(SalaryCalculator.getSalary(auxTester), auxTester.getBaseSalary() * 0.85);
    }

    @Test
    @DisplayName("Get manager salary")
    void whenManagerGetSalaryThenSalaryIsRetrieved() {
        // base salary >= 5000
        Manager auxManager = new Manager("Wesley Santos", "wesley123@gmail.com", 5000.0);
        assertEquals(SalaryCalculator.getSalary(auxManager), auxManager.getBaseSalary() * 0.7);

        // base salary < 5000
        auxManager = new Manager("Wesley Santos", "wesley123@gmail.com", 3500.0);
        assertEquals(SalaryCalculator.getSalary(auxManager), auxManager.getBaseSalary() * 0.8);
    }
}
