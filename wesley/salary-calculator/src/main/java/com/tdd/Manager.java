package com.tdd;

public class Manager extends Employee {
    public Manager(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.MANAGER);
    }
}