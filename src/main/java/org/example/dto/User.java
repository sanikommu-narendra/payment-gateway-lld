package org.example.dto;

import lombok.ToString;

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
}
