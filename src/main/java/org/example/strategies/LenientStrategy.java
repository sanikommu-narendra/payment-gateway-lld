package org.example.strategies;

import org.example.dto.Transaction;

public class LenientStrategy implements Strategy {
    @Override
    public boolean validate(Transaction transaction) {
        return transaction.getAmount().getValue() <= 10000;
    }
}
