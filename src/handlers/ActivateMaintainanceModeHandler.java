/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

import events.ActivateMaintainanceMode;
import pvm.PVM;

/**
 *
 * @author amrsa
 */
public class ActivateMaintainanceModeHandler {

     private PVM pvm;

    public ActivateMaintainanceModeHandler(PVM pvm) {
        this.pvm = pvm;
    }

    public void update(ActivateMaintainanceMode event) {
      //  pvm.requestFloor(floor);
    }
    
}
