package io.dowlath.solid.interface_segregation.violate;

public class CheckingBankAccount implements BankAccount{
    // attributes and constructor
    // deposit and withdraw method declarations

    @Override
    public void deposit() {

    }

    public void withdraw(double amount) {
       /* if (this.balance < double amount)
        this.balance-=amount;*/
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
