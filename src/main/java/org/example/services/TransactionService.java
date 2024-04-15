package org.example.services;

import org.example.dto.Account;
import org.example.dto.Amount;
import org.example.dto.Transaction;
import org.example.exceptions.InvalidStateTransitionException;
import org.example.paymentMethods.PaymentMethod;
import org.example.states.FailureTransition;
import org.example.states.InProgressTransition;
import org.example.states.SuccessTransition;

public class TransactionService {
    public boolean startTransaction(Account sender, Account receiver, Amount amount, PaymentMethod paymentMethod) throws InvalidStateTransitionException {
        Transaction transaction = new Transaction(new InProgressTransition(), sender, receiver, amount, paymentMethod);
        System.out.println("Transaction started " + transaction);
        boolean isTransitionComplete = transaction.initiatePayment();
        if (isTransitionComplete) {
            transaction.setState(new SuccessTransition());
            System.out.println("Transaction success" + transaction);
            return true;
        } else {
            transaction.setState(new FailureTransition());
            System.out.println("Transaction failure" + transaction);
            return false;
        }
    }
}
