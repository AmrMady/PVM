/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

/**
 *
 * @author amrsa
 */
public class OrderController {
    int id;
    Order order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    public Order  GiveOrder(){
        System.out.println("pvm.OrderController.GiveOrder()");
        return order;
    }
}
