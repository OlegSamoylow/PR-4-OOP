package com.mobilebanking.controller;

import com.google.inject.Inject;
import com.mobilebanking.service.TransactionService;

public class TransactionController {
    private final TransactionService service;

    @Inject
    public TransactionController(TransactionService service) {
        this.service = service;
    }

    public Object getAllTransactions() {
        return service.getAllTransactions();
    }
}
