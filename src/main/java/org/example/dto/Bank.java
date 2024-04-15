package org.example.dto;

import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;
@ToString
public class Bank {
    private static final AtomicInteger x = new AtomicInteger(0);
    private final String name;
    private final String IfscCode;
    private final String address;
    private final int id;

    public Bank(String name, String ifscCode, String address) {
        this.name = name;
        IfscCode = ifscCode;
        this.address = address;
        this.id = x.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public String getIfscCode() {
        return IfscCode;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}
