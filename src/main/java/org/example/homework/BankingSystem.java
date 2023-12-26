package org.example.homework;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount sA = new SavingsAccount("CHB00123",10500.89,"Easter April",4.5);
        sA.printInfo();
        sA.deposit(4500);
        sA.withdraw(3500);
        sA.withInterest();


        System.out.println("********************************************");

        CheckingAccount cA = new CheckingAccount("WF00234",5000.50,"Paul Lee");
        cA.printInfo();
        cA.deposit(2000);
        cA.withdraw(800);

        System.out.println("********************************************");

        FixedDeposite fD = new FixedDeposite("BOA12345",17532.37,"John Moore");
        fD.printInfo();
        fD.deposit(2550);
        fD.withdraw(5000);
    }
}
