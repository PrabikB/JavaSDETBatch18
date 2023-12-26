package org.example.class14;

public class Account {
    String accountNumber = "A12345";
    double balance =1000;
    String userName ="user1";
    //String passWord="Pass123";

    //access only within the same class
    private String passWord="PassWord123";

    void printHello(){
        System.out.println("Welcome to Bank of America");
    }
    private void printInfo(){
        System.out.println(accountNumber);
    }

    public void Hello(){
        System.out.println("Welcome Customer");
    }

    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println(acc.passWord);
        acc.printInfo();
        acc.printHello();
    }

}
