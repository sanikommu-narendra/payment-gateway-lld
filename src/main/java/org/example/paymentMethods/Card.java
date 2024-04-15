package org.example.paymentMethods;

import org.example.dto.Amount;

public class Card implements PaymentMethod {
    @Override
    public boolean initiatePayment(Amount amount) {
        System.out.println("Transfer of " + amount.getCurrency() + " " + amount.getValue() + "via card Successful");
        return true;
    }
}
