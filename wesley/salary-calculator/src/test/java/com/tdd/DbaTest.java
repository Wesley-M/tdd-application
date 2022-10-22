package com.tdd;

import com.tdd.positions.Dba;
import com.tdd.positions.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbaTest {
    Dba dba = null;

    @BeforeEach
    public void init(){
        dba = new Dba("Wesley Santos", "wesley123@gmail.com", 2000.0);
    }

    @Test
    @DisplayName("Get salary [Successful]")
    void whenGetSalaryThenSalaryIsRetrieved() {
        // Discount of 25%
        assertEquals(dba.getSalary(), dba.getBaseSalary() * 0.75);

        Dba auxDba = new Dba("Wesley Santos", "wesley123@gmail.com", 1500.0);

        // Discount of 15%
        assertEquals(auxDba.getSalary(), auxDba.getBaseSalary() * 0.85);
    }
}