package com.bankmgmt.app.entity;

public class Account {
    private Integer id;
    private String accountHolderName;
    private String accountType;
    private Double balance;
    private String email;

    // Constructors, getters, and setters

    public Account(Integer id, String accountHolderName, String accountType, Double balance, String email) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.email = email;
    }

    // TODO: Add getters and setters


}
