/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import java.util.ArrayList;
import pvm.Pizza;

/**
 *
 * @author amrsa
 */
public class payClicked {
     private final ArrayList<Pizza> PizzaList;

    public payClicked(ArrayList<Pizza> PizzaList) {
        this.PizzaList = PizzaList;
    }

    public ArrayList<Pizza> getpayClicked() {
        return PizzaList;
    }
    public static String getStatement() {
        String statement = "select PizzaList from payClicked";
        return statement;
    }
}
