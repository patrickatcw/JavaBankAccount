package com.me;

//Step 1, create a new class for a bank account
public class Account {

    //Step 2 create fields for the account number, balance, customer name, email, & phone number
    private String accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //Step 3 constructor with parameters
    public Account(String accountNumber, double checkingsBalance, double savingsBalance, String customerName, String customerEmail,
                   String customerPhoneNumber) {

        //Step 4 make this. to reference fields above
        this.accountNumber = accountNumber;
        this.checkingsBalance = checkingsBalance;
        this.savingsBalance = savingsBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    //Step 8 deposit checkings
    public void depositCheckings(double depositAmountCheckings) {
        this.checkingsBalance += depositAmountCheckings;
        System.out.println("Deposit of $" + depositAmountCheckings + " processed to " + this.customerName +
                "'s checkings account. New balance is $"
                + this.checkingsBalance + ".");
    }

    //Step 9 withdrawal checkings
    public void withdrawalCheckings(double withdrawalAmountCheckings) {
        if (this.checkingsBalance - withdrawalAmountCheckings < 0) {
            System.out.println("Only $" + this.checkingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.checkingsBalance -= withdrawalAmountCheckings;
            System.out.println("Withdrawal of $" + withdrawalAmountCheckings + " processed from " +
                    this.customerName + "'s checkings account. Remaining balance = $" + this.checkingsBalance + ".");
        }
    }

    //Step 10 deposit savings
    public void depositSavings(double depositAmountSavings) {
        this.savingsBalance += depositAmountSavings;
        System.out.println("Deposit of $" + depositAmountSavings + " processed to " + this.customerName +
                "'s savings account. New balance is $"
                + this.savingsBalance + ".");
    }

    //Step 11 withdrawal savings
    public void withdrawalSavings(double withdrawalAmountSavings) {
        if (this.savingsBalance - withdrawalAmountSavings < 0) {
            System.out.println("Only $" + this.savingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.savingsBalance -= withdrawalAmountSavings;
            System.out.println("Withdrawal of $" + withdrawalAmountSavings + " processed from " +
                    this.customerName + "'s savings account. Remaining balance = $" + this.savingsBalance + ".");
        }

    }

    //Step 12 transfer from savings                     //work on this
    public void transferFromSavings(double depositAmountSavings) {
        this.savingsBalance += depositAmountSavings;
        System.out.println("Transfer of $" + depositAmountSavings + " made to " + this.customerName +
                "'s savings account. New balance is $"
                + this.savingsBalance + ".");
    }

    //Step 13 transfer to savings                       //work on this
    public void transferToSavings(double withdrawalAmountSavings) {
        if (this.savingsBalance - withdrawalAmountSavings < 0) {
            System.out.println("Only $" + this.savingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.savingsBalance -= withdrawalAmountSavings;
            System.out.println("Withdrawal of $" + withdrawalAmountSavings + " processed." +
                    "Remaining balance = $" + this.savingsBalance + ".");
        }

    }

    //Step 14 transfer from checkings                       //work on this
    public void transferFromCheckings(double depositAmountSavings) {
        this.savingsBalance += depositAmountSavings;
        System.out.println("Deposit of $" + depositAmountSavings + " made to " + this.customerName +
                "'s savings account. New balance is $"
                + this.savingsBalance + ".");
    }

    //Step 15 transfer from savings                     //work on this
    public void transferToCheckings(double withdrawalAmountSavings) {
        if (this.savingsBalance - withdrawalAmountSavings < 0) {
            System.out.println("Only $" + this.savingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.savingsBalance -= withdrawalAmountSavings;
            System.out.println("Withdrawal of $" + withdrawalAmountSavings + " processed." +
                    "Remaining balance = $" + this.savingsBalance + ".");
        }

    }

    //Step 5 create getter methods for this. fields
    //use Code>Generate>Getter, etc. in Menu above
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCheckingsBalance() {
        return checkingsBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
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
