package org.example.services;

import org.example.dto.Transaction;
import org.example.strategies.Strategy;

public class RuleService {
    private Strategy strategy;

    public RuleService(Strategy strategy) {
        this.strategy = strategy;
    }

    public RuleService() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public boolean validate(Transaction transaction) {
        return strategy.validate(transaction);
    }
    public boolean isFraud(Transaction transaction) {
        return false;
    }
}
