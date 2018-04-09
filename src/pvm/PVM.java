/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pvm;

import com.espertech.esper.client.EPServiceProvider;
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
    private PayCard payCard;
    private PayCash payCash;
    private Pizza pizza;
    private Topping topping;
    private EPServiceProvider engine;
    private Boolean MenuOn = false;
    private Boolean ReceiptAndPaymentOptionsOn = false;
    private ArrayList<Pizza> PizzaList;

    public PVM(Inventory inventory, Maintainer maintainer, Order order, OrderController ordercontroller, PayCard payCard, PayCash payCash, Pizza pipzza, Topping topping, EPServiceProvider engine, ArrayList<Pizza> PizzaList) {

        this.inventory = inventory;
        this.maintainer = maintainer;
        this.order = order;
        this.ordercontroller = ordercontroller;

        this.payCard = payCard;
        this.payCash = payCash;
        this.pizza = pizza;

        this.topping = topping;
        this.engine = engine;
        this.PizzaList = PizzaList;
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
    }

    public void PayByCashSelected(double amountGiven, double Change) {
       /* payCash.setAmountGiven(amountGiven);
        payCash.setChange(Change);
        payCash.Payment(amountGiven);
        engine.getEPRuntime().sendEvent(new PayByCashSelected(payCash));*/
       PutToppings();
    }

    public void PaymentReceived() {

    }

    public void PizzaDelivered() {

    }

    public void PizzaDone() {

    }

    public void PutToppings() {
      ArrayList<Pizza> PList =   order.getPizzaList();
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
        engine.getEPRuntime().sendEvent(new pickPizza(pizza));
    }


    public void SetToIdle() {

    }


}
