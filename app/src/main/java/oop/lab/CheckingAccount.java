package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        // Checking accounts do not earn interest
    }

    @Override
    public void transferFunds(double amount, String targetAccountNumber) {
        super.transferFunds(amount, targetAccountNumber);
    }

    @Override
    public void payBills(double amount) {
        super.payBills(amount);
    }
}
