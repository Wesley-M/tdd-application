package com.tdd.positions;

import com.tdd.positions.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    Developer dev = null;

    @BeforeEach
    public void init(){
        dev = new Developer("Wesley Santos", "wesley123@gmail.com", 3000.0);
    }

    @Test
    @DisplayName("Get salary [Successful]")
    void whenGetSalaryThenSalaryIsRetrieved() {
        // Discount of 20% | = 3000
        assertEquals(dev.getSalary(), dev.getBaseSalary() * 0.8);

        // Discount of 20% | > 3000
        Developer auxDev = new Developer("Wesley Santos", "wesley123@gmail.com", 10000.0);
        assertEquals(auxDev.getSalary(), auxDev.getBaseSalary() * 0.8);

        // Discount of 10% | < 3000
        auxDev = new Developer("Wesley Santos", "wesley123@gmail.com", 2000.0);
        assertEquals(auxDev.getSalary(), auxDev.getBaseSalary() * 0.9);
    }
}