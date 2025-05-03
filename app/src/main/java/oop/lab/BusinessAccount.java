package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String loanStatus = "No Loan";

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.04;
        balance += interest;
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
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
