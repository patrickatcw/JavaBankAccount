package com.me;

//Step 1, create a new class for a bank account
public class Account {

    //Step 2 create fields for the account number, balance, customer name, email, & phone number
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //Step 3 constructor with parameters
    public Account(String accountNumber, double balance, String customerName, String customerEmail,
                   String customerPhoneNumber) {

     //Step 4 make this. to reference fields above
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.customerName = customerName;
     this.customerEmail = customerEmail;
     this.customerPhoneNumber = customerPhoneNumber;

    }

    //Step 5 create getter methods for this. fields
    //use Code>Generate>Getter, etc. in Menu above

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
}
