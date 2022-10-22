package com.tdd.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterTest {
    Tester tester = null;

    @BeforeEach
    public void init(){
        tester = new Tester("Wesley Santos", "wesley123@gmail.com", 2000.0);
    }

    @Test
    @DisplayName("Get salary [Successful]")
    void whenGetSalaryThenSalaryIsRetrieved() {
        // Discount of 25% | = 2000
        assertEquals(tester.getSalary(), tester.getBaseSalary() * 0.75);

        // Discount of 25% | > 2000
        Tester auxTester = new Tester("Wesley Santos", "wesley123@gmail.com", 2500.0);
        assertEquals(auxTester.getSalary(), auxTester.getBaseSalary() * 0.75);

        // Discount of 15% | < 2000
        auxTester = new Tester("Wesley Santos", "wesley123@gmail.com", 1500.0);
        assertEquals(auxTester.getSalary(), auxTester.getBaseSalary() * 0.85);
    }
}