package com.tdd;

public class Developer extends Employee {
    public Developer(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.DEVELOPER);
    }
}
