package com.tdd;

public class Developer extends Employee {
    public Developer(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.DEVELOPER);
    }

    public Double getSalary() {
        Double baseSalary = super.getBaseSalary();
        Double salary;

        if (baseSalary >= 3000) {
            salary = baseSalary * 0.8;
        } else {
            salary = baseSalary * 0.9;
        }

        return salary;
    }
}
