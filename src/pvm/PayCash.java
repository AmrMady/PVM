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
public class PayCash implements Pay{
    double amountGiven;
    double Change;

    public double getAmountGiven() {
        return amountGiven;
    }

    public void setAmountGiven(double amountGiven) {
        this.amountGiven = amountGiven;
    }

    public double getChange() {
        return Change;
    }

    public void setChange(double Change) {
        this.Change = Change;
    }
    
    @Override
    public void Payment (double aG,Inventory i){
        
        System.out.println("Cash added");
        
        i.addcash(aG);
    }
    double GiveChange(){
        return Change;
    }
}
