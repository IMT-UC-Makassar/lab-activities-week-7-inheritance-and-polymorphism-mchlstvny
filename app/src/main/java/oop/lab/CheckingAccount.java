package oop.lab;

public class CheckingAccount extends BankAccount implements Onlineservice {
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }   

    @Override
    public void calculateInterest() {
    }

    @Override
    public void transferFunds() {
        super.transferFunds(amount, targetAccountNumber);
    }

    @Override
    public void payBills(double amount) {
        super.payBills(amount);
    }
}