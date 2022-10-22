package com.tdd.positions;

import com.tdd.enums.Position;

public class Dba extends Employee {
    public Dba(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.DBA);
    }

    @Override
    public Double getSalary() {
        Double baseSalary = super.getBaseSalary();
        Double salary;

        if (baseSalary >= 2000) {
            salary = baseSalary * 0.75;
        } else {
            salary = baseSalary * 0.85;
        }

        return salary;
    }
}
