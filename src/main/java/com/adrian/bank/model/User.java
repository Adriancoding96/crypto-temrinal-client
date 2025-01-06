package com.adrian.bank.model;

public class User {

  private Long id;

  private String name;

  private String username;

  private String password;

  private Account account;

  public User() {
  }

  public User(Long id, String name, String username, String password, Account account) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.account = account;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Account getAccount() {
    return account;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
