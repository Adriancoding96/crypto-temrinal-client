package com.adrian.bank.model;

import java.util.List;

public abstract class Account {
 
  private Long id;
  
  private List<Transaction> transactions;

  public Account() {

  }

  public Account(Long id, List<Transaction> transactions) {
    this.id = id;
    this.transactions = transactions;
  }

  public Long getId() {
    return id;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }
}
