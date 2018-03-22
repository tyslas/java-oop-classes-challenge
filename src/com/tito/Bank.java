package com.tito;

public class Bank {
  private String acctNum;
  private String balance;
  private String acctHolder;
  private String email;
  private String phoneNum;

  public void setAcctNum(String userAcct) {
    this.acctNum = userAcct;
  }

  public void setBalance(double balance) {
    String value = String.valueOf(balance);
    this.balance = value;
  }

  public void setAcctHolder(String acctHolder) {
    this.acctHolder = acctHolder;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }


  public String getAcctNum() {
    return this.acctNum;
  }

  public String getBalance() {
//    double value = Double.parseDouble(this.balance);
    return this.balance;
  }

  public String getAcctHolder() {
    return this.acctHolder;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void deposit(double depositAmt) {
    double upBalance = Double.parseDouble(this.balance);
    double depositBalance = upBalance + depositAmt;
    String strBalance = String.valueOf(depositBalance);
    this.balance = strBalance;
    System.out.println("Balance after deposit: $" + strBalance);
  }

  public void withdrawal(double withdrawalAmt) {
    double currBalance = Double.parseDouble(this.balance);
    
    if (withdrawalAmt > currBalance) {
      System.out.println("insufficient funds");
    }
    else {
      double withdrawalBalance = currBalance - withdrawalAmt;
      String strBalance = String.valueOf(withdrawalBalance);
      this.balance = strBalance;
      System.out.println("Balance after withdrawal: $" + strBalance);
    }
  }
}
