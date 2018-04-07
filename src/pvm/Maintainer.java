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

    public Maintainer() {
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
    
    public void UpdateMennu(){
        
        
    }
        public double CollectMoney(){
            double c =0;
                    
            return c;
        }
}
