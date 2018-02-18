/*Directions
1) create a new class for a bank account
2) create fields for the account number, balance, customer name, email, & phone number
3) make constructor with parameters
4) make this. references in constructor method body
5) create getter methods for this.fields
6) use constructors to build new instance
7) println
8) create two additional methods;
- one method to allow the customer to deposit funds (this should increment the balance field)
- the second method to allow the customer to withdraw funds (this should deduct from
the balance field, but not allow the withdrawal to complete if there are insufficient funds)
9) create various code in the Main class to confirm your code is working
10) add some println's in the 2 methods above as well*/

package com.me;

public class Main {

    public static void main(String[] args) {

        //Step 6 use constructors to build instances
        Account jimjonesAccount = new Account("2222", 5000.00, "Jim Jones",
                "jim@email.com","440-876-1299");
        Account peggysueAccount = new Account("4444", 8000.00, "Peggy Sue",
                "peggy@email.com", "330-512-9034");
        Account nickbellaAccount = new Account("6666", 4000.00, "Nick Bella",
                "nick@email.com", "216-901-2471");

    }

}
