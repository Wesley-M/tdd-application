package com.tdd;

public class Dba extends Employee {
    public Dba(String name, String email, Double baseSalary) {
        super(name, email, baseSalary, Position.DBA);
    }

    @Override
    public Double getSalary() {
        return null;
    }
}
