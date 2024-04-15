package org.example.dto;

import lombok.ToString;
import org.example.exceptions.InvalidStateTransitionException;
import org.example.paymentMethods.PaymentMethod;
import org.example.states.State;

import java.util.concurrent.atomic.AtomicInteger;

@ToString
public class Transaction {
    private static final AtomicInteger x = new AtomicInteger(0);
    private State state;
    private final Account sender;
    private final Account receiver;
    private final Amount amount;
    private final int id;
    private PaymentMethod paymentMethod;

    public Transaction(State state, Account sender, Account receiver, Amount amount, PaymentMethod paymentMethod) {
        this.state = state;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.id = x.incrementAndGet();
    }

    public State getState() {
        return state;
    }

    public Account getSender() {
        return sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public Amount getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void setState(State newState) throws InvalidStateTransitionException {
        State oldState = this.state;
        if(oldState.isFeasible(newState)) {
            this.state = newState;
            this.state.notifyStakeHolders();
        } else {
            throw new InvalidStateTransitionException("Cant transition from old transition " + this.state.getStateEnum() + " to new transition" + newState.getStateEnum());
        }



    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean initiatePayment() {
        return paymentMethod.initiatePayment(amount);
    }
}
