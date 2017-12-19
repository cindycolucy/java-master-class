package com.colucy;

public class Main {

    public static void main(String[] args) {

       BankAccount myAccount = new BankAccount(1234, 10000.00, "Bob Brown", "myemail@bob.com", "614-209-0458");





       myAccount.withdrawFunds(100);

       myAccount.depositFunds(100);
    }

}