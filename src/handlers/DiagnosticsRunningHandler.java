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
public class DiagnosticsRunningHandler {
    PVM pVM;
    public DiagnosticsRunningHandler(PVM pVM) {
        this.pVM = pVM; 
    }
       public void update(DiagnosticsRunning event) {
      //  pvm.requestFloor(floor);
    }
}
