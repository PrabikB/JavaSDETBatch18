package org.example.homework;
/* Banking System Task: Design a BankAccount class with subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount.
Common attributes might include accountNumber, balance, and accountHolderName.
Override methods like withdraw and deposit in each subclass to handle specific rules.
Introduce unique methods like applyInterest in SavingsAccount.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    public void printInfo(){
        System.out.println("Name of account holder : "+accountHolderName+"     ||   Account No. : "+accountNumber+"    ||   Current Balance : $"+balance);
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited : $" + amount);
        System.out.println("Balance after deposit : $"+balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Ammount withdrawn : $" + amount);
            System.out.println("Balance after withdraw : $"+balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, String accountHolderName,double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
    public void withInterest(){
        double interest = getBalance() * (interestRate/100);
        double totalBalanceWithInterest = interest +getBalance();
        System.out.println("APR of "+interestRate+" on " +getBalance()+ " is "+interest);
        System.out.println("Available balance is $"+totalBalanceWithInterest);
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}
class FixedDeposite extends BankAccount{
    public FixedDeposite(String accountNumber, double balance, String accountHolderName) {
        super(accountNumber, balance, accountHolderName);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}

