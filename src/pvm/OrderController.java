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
public class OrderController {
    int id;
    ArrayList<Order> orders = new ArrayList();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    void addOrder (Order o){
        orders.add(o);
        
    }
    void display(){
   
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Orders Number:"+ orders.get(i).getOrderNum());
        }
        
    }

   }
