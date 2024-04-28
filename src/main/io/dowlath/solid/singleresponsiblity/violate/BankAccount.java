package io.dowlath.solid.singleresponsiblity.violate;

/*
    SRP states that, a class should have only one reason to change,
    meaning it should have a single responsibility.
    This principle encourages you to create classes that
    do one thing and do it well.
    Lots of responsibilities make the class highly coupled, harder to maintain and harder to understand.

    In the context of ‘BankAccount’ class, managing deposits,
    withdrawals and interest are reasonable and related responsibilities
    to account management. But saveBankAccountDetails and sendSmsNotification
    methods are not related to bank account management’s behavior. Hence this class is violating SRP.
    The easiest way to fix this problem is create separate classes for managing bank accounts,
    save information to database and send SMS notifications, so that each class having only one responsibility.
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

    public void withdraw(double amount) {
        //code to withdraw amount
    }

    public double calculateInterest() {
        //code to calculate interest
        return 0.0;
    }

    public void saveBankAccountDetails() {
        //save account information to database
    }

    public void sendSmsNotification() {
        //code to send SMS notification to customer
    }
}

