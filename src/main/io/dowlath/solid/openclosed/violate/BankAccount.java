package io.dowlath.solid.openclosed.violate;

/*
     There is a problem with the calculateInterest method.
     What if there is a new account type introduced with new interest requirement,
     We have to add another if condition in the calculateInterest method.
     It violates OCP. The easiest way to fix this problem is creating a common
     interface for all account types and implement it for every account types.
 */
public class BankAccount {
    private double balance;
    private String accountNo;
    private String accountType;

    //constructor
    public BankAccount(double balance, String accountNo, String accountType) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public void deposit() {
        //code to deposit amount
    }

    public void withdraw() {
        //code to withdraw amount
    }

    // Violeting here.............

    public double calculateInterest() {
        if(this.accountType.equals("Savings"))
            return this.balance * 0.03;

        else if(this.accountType.equals("Checking"))
            return this.balance * 0.01;

        else if(this.accountType.equals("FixedDeposit"))
            return this.balance * 0.05;

        return 0.0;
    }

}