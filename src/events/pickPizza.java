/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;


import pvm.Pizza;

/**
 *
 * @author amrsa
 */
public class pickPizza {
    private final Pizza pizza;
    

    public pickPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    
    public static String getStatement() {
        String statement = "select pizza from pickPizza";
        return statement;
    }
}
