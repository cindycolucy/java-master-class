package com.colucy;

public class BankAccount {

    private int accountNumber;
    private double balance = 10000.00;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Balance after deposit is $" + balance);

    }

    public void withdrawFunds(double withdrawl) {
        if (this.balance - withdrawl <= 0) {
            System.out.println("Only $" + this.balance + "available.");
        } else {
            this.balance -= withdrawl;
            System.out.println("Balance after withdrawl is $" + this.balance);

        }


    }
}
