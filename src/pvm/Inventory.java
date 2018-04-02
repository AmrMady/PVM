/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import java.util.ArrayList;

/**
 *
 * @author amrsa
 */
public class Inventory {
    double cash;
    int paste;
    ArrayList<Topping> toppings;
    int[] toppingsCap = new int [toppings.size()];
    

    
    void intializeToppings(){
        for (int i = 0; i < toppings.size(); i++) {
            toppingsCap[i] = 50;
        }
    }
    void refill(){
        
    }
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getPaste() {
        return paste;
    }

    public void setPaste(int paste) {
        this.paste = paste;
    }
    
    
}
