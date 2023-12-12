package org.example._2023_12_12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
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

    private Citezenship citizenship;
}

enum Country {
    GERMANY,
    CANADA,
    ISRAEL
}


enum Currency {
    EURO,
    DOLLAR,
    SHEKEL
}

enum Citezenship {
    GERMANY,
    CANADA,
    ISRAEL
}
