package com.tdd.positions;

import com.tdd.enums.Position;

public class Manager extends Employee {
    public Manager(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.MANAGER);
    }

    @Override
    public Double getSalary() {
        Double baseSalary = super.getBaseSalary();
        Double salary;

        if (baseSalary >= 5000) {
            salary = baseSalary * 0.7;
        } else {
            salary = baseSalary * 0.8;
        }

        return salary;
    }
}
