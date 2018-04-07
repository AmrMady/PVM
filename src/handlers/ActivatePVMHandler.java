/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import events.*;
import pvm.PVM;

/**
 *
 * @author amrsa
 */
public class ActivatePVMHandler {
    
 private PVM pvm;
    public ActivatePVMHandler(PVM pVM) {
        this.pvm = pvm;
    }
     

 

    public void update(ActivatePVM event) {
      //  pvm.requestFloor(floor);
    }
}