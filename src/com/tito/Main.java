package com.tito;

public class Main {
  public static void main(String[] args) {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    Bank myAcct = new Bank();
    myAcct.setAcctNum("123456789");
    myAcct.setBalance(100.55);
    myAcct.setAcctHolder("Tito");
    myAcct.setEmail("tito@yslas.com");
    myAcct.setPhoneNum("303-303-3030");

    System.out.println("Account Number: " + myAcct.getAcctNum());
    System.out.println("Balance: $" + myAcct.getBalance());
    System.out.println("Account Holder: " + myAcct.getAcctHolder());
    System.out.println("Email: " + myAcct.getEmail());
    System.out.println("Phone Number: " + myAcct.getPhoneNum());

    System.out.printf("Balance after deposit: $%s%n", myAcct.deposit(37.46));
    System.out.printf("Balance after withdrawal: $%s%n", myAcct.withdrawal(60.02));
  }
}
