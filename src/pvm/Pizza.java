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
public class Pizza {
    public float price;
    public String type;
    ArrayList<Topping> ToppingList = new ArrayList();


    public Pizza(float price, String type) {
        this.price = price;
        this.type = type;
    }
    
       public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    void addTopping(Topping p){
        
        ToppingList.add(p);
        
    }
}
