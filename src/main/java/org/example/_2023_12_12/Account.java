package org.example._2023_12_12.tE;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private Country country;
    private Currency currency;
    private boolean isDebit;
    private BigDecimal balance;
}

class Bank {
    Branch[] branches;
}

class Branch {
    Empl[] employees;
}

class Empl {
    private String name;
    private String surName;
    private Account[] account;

    private Citezeship citizenship;
}

enum Country {

}

enum Currency {

}

enum Citezeship {

}
