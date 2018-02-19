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
                    this.customerName + "'s checkings account. Remaining balance is $" + this.checkingsBalance + ".");
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
                    this.customerName + "'s savings account. Remaining balance is $" + this.savingsBalance + ".");
        }

    }

    //Step 12 transfer from savings to checkings
    public void transferFromSavings(double withdrawalAmountSavings, double depositAmountCheckings) {
        if (this.savingsBalance - withdrawalAmountSavings < 0) {
            System.out.println("Only $" + this.savingsBalance + " available. Transfer cannot be " +
                    "processed.");
        } else {
            this.savingsBalance -= withdrawalAmountSavings;
            System.out.println("Withdrawal of $" + withdrawalAmountSavings + " processed from " +
                    this.customerName + "'s savings account. Remaining balance is $" + this.savingsBalance + ".");
            this.checkingsBalance += depositAmountCheckings;
            System.out.println("Deposit of $" + depositAmountCheckings + " processed to " + this.customerName +
                    "'s checkings account. New balance is $"
                    + this.checkingsBalance + ".");
        }

    }

    //Step 14 transfer from checkings to savings                    //work on this
    public void transferFromCheckings(double withdrawalAmountCheckings, double depositAmountSavings) {
        if (this.checkingsBalance - withdrawalAmountCheckings < 0) {
            System.out.println("Only $" + this.checkingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.checkingsBalance -= withdrawalAmountCheckings;
            System.out.println("Withdrawal of $" + withdrawalAmountCheckings + " processed from " +
                    this.customerName + "'s checkings account. Remaining balance is $" + this.checkingsBalance + ".");
            this.savingsBalance += depositAmountSavings;
            System.out.println("Deposit of $" + depositAmountSavings + " processed to " + this.customerName +
                    "'s savings account. New balance is $"
                    + this.savingsBalance + ".");
        }

    }

    //step 15 transfer money from one individual checking or savings account to a different individuals checking
    //or savings account
   /* public void transferFromTo(String customerName) {
        if (this.checkingsBalance - withdrawalAmountCheckings < 0) {
            System.out.println("Only $" + this.checkingsBalance + " available. Withdrawal " +
                    "not processed.");
        } else {
            this.checkingsBalance -= withdrawalAmountCheckings;
            System.out.println("Withdrawal of $" + withdrawalAmountCheckings + " processed from " +
                    this.customerName + "'s checkings account. Remaining balance is $" + this.checkingsBalance + ".");
        }
    }*/

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
