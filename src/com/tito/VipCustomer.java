package com.tito;

public class VipCustomer {
  private String clientName;
  private double creditLimit;
  private String email;

  public String getClientName() {
    return this.clientName;
  }

  public double getCreditLimit() {
    return this.creditLimit;
  }

  public String getEmail() {
    return this.email;
  }

  public VipCustomer(String clientName, double creditLimit, String email) {
    this.clientName = clientName;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public VipCustomer() {
    this("default client name", 10000.00, "default@email.com");
  }

  public VipCustomer(String clientName, String email) {
    this(clientName, 20000.00, email);
  }
}
