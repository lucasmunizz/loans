package com.lucas.loans_challenge.controller.dto;

import java.util.List;

public record ResponseDTO(String customer, List<LoanResponse> loans) {
}
