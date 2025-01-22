package com.lucas.loans_challenge.domain;

import java.util.Objects;

public class Customer {

    private String name;
    private Integer age;
    private String cpf;
    private Double income;
    private String location;

    public Customer(String name, Integer age, String cpf, Double income, String location) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.income = income;
        this.location = location;
    }

    public boolean isIncomeGreaterOrEqualThan(Double value){
        return this.income >= value;
    }

    public boolean isIncomeLowerOrEqualThan(Double value){
        return this.income <= value;
    }

    public boolean isIncomeBetween(Double value1, Double value2){
        return this.income >= value1 && this.income <= value2;
    }

    public boolean isFromLocation(String location){
        return this.location.equals(location);
    }

    public boolean isAgeLowerThan(Integer age){
        return this.age < age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(age, customer.age) && Objects.equals(cpf, customer.cpf) && Objects.equals(income, customer.income) && Objects.equals(location, customer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cpf, income, location);
    }
}
