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
    ArrayList<Pizza> PizzaList;
    
    public Menu(ArrayList<Pizza> PizzaList) {
        this.PizzaList = PizzaList;
    }

    public ArrayList<Pizza> getPizzaList() {
        return PizzaList;
    }

    public void setPizzaList(ArrayList<Pizza> PizzaList) {
        this.PizzaList = PizzaList;
    }
    public void AddPizza(Pizza pizza) {
        this.PizzaList = PizzaList;
    }
    public void DeletePizza(Pizza pizza) {
        this.PizzaList = PizzaList;
    }
    public void UpdatePizza(Pizza pizza) {
        this.PizzaList = PizzaList;
    }
}
