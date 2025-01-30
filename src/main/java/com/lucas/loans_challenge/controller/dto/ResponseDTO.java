package com.lucas.loans_challenge.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(name = "Response")
public record ResponseDTO(
        @Schema(description = "Customer's name", example = "Vuxaywua Zukiagou")
        String customer,

        @Schema(description = "List of available loans")
        List<LoanResponse> loans) {
}
