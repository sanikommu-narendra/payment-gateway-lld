package org.example.dto;

import lombok.ToString;
import org.example.enums.Currency;
@ToString
public class Amount {
    private final int value;
    private final Currency currency;

    public Amount(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }
}
