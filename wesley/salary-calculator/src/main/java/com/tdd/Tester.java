package com.tdd;

public class Tester extends Employee {
    public Tester(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.TESTER);
    }

    @Override
    public Double getSalary() {
        return null;
    }
}
