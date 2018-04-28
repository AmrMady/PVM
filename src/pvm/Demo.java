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
                Maintainer main = Maintainer.Get_Instance();
        EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();
        
        

        main.setID(1234);
        ArrayList<Topping> ToppingsL = new ArrayList<>();
        Topping topping1 = new Topping("tomato", 5);
        Topping topping2 = new Topping("pepper", 5);
        Pizza pizza1 = new Pizza(9, "pepperoni");
        Pizza pizza2 = new Pizza(8, "seafood");
        Pizza pizza3 = new Pizza(5, "ff");
        pizza1.addTopping(topping2);
        pizza2.addTopping(topping1);
        pizza2.addTopping(topping2);
        ArrayList<Pizza> pizzaslist = new ArrayList();

        PVM p =  new PVM(pizza2, pizzaslist, engine);
        Config con = new Config(p);
        con.init();
//        Menu menu = new Menu();
//        main.additem(menu, pizza2);
//        main.additem(menu, pizza1);
//        main.Deleteiteam(menu, pizza2);
//        main.UpdateMennu(menu, pizza3, 0);
//        menu.displayPizza();
//
//        Topping t1 = new Topping("tomato", 50);
//        Topping t2 = new Topping("pepper", 45);
//
//        Inventory inv = new Inventory();
//        inv.setCash(500);
//        //inv.setPaste(50);
//        ToppingsL.add(t1);
//        ToppingsL.add(t2);
//        //inv.intializeToppings(ToppingsL);
//        // inv.intializeToppings(t1);
//        //inv.intializeToppings(t2);
//
//        pizzaslist.add(pizza2);
//
//        inv.moveFromInventory(pizzaslist);
        
        engine.getEPRuntime().sendEvent(new pickPizza(pizza2));
//        p.PickPizza(pizza2);

    }
}
