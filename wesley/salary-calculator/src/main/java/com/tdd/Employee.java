package com.tdd;

public class Employee {
    private String name;
    private String email;
    private Double baseSalary;
    private Position position;

    public Employee(String name, String email, Double baseSalary, Position position) {
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Position getPosition() {
        return position;
    }
}
