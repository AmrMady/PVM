/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import events.*;
import handlers.*;
import java.util.ArrayList;

/**
 *
 * @author amrsa
 */
public class PVM {

    private Inventory inventory;
    private Maintainer maintainer;
    private Order order;
    private OrderController ordercontroller;
    private Pay pay;
    private Topping topping;
    private Boolean MenuOn = false;
    private Boolean ReceiptAndPaymentOptionsOn = false;
    private Pizza pizza;
    private ArrayList<Pizza> PizzaList;

    private EPServiceProvider engine;

    public PVM(Pizza pizza, ArrayList<Pizza> PizzaList, EPServiceProvider engine){
        this.pizza = pizza;
        this.PizzaList = PizzaList;
        this.engine = engine;
    }
    


    public PVM(Inventory inventory, Maintainer maintainer, Order order, OrderController ordercontroller, Pay pay, Pizza pizza, Topping topping, EPServiceProvider engine, ArrayList<Pizza> PizzaList) {

        this.inventory = inventory;
        this.maintainer = maintainer;
        this.order = order;
        this.ordercontroller = ordercontroller;
        this.pay = pay;
        this.pizza = pizza;
        this.topping = topping;
        this.engine = engine;
    }

    public void ActivateMaintainanceMode() {

    }

    public void ActivatePVM() {

    }

    public void Baking(int count) {
        for (int i = 0; i < count; i++) {

        }

    }

    public void CAR_Done() {

    }

    public void CleanAndRefill() {

    }

    public void ClosePVM() {

    }

    public void CustomerComplains() {

    }

    public void DiagnosticsRunning() {

    }

    public void Idle() {
        MenuOn = true;
        System.out.println("Menu is On");

    }

    public void MaintainanceModeOn() {

    }

    public void OpenPVM() {
        

    }

    public void OvenOn() {

    }

    public void PVMClosed() {

    }

    public void PVMMalfunctionAlert() {

    }

    public void PVMOpenned() {

    }

    public void PVMRepair() {

    }

    public void PayByCardSelected(double amountGiven, int CardNum) {
        /*payCard.setAmountGiven(amountGiven);
        payCard.setCardNum(CardNum);
        payCard.Payment(CardNum, amountGiven);
        engine.getEPRuntime().sendEvent(new PayByCardSelected(payCard));*/
        PutToppings();
        pay = new PayAdapter();
        pay.Payment(amountGiven,inventory);
    }

    public void PayByCashSelected(double amountGiven) {
        /* payCash.setAmountGiven(amountGiven);
        payCash.setChange(Change);
        payCash.Payment(amountGiven);
        engine.getEPRuntime().sendEvent(new PayByCashSelected(payCash));*/
        pay = new PayCash();
        pay.Payment(amountGiven,inventory);
        
        PutToppings();
    }

    public void PaymentReceived() {

    }

    public void PizzaDelivered() {

    }

    public void PizzaDone() {

    }

    public void PutToppings() {
        ArrayList<Pizza> PList = order.getPizzaList();
        int count = PList.size();
        inventory.moveFromInventory(PList);
        Baking(count);
    }

    public void RepairPVM() {

    }

    public void RepairSuccessCheck() {

    }

    public void RepairSuccessful() {

    }

    public void RepairUnsuccessful() {

    }

    public void RequestDiagnosis() {

    }

    public void SettingsUpdated() {

    }

    public void ShowRecieptAndPaymentOptions() {

    }

    public void UpdateSettings() {

    }

    public void PayClicked() {
        order.setPizzaList(PizzaList);
        engine.getEPRuntime().sendEvent(new payClicked(PizzaList));
        ShowRecieptAndPaymentOptions();
        MenuOn = false;
        ReceiptAndPaymentOptionsOn = true;
    }

    public void PickPizza(Pizza pizza) {
        System.out.println("Picked pizza: " + pizza);
        PizzaList.add(pizza);
        System.out.println(PizzaList.size());
    }

    public void SetToIdle() {

    }

}
