package com.adrian.bank.model;

public class Currency {

  private Long id;

  private String currencyName;

  private Double currencyDollarConversion;

  public Currency() {

  }

  public Currency(Long id, String currencyName, Double currencyDollarConversion) {
    this.id = id;
    this.currencyName = currencyName;
    this.currencyDollarConversion = currencyDollarConversion;
  }

  public Long getId() {
    return id;
  }

  public String getCurrencyName() {
    return currencyName;
  }

  public Double getCurrencyDollarConversion() {
    return currencyDollarConversion;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public void setCurrencyDollarConversion(Double currencyDollarConversion) {
    this.currencyDollarConversion = currencyDollarConversion;
  }
}
