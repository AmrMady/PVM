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
public class CAR_DoneHandler {
        PVM pVM;
    public CAR_DoneHandler(PVM pVM) {
          this.pVM = pVM; 
    }
       public void update(CAR_Done event) {
      //  pvm.requestFloor(floor);
    }
}
