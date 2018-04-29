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
    int paste = 100;
    ArrayList<Topping> toppings = new ArrayList();

    public Inventory() {
        Topping t1 = new Topping("tomato", 100);
        Topping t2 = new Topping("pepper", 100);
        Topping t3 = new Topping("Parmesan cheese", 100);
        Topping t4 = new Topping("mozzarella cheese", 100);
        Topping t5 = new Topping("pepperoni", 100);
        Topping t6 = new Topping("ranch dressing", 100);
        Topping t7 = new Topping("onion", 100);
        Topping t8 = new Topping("mozzarella cheese", 100);
        Topping t9 = new Topping("cheddar cheese", 100);
        Topping t10 = new Topping("chicken", 100);
        Topping t11 = new Topping("tomato sauce", 100);
        Topping t12 = new Topping("Parmesan cheese", 100);
        Topping t13 = new Topping("Smoked Chicken", 100);
        Topping t14 = new Topping("smoked bacon", 100);
        Topping t15 = new Topping("shrimp", 100);
        Topping t16 = new Topping("crabmeat", 100);

        intializeToppings(t1);
        intializeToppings(t2);
        intializeToppings(t3);
        intializeToppings(t4);
        intializeToppings(t5);
        intializeToppings(t6);
        intializeToppings(t7);
        intializeToppings(t8);
        intializeToppings(t9);
        intializeToppings(t10);
        intializeToppings(t11);
        intializeToppings(t12);
        intializeToppings(t13);
        intializeToppings(t14);
        intializeToppings(t15);
        intializeToppings(t16);
    }

    void intializeToppings(Topping toppingL) {
        //void intializeToppings(ArrayList<Topping> toppingL) {
        /*  for (int i = 0; i < toppingL.size(); i++) {
            toppings.addAll(i, toppingL);
        }*/
        toppings.add(toppingL);
    }

    void addcash(float aG) {
        cash += aG;
    }

    void refill() {
        this.setPaste(100);

        for (int i = 0; i < toppings.size(); i++) {
            toppings.get(i).setCap(100);
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
                        System.out.println(k + " tooping " + this.toppings.get(k).getCap());
                    }
                }

            }
        }
    }

}
