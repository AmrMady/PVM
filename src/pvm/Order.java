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
public class Order {
    int OrderNum;
    String OrderType;
    ArrayList<Pizza> PizzaList;

    public int getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }
    void cancelOrder(){
        
    }
}