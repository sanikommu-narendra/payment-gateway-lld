package org.example.paymentMethods;

import org.example.dto.Amount;

public interface PaymentMethod {
    boolean initiatePayment(Amount amount);
}
