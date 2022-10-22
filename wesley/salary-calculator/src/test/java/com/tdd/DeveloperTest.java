package com.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    Developer dev = null;

    @BeforeEach
    public void init(){
        dev = new Developer("Wesley Santos", "wesley123@gmail.com", 6000.0);
    }

    @Test
    @DisplayName("Get salary [Successful]")
    void whenGetSalaryThenSalaryIsRetrieved() {
        // Discount of 20%
        assertEquals(dev.getSalary(), dev.getBaseSalary() * 0.8);

        Developer auxDev = new Developer("Wesley Santos", "wesley123@gmail.com", 2000.0);

        // Discount of 10%
        assertEquals(auxDev.getSalary(), dev.getBaseSalary() * 0.9);
    }
}