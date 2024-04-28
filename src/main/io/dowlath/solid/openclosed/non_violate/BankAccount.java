package io.dowlath.solid.openclosed.non_violate;

public interface BankAccount {
    public void deposit();
    public void withdraw(double amount);
    public double calculateInterest();
}
