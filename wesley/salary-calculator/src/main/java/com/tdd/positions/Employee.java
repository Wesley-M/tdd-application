package com.tdd.positions;

import com.tdd.enums.Position;
import com.tdd.interfaces.Salaried;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class Employee implements Salaried {
    private String name;
    private String email;
    private Double baseSalary;
    private Position position;

    public Employee(String name, String email, Double baseSalary, Position position) {
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.position = position;
        validate();
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

    public void setName(String name) {
        validateNullField(name, "name");
        validateEmptyField(name, "name");
        this.name = name;
    }

    public void setEmail(String email) {
        validateNullField(email, "email");
        validateEmptyField(email, "email");
        this.email = email;
    }

    public void setBaseSalary(Double baseSalary) {
        validateNullField(baseSalary, "base salary");
        validateNegativeOrZeroBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    private void validate() {
        validateNullField(baseSalary, "base salary");
        validateNegativeOrZeroBaseSalary(baseSalary);

        validateNullField(name, "name");
        validateEmptyField(name, "name");

        validateNullField(email, "email");
        validateEmptyField(email, "email");
    }

    private void validateNegativeOrZeroBaseSalary(Double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary can't be negative or zero");
        }
    }

    private void validateNullField(Object obj, String field) {
        if (obj == null) {
            throw new IllegalArgumentException(field + " can't be null");
        }
    }

    private void validateEmptyField(String str, String field) {
        if (str.equals("")) {
            throw new IllegalArgumentException(field + " can't be empty");
        }
    }
}
