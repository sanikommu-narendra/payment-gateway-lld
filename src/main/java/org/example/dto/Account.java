package org.example.dto;

import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;
@ToString
public class Account {
    private static final AtomicInteger x = new AtomicInteger(0);
    private final User user;
    private final Bank bank;
    private final int id;

    public Account(User user, Bank bank) {
        this.user = user;
        this.bank = bank;
        this.id = x.incrementAndGet();
    }

    public User getUser() {
        return user;
    }

    public Bank getBank() {
        return bank;
    }

    public int getId() {
        return id;
    }
}
