package io.dowlath.solid.openclosed.non_violate;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsBankAccount = new SavingsBankAccount();
        double savingsBankAccountInterest = savingsBankAccount. calculateInterest();

        BankAccount checkingBankAccount = new CheckingBankAccount();
        double checkingBankAccountInterest = checkingBankAccount. calculateInterest();

        BankAccount fixedDepositBankAccount = new FixedDepositBankAccount();
        double fixedDepositBankAccountInterest = fixedDepositBankAccount. calculateInterest();
    }
}
