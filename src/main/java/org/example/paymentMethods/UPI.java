package org.example.paymentMethods;

import org.example.dto.Amount;

public class UPI implements PaymentMethod {
    @Override
    public boolean initiatePayment(Amount amount) {
        System.out.println("Transfer of " + amount.getCurrency() + " " + amount.getValue() + "via UPI Successful");
        return true;
    }
}
