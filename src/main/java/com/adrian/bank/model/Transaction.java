package com.adrian.bank.model;

import java.time.LocalDateTime;

public class Transaction {

  private Long id;
  
  private String cryptoType;

  private Double ammount;

  private LocalDateTime time;

  public Transaction() {

  }
  
  public Transaction(Long id, String cryptoType, Double ammount, LocalDateTime time) {
    this.id = id;
    this.cryptoType = cryptoType;
    this.ammount = ammount;
    this.time = time;
  }

  public Long getId() {
    return id;
  }

  public String getCryptoType() {
    return cryptoType;
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

  public void setCryptoType(String cryptoType) {
    this.cryptoType = cryptoType;
  }

  public void setAmmount(Double ammount) {
    this.ammount = ammount;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

}
