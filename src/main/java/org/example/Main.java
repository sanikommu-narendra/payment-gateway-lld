package org.example;

import org.example.dto.Account;
import org.example.dto.Amount;
import org.example.dto.Bank;
import org.example.dto.User;
import org.example.enums.Currency;
import org.example.exceptions.InvalidStateTransitionException;
import org.example.paymentMethods.Card;
import org.example.services.TransactionService;

public class Main {
    public static void main(String[] args) throws InvalidStateTransitionException {
        User customer = new User("Nari");
        User seller = new User("Amazon");

        Bank customerBank = new Bank("ICICI", "0123456", "Hyderabad");
        Bank sellerBank = new Bank("HDFC", "9876543", "Delhi");

        Account customerAccount = new Account(customer, customerBank);
        Account sellerAccount = new Account(seller, sellerBank);

        TransactionService transactionService = new TransactionService();
        transactionService.startTransaction(customerAccount, sellerAccount,new Amount(100, Currency.INR), new Card());

    }
}
