package com.adrian.bank.model;

import java.util.List;

public abstract class Account {
 
  private Long id;
  
  private List<Transaction> transactions;

  private List<Wallet> wallets;

  private Double interestRate;

  public Account() {

  }

  public Account(Long id, List<Transaction> transactions, List<Wallet> wallets, Double interestRate) {
    this.id = id;
    this.transactions = transactions;
    this.wallets = wallets;
    this.interestRate = interestRate;
  }

  public Long getId() {
    return id;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public List<Wallet> getWallets() {
      return wallets;
  }

  public Double getInterestRate() {
      return interestRate;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public void setWallets(List<Wallet> wallets) {
      this.wallets = wallets;
  }

  public void setInterestRate(Double interestRate) {
      this.interestRate = interestRate;
  }
}
