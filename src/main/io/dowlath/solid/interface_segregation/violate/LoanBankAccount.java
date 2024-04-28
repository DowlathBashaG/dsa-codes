package io.dowlath.solid.interface_segregation.violate;

public class LoanBankAccount implements BankAccount{
    // attributes and constructor
    // deposit and withdraw method declarations

    public double withdraw() {
        //empty method – cannot withdraw from loan accounts
        return 0.0;
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
