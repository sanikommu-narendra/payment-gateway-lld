package org.example.strategies;

import org.example.dto.Transaction;

public interface Strategy {
    boolean validate(Transaction transaction);
}
