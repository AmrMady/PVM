/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import pvm.PayCard;

/**
 *
 * @author amrsa
 */
public class PayByCardSelected {
    
       private final PayCard Card;
    
    public PayByCardSelected(PayCard Card) {

        this.Card = Card;
    }

    public PayCard getCard() {
        return Card;
    }
    public static String getStatement() {
        String statement = "select Card from PayByCardSelected";
        return statement;
    }
}
