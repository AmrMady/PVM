/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import java.util.Scanner;

/**
 *
 * @author ELECTRO
 */
public class PayAdapter implements Pay{
   protected PayCard c ;
    public PayAdapter(){
        c = new PayCard();
    }

    @Override
    public void Payment(double cash, Inventory i) {
        System.out.println("Enter card number :");
        Scanner sc = new Scanner(System.in);
        int CardId = sc.nextInt();
        c.Payment(CardId, cash);
        
        
    }
     
    
}
