import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int num, String name, double bal) {
        super(num, name, bal);
    }

    double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan of ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int num, String name, double bal) {
        super(num, name, bal);
    }

    double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for business loan of ₹" + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Krish", 15000));
        accounts.add(new CurrentAccount(102, "Rohit", 80000));
        for (BankAccount a : accounts) {
            System.out.println(a.getHolderName() + " Interest: " + a.calculateInterest());
            ((Loanable) a).applyForLoan(20000);
            System.out.println("Eligible: " + ((Loanable) a).calculateLoanEligibility());
        }
    }
}
