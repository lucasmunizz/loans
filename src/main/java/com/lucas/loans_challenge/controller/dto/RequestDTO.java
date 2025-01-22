package com.lucas.loans_challenge.controller.dto;

import com.lucas.loans_challenge.domain.Customer;

public record RequestDTO(Integer age, String cpf, String name, Double income, String location) {

    public Customer toCustomer(){
        return new Customer(name, age, cpf, income, location);
    }

}
