package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount(String accountNumber, String accountHolder, double amount) {
        super(accountNumber, accountHolder, amount);
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * 0.03; 
        balance += interest;
    }

    @Override
    public void transferFunds(double amount, String targetAccountNumber) {
        super.transferFunds(amount, targetAccountNumber); 
    }
}
