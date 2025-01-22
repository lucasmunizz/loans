package com.lucas.loans_challenge.service;

import com.lucas.loans_challenge.controller.dto.LoanResponse;
import com.lucas.loans_challenge.controller.dto.RequestDTO;
import com.lucas.loans_challenge.controller.dto.ResponseDTO;
import com.lucas.loans_challenge.domain.Loan;
import com.lucas.loans_challenge.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoanService {

    public ResponseDTO getLoans(RequestDTO customerDto){
        var customer = customerDto.toCustomer();

        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if(loan.isGuaranteedLoanAvailable()){
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getGuaranteedLoanInterestRate()));
        }

        if (loan.isConsignmentLoanAvailable()){
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignmentLoanInterestRate()));
        }

        return new ResponseDTO(customer.getName(), loans);

    }

}
