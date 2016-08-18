package com.gcard.system;

import com.gcard.card.UserCard;
import com.gcard.terminal.Terminal;
import com.gcard.user.User;

import java.util.List;
import java.util.UUID;

public abstract class CardManagementSystem implements DispatcherInterface {
    private List<UserCard> cards;
    private List<User> registeredUsers;
    private List<Terminal> terminals;


    public static void processTransaction(UUID cardId, UUID terminalId, int amount) {
        //TODO store each transaction in transactions.txt
    }

    boolean isStolen(UUID cardId){
        // TODO implement
        return false;
    }

    public static void printTransactions() {
        System.out.println("Print all transactions from file");
        // TODO load payment transactions and print to console
    }
}
