package com.mobilebanking.model;

import java.time.LocalDate;

public class Transaction {
    public String id;
    public String type;
    public double amount;
    public LocalDate date;
    public boolean suspicious;

    public Transaction(String id, String type, double amount, LocalDate date, boolean suspicious) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.suspicious = suspicious;
    }
}
