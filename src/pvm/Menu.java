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
    
    public Menu(ArrayList<Pizza> PizzaList) {
        this.PizzaList = PizzaList;
    }

    public ArrayList<Pizza> getPizzaList() {
        return PizzaList;
    }
    public void AddPizza(Pizza pizza) {
        PizzaList.add(pizza);
    }
    public void DeletePizza(Pizza pizza) {
        PizzaList.remove(pizza);
    }
    public void UpdatePizza(Pizza pizza, int index) {
        PizzaList.set(index, pizza);
    }
}
