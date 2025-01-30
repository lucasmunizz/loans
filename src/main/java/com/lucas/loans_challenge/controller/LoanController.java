package com.lucas.loans_challenge.controller;

import com.lucas.loans_challenge.controller.dto.RequestDTO;
import com.lucas.loans_challenge.controller.dto.ResponseDTO;
import com.lucas.loans_challenge.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    LoanService loanService;

    @PostMapping()
    public ResponseEntity<ResponseDTO>getLoans(@RequestBody RequestDTO body){

        ResponseDTO response = this.loanService.getLoans(body);

        return ResponseEntity.ok().body(response);
    }

}
