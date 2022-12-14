package com.tdd.positions;

import com.tdd.enums.Position;

public class Manager extends Employee {
    public Manager(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.MANAGER);
    }

    @Override
    public Double getSalary() {
        return calculateDiscountedSalary(5000.0, 0.2, 0.3);
    }
}
