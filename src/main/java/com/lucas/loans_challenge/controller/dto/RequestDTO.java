package com.lucas.loans_challenge.controller.dto;

import com.lucas.loans_challenge.domain.Customer;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Request")
public record RequestDTO(
        @Schema(description = "Customer's age", example = "26")
        Integer age,
        @Schema(description = "Customer's CPF", example = "275.484.389-23")
        String cpf,
        @Schema(description = "Customer's name", example = "Vuxaywua Zukiagou")
        String name,
        @Schema(description = "Customer's monthly income", example = "7000.00")
        Double income,
        @Schema(description = "Customer's location (state abbreviation)", example = "SP")
        String location) {

    public Customer toCustomer(){
        return new Customer(name, age, cpf, income, location);
    }

}
