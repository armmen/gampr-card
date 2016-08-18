package com.gcard.system;

import javax.smartcardio.Card;
import java.util.Date;


public interface DispatcherInterface {
    public Card issueNewCard(Date date);
}
