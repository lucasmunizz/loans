package com.lucas.loans_challenge.controller;

import com.lucas.loans_challenge.controller.dto.RequestDTO;
import com.lucas.loans_challenge.controller.dto.ResponseDTO;
import com.lucas.loans_challenge.service.LoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
@Tag(name = "Loan API", description = "API for managing customer loans")
public class LoanController {

    @Autowired
    LoanService loanService;

    @PostMapping()
    @Operation(summary = "Get available loans for a customer", description = "Returns a list of loans with their types and interest rates.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved loans"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<ResponseDTO>getLoans(@RequestBody RequestDTO body){

        ResponseDTO response = this.loanService.getLoans(body);

        return ResponseEntity.ok().body(response);
    }

}
