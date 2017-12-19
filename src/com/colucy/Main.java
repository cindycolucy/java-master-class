package com.colucy;

public class Main {

    public static void main(String[] args) {

       BankAccount myAccount = new BankAccount();
       myAccount.withdrawFunds(100);

       myAccount.depositFunds(100);
    }

}