/*Directions
1) create a new class for a bank account
2) create fields for the account number, balance, customer name, email, & phone number
3) make constructor with parameters
4) make this. references in constructor method body
5) create getter methods for this.fields
6) use constructors to build new instance
7) println
8) create 3 additional methods;
- one method to allow the customer to deposit funds (this should increment the balance field)
- second method to allow the customer to withdraw funds (this should deduct from
the balance field, but not allow the withdrawal to complete if there are insufficient funds)
- third methd to transfer funds between accounts
9) create various code in the Main class to confirm your code is working
10) add some println's in the 2 methods above as well*/

package com.me;

public class Main {

    public static void main(String[] args) {

        //Step 6 use constructors to build instances
        Account jimjonesAccount = new Account("2222", 5700.12, 28_789.45,
                "Jim Jones", "jim@email.com","440-876-1299");
        Account peggysueAccount = new Account("4444", 8671.19, 10_234.78,
                "Peggy Sue", "pegleg@email.com", "330-412-2190");
        Account nickbellaAccount = new Account("6666", 4603.09, 15_760.37,
                "Nick Bella", "nicnac@email.com", "216-901-2471");

        //Step 7
        //jim
        System.out.println("Account Number ID: " + jimjonesAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + jimjonesAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + jimjonesAccount.getSavingsBalance());
        System.out.println("Account Name: " + jimjonesAccount.getCustomerName());
        System.out.println("Account Email Address: " + jimjonesAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + jimjonesAccount.getCustomerPhoneNumber());
        System.out.println();

        //peggy
        System.out.println("Account Number ID " + peggysueAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + peggysueAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + peggysueAccount.getSavingsBalance());
        System.out.println("Account Name: " + peggysueAccount.getCustomerName());
        System.out.println("Account Email Address: " + peggysueAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + peggysueAccount.getCustomerPhoneNumber());
        System.out.println();

        //nick
        System.out.println("Account NUmber ID " + nickbellaAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + nickbellaAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + nickbellaAccount.getSavingsBalance());
        System.out.println("Account Name: " + nickbellaAccount.getCustomerName());
        System.out.println("Account Email Address: " + nickbellaAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + nickbellaAccount.getCustomerPhoneNumber());

    }
}
