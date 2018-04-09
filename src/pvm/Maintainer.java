/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

/**
 *
 * @author ELECTRO
 */
public class Maintainer {
    private int ID;
    private static Maintainer admin;
    Menu menu = new Menu();
    Inventory inv = new Inventory();
    
    

    private Maintainer() {
    }
    
    
    
    
    
    public static Maintainer Get_Instance(){
        if (admin == null) {
            admin = new Maintainer();
        }
        return admin;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
    
    public void RunToolCheak(){
        
    }
    
    public Menu additem(Menu m , Pizza p){
        
        m.AddPizza(p);
        return m;
    }
    
    public Menu Deleteiteam(Menu m, Pizza p){
        
        m.DeletePizza(p);
        return m;
        
    }
    
    public Menu UpdateMennu(Menu m,Pizza p , int i){
        
        m.UpdatePizza(p, i);
        
        return m ;
    }
        public double CollectMoney(Inventory i){
            double X = i.getCash();
            i.setCash(0);
                    
            return X;
        }
}
