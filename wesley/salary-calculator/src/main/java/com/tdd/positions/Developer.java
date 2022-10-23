package com.tdd.positions;

import com.tdd.enums.Position;

public class Developer extends Employee {
    public Developer(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.DEVELOPER);
    }

    public Double getSalary() {
        return calculateDiscountedSalary(3000.0, 0.1, 0.2);
    }
}
