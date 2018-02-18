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
- third method to transfer funds between accounts
***need to update accounts involved in transactions
***need to varify account balances to determine if actions can be done, if not display message
* and ask for another action
9) create various code in the Main class to confirm your code is working
10) add some println's in the 2 methods above as well*/

package com.me;

public class Main {

    public static void main(String[] args) {

        //Step 6 use constructors to build instances
        Account jimjonesAccount = new Account("JJ2222", 5_700.12, 28_789.45,
                "Jim Jones", "jim@email.com","440-876-1299");
        Account peggysueAccount = new Account("PS4444", 8_671.19, 10_234.78,
                "Peggy Sue", "pegleg@email.com", "330-412-2190");
        Account nickbellaAccount = new Account("NB5555", 4_603.09, 15_760.37,
                "Nick Bella", "nicnac@email.com", "216-901-2471");
        Account sallywheelerAccount = new Account("SW7777", 12_507.81, 32_009.51,
                "Sally Wheeler", "swheels@email.com", "440-746-0001");

        //Step 7
        //jim
        System.out.println("--------------------------------------------");
        System.out.println("Account Number ID: " + jimjonesAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + jimjonesAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + jimjonesAccount.getSavingsBalance());
        System.out.println("Account Name: " + jimjonesAccount.getCustomerName());
        System.out.println("Account Email Address: " + jimjonesAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + jimjonesAccount.getCustomerPhoneNumber());
        System.out.println("--------------------------------------------");

        //peggy
        System.out.println("Account Number ID: " + peggysueAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + peggysueAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + peggysueAccount.getSavingsBalance());
        System.out.println("Account Name: " + peggysueAccount.getCustomerName());
        System.out.println("Account Email Address: " + peggysueAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + peggysueAccount.getCustomerPhoneNumber());
        System.out.println("--------------------------------------------");

        //nick
        System.out.println("Account NUmber ID: " + nickbellaAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + nickbellaAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + nickbellaAccount.getSavingsBalance());
        System.out.println("Account Name: " + nickbellaAccount.getCustomerName());
        System.out.println("Account Email Address: " + nickbellaAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + nickbellaAccount.getCustomerPhoneNumber());
        System.out.println("--------------------------------------------");

        //sally
        System.out.println("Account NUmber ID: " + sallywheelerAccount.getAccountNumber());
        System.out.println("Checkings Account Balance: $" + sallywheelerAccount.getCheckingsBalance());
        System.out.println("Savings Account Balance: $" + sallywheelerAccount.getSavingsBalance());
        System.out.println("Account Name: " + sallywheelerAccount.getCustomerName());
        System.out.println("Account Email Address: " + sallywheelerAccount.getCustomerEmail());
        System.out.println("Account Phone Number: " + sallywheelerAccount.getCustomerPhoneNumber());
        System.out.println("--------------------------------------------");

        System.out.println("What type of transaction would you like to conduct?");
        System.out.println("(Deposit, Withdrawal, or Transfer)"); //create logic to accept answer
        System.out.println("You chose XXXXX, is that correct?");    //create logic to replicate answer
        System.out.println("(Yes or No)");   //create logic here to proceed with program
        System.out.println("How much would you like to XXXXX?"); //depending on transaction
        System.out.println("--------------------------------------------");

    }
}

/*
--------------------------------------------
Account Number ID: JJ2222
Checkings Account Balance: $5700.12
Savings Account Balance: $28789.45
Account Name: Jim Jones
Account Email Address: jim@email.com
Account Phone Number: 440-876-1299
--------------------------------------------
Account Number ID: PS4444
Checkings Account Balance: $8671.19
Savings Account Balance: $10234.78
Account Name: Peggy Sue
Account Email Address: pegleg@email.com
Account Phone Number: 330-412-2190
--------------------------------------------
Account NUmber ID: NB5555
Checkings Account Balance: $4603.09
Savings Account Balance: $15760.37
Account Name: Nick Bella
Account Email Address: nicnac@email.com
Account Phone Number: 216-901-2471
--------------------------------------------
Account NUmber ID: SW7777
Checkings Account Balance: $12507.81
Savings Account Balance: $32009.51
Account Name: Sally Wheeler
Account Email Address: swheels@email.com
Account Phone Number: 440-746-0001
--------------------------------------------
What type of transaction would you like to conduct?
(Deposit, Withdrawal, or Transfer)
You chose XXXXX, is that correct?
(Yes or No)
How much would you like to XXXXX?
--------------------------------------------
*/
