package com.adrian.bank.model;

import java.util.List;

public class Wallet {

  private Long id;
  
  private Currency currency;
  
  private Double ammount;

  private List<Transaction> walletTransactions;

  public Wallet() {

  }

  public Wallet(Long id, Currency currency, Double ammount, List<Transaction> walletTransactions) {
    this.id = id;
    this.currency = currency;
    this.ammount = ammount;
    this.walletTransactions = walletTransactions;
  }

  public Long getId() {
    return id;
  }

  public Currency getCurrency() {
    return currency;
  }

  public Double getAmmount() {
    return ammount;
  }

  public List<Transaction> getWalletTransactions() {
    return walletTransactions;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public void setAmmount(Double ammount) {
    this.ammount = ammount;
  }

  public void setWalletTransactions(List<Transaction> walletTransactions) {
    this.walletTransactions = walletTransactions;
  }
}
