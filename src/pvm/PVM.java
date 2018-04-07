/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import com.espertech.esper.client.EPServiceProvider;

/**
 *
 * @author amrsa
 */
public class PVM {
 private Inventory inventory;
 private Maintainer maintainer;
 private Order order;
 private OrderController ordercontroller;
 private PayCard payCard;
 private PayCash payCash;
 private Pizza pipzza;
 private Topping topping;
 private EPServiceProvider engine;

    public PVM(Inventory inventory, Maintainer maintainer, Order order, OrderController ordercontroller, PayCard payCard, PayCash payCash, Pizza pipzza, Topping topping, EPServiceProvider engine) {
        this.inventory = inventory;
        this.maintainer = maintainer;
        this.order = order;
        this.ordercontroller = ordercontroller;
        this.payCard = payCard;
        this.payCash = payCash;
        this.pipzza = pipzza;
        this.topping = topping;
        this.engine = engine;
    }


    public void ActivateMaintainanceMode(){
      
    }
    public void ActivatePVM(){
      
    }
    public void Baking(){
      
    }
    public void CAR_Done(){
      
    }
    public void CleanAndRefill(){
      
    }
    public void ClosePVM(){
      
    }
    public void CustomerComplains(){
      
    }
    public void DiagnosticsRunning(){
      
    }
    public void Idle(){
      
    }
    public void MaintainanceModeOn(){
      
    }
    public void OpenPVM(){
      
    }
    public void OvenOn(){
      
    }
    public void PVMClosed(){
      
    }
    public void PVMMalfunctionAlert(){
      
    }
    public void PVMOpenned(){
      
    }
    public void PVMRepair(){
      
    }
    public void PayByCardSelected(){
      
    }
    public void PayByCashSelected(){
      
    }
    public void PaymentReceived(){
      
    }
    public void PizzaDelivered(){
      
    }
    public void PizzaDone(){
      
    }
    public void PutToppings(){
      
    }
    public void RepairPVM(){
      
    }
    public void RepairSuccessCheck(){
      
    }
    public void RepairSuccessful(){
      
    }
    public void RepairUnsuccessful(){
      
    }
    public void RequestDiagnosis(){
      
    }
    public void SettingsUpdated(){
      
    }
    public void ShowRecieptAndPaymentOptions(){
      
    }
    public void UpdateSettings(){
      
    }
    public void PayClicked(){
      
    }
    public void PickPizza(){
      
    }
    public void SetToIdle(){
      
    }
    public static void main(String[] args) {
           
            
    }
    
}
