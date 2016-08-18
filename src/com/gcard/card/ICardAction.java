package com.gcard.card;

import com.gcard.terminal.Terminal;

import java.util.UUID;

public interface ICardAction {
    void topUp(int amount);
    void tap(Terminal terminal);
}
