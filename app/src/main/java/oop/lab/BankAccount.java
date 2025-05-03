package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();

    public void transferFunds(double amount, String targetAccountNumber) {
        withdraw(amount); // simple version
        // Normally you'd interact with another account here
    }

    public void payBills(double amount) {
        withdraw(amount);
    }
}
