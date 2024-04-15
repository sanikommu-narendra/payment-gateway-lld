package org.example.paymentMethods;

import org.example.dto.Amount;

public class BankTransfer implements PaymentMethod {
    @Override
    public boolean initiatePayment(Amount amount) {
        System.out.println("Transfer of " + amount.getCurrency() + " " + amount.getValue() + "via Bank transfer Successful");
        return true;
    }
}
