package com.tito;

public class Main {
  public static void main(String[] args) {
    // Classes Challenge:
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

    Bank newAcct = new Bank("0987654321", "50.00", "Cisco", "cisco@cisco.com", "111-111-1111");
//    Bank myAcct = new Bank();
//    Bank acct2 = new Bank();
//
//    System.out.println("2 - Acct Num: " + acct2.getAcctNum());
//    System.out.println("2 - Balance: $" + acct2.getBalance());
//    System.out.println("2 - Acct Holder: " + acct2.getAcctHolder());
//    System.out.println("2 - Email: " + acct2.getEmail());
//    System.out.println("2 - Phone: " + acct2.getPhoneNum() + "\n");
//
//    myAcct.setAcctNum("123456789");
//    myAcct.setBalance(100.55);
//    myAcct.setAcctHolder("Tito");
//    myAcct.setEmail("tito@yslas.com");
//    myAcct.setPhoneNum("303-303-3030");
//
//    System.out.println("Account Number: " + myAcct.getAcctNum());
//    System.out.println("Balance: $" + myAcct.getBalance());
//    System.out.println("Account Holder: " + myAcct.getAcctHolder());
//    System.out.println("Email: " + myAcct.getEmail());
//    System.out.println("Phone Number: " + myAcct.getPhoneNum() + "\n");
//    myAcct.deposit(37.46);
//    myAcct.withdrawal(138.02);
//    System.out.println("\n");

    System.out.println("Account Number: " + newAcct.getAcctNum());
    System.out.println("Balance: $" + newAcct.getBalance());
    System.out.println("Account Holder: " + newAcct.getAcctHolder());
    System.out.println("Email: " + newAcct.getEmail());
    System.out.println("Phone Number: " + newAcct.getPhoneNum() + "\n");
    newAcct.deposit(25.23);
    newAcct.withdrawal(36.55);
    System.out.println("\n");

//    System.out.printf("Balance after deposit: $%s%n", myAcct.deposit(37.46));
//    System.out.printf("Balance after withdrawal: $%s%n", myAcct.withdrawal(60.02));

    // Constructors Challenge:
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.
    VipCustomer vip0 = new VipCustomer();
    VipCustomer vip2 = new VipCustomer("King James", "king@nike.com");
    VipCustomer vip3 = new VipCustomer("Chef Curry", 250000.00, "chef@ua.com");

    System.out.println("0 - client name: " + vip0.getClientName());
    System.out.println("0 - credit limit: $" + vip0.getCreditLimit());
    System.out.println("0 - credit email: " + vip0.getEmail() + "\n");

    System.out.println("2 - client name: " + vip2.getClientName());
    System.out.println("2 - credit limit: $" + vip2.getCreditLimit());
    System.out.println("2 - credit email: " + vip2.getEmail() + "\n");

    System.out.println("3 - client name: " + vip3.getClientName());
    System.out.println("3- credit limit: $" + vip3.getCreditLimit());
    System.out.println("3 - credit email: " + vip3.getEmail());
  }
}
