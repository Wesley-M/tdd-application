package com.tdd.positions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = null;

    @BeforeEach
    public void init(){
        manager = new Manager("Wesley Santos", "wesley123@gmail.com", 5000.0);
    }

    @Test
    @DisplayName("Get salary [Successful]")
    void whenGetSalaryThenSalaryIsRetrieved() {
        // Discount of 30%
        assertEquals(manager.getSalary(), manager.getBaseSalary() * 0.7);

        Manager auxManager = new Manager("Wesley Santos", "wesley123@gmail.com", 3000.0);

        // Discount of 20%
        assertEquals(auxManager.getSalary(), auxManager.getBaseSalary() * 0.8);
    }
}