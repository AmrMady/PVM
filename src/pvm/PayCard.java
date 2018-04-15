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
public class PayCard {
    double amountGiven;
    int CardNum;

    public double getAmountGiven() {
        return amountGiven;
    }

    public void setAmountGiven(double amountGiven) {
        this.amountGiven = amountGiven;
    }

    public int getCardNum() {
        return CardNum;
    }


    public void setCardNum(int CardNum) {
        this.CardNum = CardNum;
    }
    void Payment(int CN, double aG){
        PayCard p = new PayCard();
        p.setCardNum(CN);
        p.setAmountGiven(aG);
        
        System.out.println("Cash "+p.getAmountGiven()+ " add from "+p.getCardNum());
    }
}
