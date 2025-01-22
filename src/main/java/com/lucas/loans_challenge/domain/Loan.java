package com.lucas.loans_challenge.domain;

public class Loan {
    private Customer customer;

    public Loan(Customer customer){
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable(){
        return getBasicLoan();
    }

    public boolean isConsignmentLoanAvailable(){
        return this.customer.isIncomeGreaterOrEqualThan(5000.00);
    }

    public boolean isGuaranteedLoanAvailable(){
        return getBasicLoan();
    }

    public Integer getPersonalLoanInterestRate(){
        return 4;
    }

    public Integer getGuaranteedLoanInterestRate(){
        return 3;
    }

    public Integer getConsignmentLoanInterestRate(){
        return 2;
    }

    private boolean getBasicLoan(){
        return (this.customer.isIncomeLowerOrEqualThan(3000.00))
                || (this.customer.isIncomeBetween(3000.00, 5000.00) &&
                    this.customer.isAgeLowerThan(30) &&
                    this.customer.isFromLocation("SP"));

    }

}

