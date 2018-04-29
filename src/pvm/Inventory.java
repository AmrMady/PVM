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

    double cash = 0;
    int paste = 0;
    ArrayList<Topping> toppings = new ArrayList();

    public Inventory() {

    }

    void intializeToppings(Topping p) {
        toppings.add(p);
    }

    void refill() {
        this.setPaste(50);

        for (int i = 0; i < toppings.size(); i++) {
            toppings.get(i).setCap(50);
        }
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

    public void addcash(double cash) {

        double x = this.getCash();
        x += cash;
        this.setCash(x);
        System.out.println("updated to: " + this.getCash());
    }

    public void moveFromInventory(ArrayList<Pizza> PL) {
        for (int i = 0; i < PL.size(); i++) {
            paste -= 1;
            System.out.println("Paste" + this.getPaste());
            for (int j = 0; j < PL.get(i).ToppingList.size(); j++) {
                for (int k = 0; k < toppings.size(); k++) {

                    if (PL.get(i).ToppingList.get(j).getName().equals(toppings.get(k).getName())) {
                        toppings.get(k).setCap(toppings.get(k).getCap() - PL.get(i).ToppingList.get(j).getCap());
                        toppings.get(k).getCap();
                        System.out.println(j + " tooping " + this.toppings.get(j).getCap());
                    }
                }

            }
        }
    }

}
