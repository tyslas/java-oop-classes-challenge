package com.tito;

public class VipClient {
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

  public VipClient(String clientName, double creditLimit, String email) {
    this.clientName = clientName;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public VipClient() {
    this("default client name", 10000.00, "default@email.com");
  }

  public VipClient(String clientName, String email) {
    this(clientName, 20000.00, email);
  }
}
