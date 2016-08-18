package com.gcard.card;

import java.util.UUID;


public class UserCard implements Payable {
    private UUID id;
    int balance;

    @Override
    public void doPayment(int amount) {
        balance -= amount;
        System.out.println("Paid amount " + amount);
        System.out.println("New balance " + balance);
    }
}
