package com.adrian.bank.model;

import java.util.List;

public abstract class Account {
 
  private Long id;
  
  private List<Transaction> transactions;

  private List<Wallet> wallets;

  public Account() {

  }

  public Account(Long id, List<Transaction> transactions, List<Wallet> wallets) {
    this.id = id;
    this.transactions = transactions;
    this.wallets = wallets;
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

  public void setId(Long id) {
    this.id = id;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public void setWallets(List<Wallet> wallets) {
      this.wallets = wallets;
  }
}
