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
    double cash = 0.0;
    int paste  = 0;
    ArrayList<Topping> toppings = new ArrayList() ;
    
    

    
    void intializeToppings(Topping p){
            toppings.add(p);
     }
    
    void refill(){
        this.setPaste(50);
    
        for (int i = 0; i < toppings.size(); i++) {
            toppings.get(i).setCap(50);
        }
    }

    public Inventory() {
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
    
    public void moveFromInventory(ArrayList<Pizza> PL){
        for (int i = 0; i < PL.size(); i++) {
            paste -=1;
            System.out.println(this.getPaste());
            for (int j = 0; j < toppings.size(); j++) {
                if (PL.get(i).ToppingList.get(i).getName() == toppings.get(j).getName()) {
                    toppings.get(j).setCap( toppings.get(j).getCap() - PL.get(i).ToppingList.get(i).getCap());
                    toppings.get(j).getCap();
                    System.out.println(this.toppings.get(j).getCap());
                }
 
            }
        }
    }
    
}
