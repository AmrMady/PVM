/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import esper.config.Config;
import events.pickPizza;
import java.util.ArrayList;

/**
 *
 * @author amrsa
 */
public class Demo {
   
      public static void main(String[] args) {
    Maintainer main = Maintainer.Get_Instance() ;
    main.setID(1234);
          Topping topping1 = new Topping("tomato", 10);
          Topping topping2 = new Topping("pepper", 5);
    Pizza pizza1 = new Pizza(9,"pepperoni");
    Pizza pizza2 = new Pizza(8, "seafood");
    Pizza pizza3 = new Pizza(5, "ff");
           pizza1.addTopping(topping2);
           pizza2.addTopping(topping1);
           pizza2.addTopping(topping2);
           
           Menu menu = new Menu();
           menu = main.additem(menu, pizza2);
           menu = main.additem(menu, pizza1);
           menu = main.Deleteiteam(menu, pizza2);
           menu = main.UpdateMennu(menu, pizza3, 0);
           menu.displayPizza();
           
           
           
           Inventory inv = new Inventory();
           
           
           
            
           
            ArrayList<Pizza> pizzaslist = new ArrayList() ; 
            pizzaslist.add(pizza2);
            pizzaslist.add(pizza1);
           
           //inv.moveFromInventory(pizzaslist);
           Pay p = new PayCash();
           p.Payment(12, inv);
           System.out.println("cash "+ inv.getCash());
           
           p = new PayAdapter();
           p.Payment(20, inv);
           
           Order o = new Order();
           o.setOrderNum(11);
           o.setOrderType("salame");
           o.AddPizza(pizza1);
           o.AddPizza(pizza2);
           inv.moveFromInventory(o.ListOfPizza());
           
}
}
