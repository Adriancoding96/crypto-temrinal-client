package com.adrian.bank.model;

import java.time.LocalDateTime;

public class Transaction {

  private Long id;
  
  private Currency currency;

  private Double ammount;

  private LocalDateTime time;

  public Transaction() {

  }
  
  public Transaction(Long id, Currency currency, Double ammount, LocalDateTime time) {
    this.id = id;
    this.currency = currency;
    this.ammount = ammount;
    this.time = time;
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

  public LocalDateTime getTime() {
    return time;
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

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

}
