/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import com.espertech.esper.client.EPServiceProvider;

/**
 *
 * @author amrsa
 */
public class PVM {
 private Inventory inventory;
 private Maintainer maintainer;
 private Order order;
 private OrderController ordercontroller;
 private PayCard payCard;
 private PayCash payCash;
 private Pizza pipzza;
 private Topping topping;
 private EPServiceProvider engine;

    public PVM(Inventory inventory, Maintainer maintainer, Order order, OrderController ordercontroller, PayCard payCard, PayCash payCash, Pizza pipzza, Topping topping, EPServiceProvider engine) {
        this.inventory = inventory;
        this.maintainer = maintainer;
        this.order = order;
        this.ordercontroller = ordercontroller;
        this.payCard = payCard;
        this.payCash = payCash;
        this.pipzza = pipzza;
        this.topping = topping;
        this.engine = engine;
    }

    public void Menu(){
      
    }
    public static void main(String[] args) {
           
            
    }
    
}
