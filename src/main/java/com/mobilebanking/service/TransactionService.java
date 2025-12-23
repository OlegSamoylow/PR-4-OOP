package com.mobilebanking.service;

import com.mobilebanking.model.Transaction;
import java.time.LocalDate;
import java.util.List;

public class TransactionService {
    public List<Transaction> getAllTransactions() {
        return List.of(
            new Transaction("TX-1", "Оплата", 1200, LocalDate.now(), false),
            new Transaction("TX-2", "Переказ", 8500, LocalDate.now(), true)
        );
    }
}
