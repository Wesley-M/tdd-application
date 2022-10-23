package com.tdd.positions;

import com.tdd.enums.Position;

public class Tester extends Employee {
    public Tester(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.TESTER);
    }

    @Override
    public Double getSalary() {
        return calculateDiscountedSalary(2000.0, 0.15, 0.25);
    }
}
