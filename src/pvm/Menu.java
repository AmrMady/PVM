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
public class Menu {
    ArrayList<Pizza> PizzaList = new ArrayList();
    
    
    public void AddPizza(Pizza pizza) {
        PizzaList.add(pizza);
    }
    public void DeletePizza(Pizza pizza) {
        PizzaList.remove(pizza);
    }
    public void UpdatePizza(Pizza pizza, int index) {
        PizzaList.set(index, pizza);
    }
    
    public void displayPizza(){
        for (int i = 0; i < PizzaList.size(); i++) {
            System.out.println(PizzaList.get(i).getType());
        }
    }
}
