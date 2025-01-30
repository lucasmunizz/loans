package com.lucas.loans_challenge.controller.dto;

import com.lucas.loans_challenge.domain.LoanType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Loan")
public record LoanResponse(
        @Schema(description = "Type of loan", example = "PERSONAL")
        LoanType type,

        @Schema(description = "Interest rate for the loan", example = "4")
        Integer interestRate) {
}
