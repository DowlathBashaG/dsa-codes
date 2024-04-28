package io.dowlath.solid.interface_segregation.violate;

/*
    ISP states that, clients should not be forced to depend on interfaces they do not use.
    This principle encourages you to create specific, fine-grained interfaces rather than large,
    monolithic ones, to avoid forcing clients to implement methods they don’t need.
 */
public interface BankAccount{
    public void deposit();
    public void withdraw(double amount);
    public double calculateInterest();
}
