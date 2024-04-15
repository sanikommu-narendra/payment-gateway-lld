package org.example.dto;

import lombok.ToString;
import org.example.exceptions.InvalidStateTransitionException;
import org.example.paymentMethods.PaymentMethod;
import org.example.states.FailureTransition;
import org.example.states.InProgressTransition;
import org.example.states.SuccessTransition;

import java.util.concurrent.atomic.AtomicInteger;
@ToString
public class User {
    private static final AtomicInteger x = new AtomicInteger(0);
    private final String name;
    private final int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public User(String name) {
        this.name = name;
        this.id = x.incrementAndGet();
    }
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
