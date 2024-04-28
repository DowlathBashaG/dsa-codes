package io.dowlath.solid.interface_segregation.non_violate;

public class CheckingBankAccount implements BankAccount, Withdrawable {
    @Override
    public void deposit() {

    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void withdraw() {

    }
    // deposit, calculateInterest, withdraw methods definitions
}
