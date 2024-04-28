package io.dowlath.solid.singleresponsiblity.non_violate;

// BankAccount class will handle account related responsibilities
public class BankAccount {
    private double balance;
    private String accountNo;
    private String accountType;


    //constructor
    public BankAccount(double balance, String accountNo, String accountType){
        this.balance = balance;
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public void deposit() {
        //code to deposit amount
    }

    public void withdraw(double amount) {
        //code to withdraw amount
    }

    public double calculateInterest() {
        //code to calculate interest
        return 0.0;
    }
}
