package com.lucas.loans_challenge.controller.dto;

import com.lucas.loans_challenge.domain.LoanType;

public record LoanResponse(LoanType type, Integer interestRate) {
}
