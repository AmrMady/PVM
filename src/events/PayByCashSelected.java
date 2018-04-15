/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;


import pvm.PayCash;

/**
 *
 * @author amrsa
 */
public class PayByCashSelected {
    private final PayCash Cash;
    
    public PayByCashSelected(PayCash Cash) {

        this.Cash = Cash;
    }

    public PayCash getCash() {
        return Cash;
    }

    
    public static String getStatement() {
        String statement = "select Cash from PayByCashSelected";
        return statement;
    }
}