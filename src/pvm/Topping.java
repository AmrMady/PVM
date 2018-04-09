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
public class Topping {
    
    
   private String name ;
   private int cap;

    public Topping(String name, int cap) {
        this.name = name;
        this.cap = cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
