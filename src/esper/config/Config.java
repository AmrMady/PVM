package esper.config;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import pvm.PVM;
import events.ActivateMaintainanceMode;
import events.ActivatePVM;
import events.Baking;
import events.CAR_Done;
import events.CleanAndRefill;
import events.ClosePVM;
import events.CustomerComplains;
import events.DiagnosticsRunning;
import events.MaintainanceModeOn;
import events.OpenPVM;
import events.OvenOn;
import events.PVMCLosed;
import events.PVMMalfuntionAlert;
import events.PVMOpenned;
import events.PVMRepair;
import events.PayByCardSelected;
import events.PayByCashSelected;
import events.PaymentRecevied;
import events.PizzaDelivered;
import events.PizzaDone;
import events.RepairPVM;
import events.RepairSuccessCheck;
import events.RepairSuccessful;
import events.RepairUnsuccessful;
import events.RequestDiagnosis;
import events.SettingsUpdated;
import events.ShowRecieptAndPaymentOptions;
import events.UpdateSettings;
import events.payClicked;
import events.pickPizza;
import events.setToIdle;
import handlers.*;

public class Config {

    private EPServiceProvider engine;
    private PVM PVM;

    public Config(PVM PVM) {
        this.PVM = PVM;
    }

    public void init() {
        System.err.println("\n\n************************");
        engine = EPServiceProviderManager.getDefaultProvider();
        registerEvents();
        createEPLs();
        System.err.println("************************\n\n");
    }

    private void registerEvents() {
        System.out.println("Registering Events...");
        
        engine.getEPAdministrator().getConfiguration().addEventType(ActivateMaintainanceMode.class);
        engine.getEPAdministrator().getConfiguration().addEventType(ActivatePVM.class);
        engine.getEPAdministrator().getConfiguration().addEventType(Baking.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CAR_Done.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CleanAndRefill.class);
        engine.getEPAdministrator().getConfiguration().addEventType(ClosePVM.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CustomerComplains.class);
        engine.getEPAdministrator().getConfiguration().addEventType(DiagnosticsRunning.class);
        engine.getEPAdministrator().getConfiguration().addEventType(MaintainanceModeOn.class);
        engine.getEPAdministrator().getConfiguration().addEventType(OpenPVM.class);
        engine.getEPAdministrator().getConfiguration().addEventType(OvenOn.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PVMCLosed.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PVMMalfuntionAlert.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PVMOpenned.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PVMRepair.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PayByCardSelected.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PayByCashSelected.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PaymentRecevied.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PizzaDelivered.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PizzaDone.class);
        engine.getEPAdministrator().getConfiguration().addEventType(RepairPVM.class);
        engine.getEPAdministrator().getConfiguration().addEventType(RepairSuccessCheck.class);
        engine.getEPAdministrator().getConfiguration().addEventType(RepairSuccessful.class);
        engine.getEPAdministrator().getConfiguration().addEventType(RepairUnsuccessful.class);
        engine.getEPAdministrator().getConfiguration().addEventType(RequestDiagnosis.class);
        engine.getEPAdministrator().getConfiguration().addEventType(SettingsUpdated.class);
        engine.getEPAdministrator().getConfiguration().addEventType(ShowRecieptAndPaymentOptions.class);
        engine.getEPAdministrator().getConfiguration().addEventType(UpdateSettings.class);
        engine.getEPAdministrator().getConfiguration().addEventType(payClicked.class);
        engine.getEPAdministrator().getConfiguration().addEventType(pickPizza.class);
         engine.getEPAdministrator().getConfiguration().addEventType(setToIdle.class);
         
        System.out.println("Registering Events [DONE]");
    }

    private void createEPLs() {
        System.out.println("Creating EPLs...");
        createEPL_ActivateMaintainanceMode();
        createEPL_ActivatePVM();
        createEPL_Baking();
        createEPL_CAR_Done();
        createEPL_CleanAndRefill();
         createEPL_ClosePVM();
        createEPL_CustomerComplains();
        createEPL_DiagnosticsRunning();
        createEPL_MaintainanceModeOn();
        createEPL_OpenPVM();
        createEPL_OvenOn();
         createEPL_PVMCLosed();
        createEPL_PVMMalfuntionAlert();
        createEPL_PVMOpenned();
        createEPL_PVMRepair();
        createEPL_PayByCardSelected();
         createEPL_PayByCashSelected();
        createEPL_PaymentRecevied();
        createEPL_PizzaDelivered();
        createEPL_PizzaDone();
        createEPL_RepairPVM();
         createEPL_RepairSuccessCheck();
        createEPL_RepairSuccessful();
        createEPL_RepairUnsuccessful();
        createEPL_RequestDiagnosis();
        createEPL_SettingsUpdated();
         createEPL_ShowRecieptAndPaymentOptions();
        createEPL_UpdateSettings();
        createEPL_payClicked();
        createEPL_pickPizza();
        createEPL_setToIdle();
        System.out.println("Creating EPLs [DONE]");
    }

    private void createEPL_DoorClosedEvent() {
       // EPStatement statement = engine.getEPAdministrator().createEPL(DoorClosedEvent.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_ActivateMaintainanceMode() {
         EPStatement statement = engine.getEPAdministrator().createEPL(ActivateMaintainanceMode.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_ActivatePVM() {
        EPStatement statement = engine.getEPAdministrator().createEPL(ActivatePVM.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_Baking() {
       EPStatement statement = engine.getEPAdministrator().createEPL(Baking.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_CAR_Done() {
         EPStatement statement = engine.getEPAdministrator().createEPL(CAR_Done.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_CleanAndRefill() {
        EPStatement statement = engine.getEPAdministrator().createEPL(CleanAndRefill.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_ClosePVM() {
        EPStatement statement = engine.getEPAdministrator().createEPL(ClosePVM.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_CustomerComplains() {
        EPStatement statement = engine.getEPAdministrator().createEPL(CustomerComplains.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_DiagnosticsRunning() {
         EPStatement statement = engine.getEPAdministrator().createEPL(DiagnosticsRunning.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_MaintainanceModeOn() {
         EPStatement statement = engine.getEPAdministrator().createEPL(MaintainanceModeOn.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_OpenPVM() {
         EPStatement statement = engine.getEPAdministrator().createEPL(OpenPVM.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_OvenOn() {
         EPStatement statement = engine.getEPAdministrator().createEPL(OvenOn.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PVMCLosed() {
        EPStatement statement = engine.getEPAdministrator().createEPL(PVMCLosed.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PVMMalfuntionAlert() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PVMMalfuntionAlert.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PVMOpenned() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PVMOpenned.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PVMRepair() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PVMRepair.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PayByCardSelected() {
        EPStatement statement = engine.getEPAdministrator().createEPL(PayByCardSelected.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PayByCashSelected() {
       EPStatement statement = engine.getEPAdministrator().createEPL(PayByCashSelected.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PaymentRecevied() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PaymentRecevied.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PizzaDelivered() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PizzaDelivered.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_PizzaDone() {
         EPStatement statement = engine.getEPAdministrator().createEPL(PizzaDone.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_RepairPVM() {
        EPStatement statement = engine.getEPAdministrator().createEPL(RepairPVM.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_RepairSuccessCheck() {
        EPStatement statement = engine.getEPAdministrator().createEPL(RepairSuccessCheck.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_RepairSuccessful() {
        EPStatement statement = engine.getEPAdministrator().createEPL(RepairSuccessful.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_RepairUnsuccessful() {
         EPStatement statement = engine.getEPAdministrator().createEPL(RepairUnsuccessful.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_RequestDiagnosis() {
         EPStatement statement = engine.getEPAdministrator().createEPL(RequestDiagnosis.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_SettingsUpdated() {
        EPStatement statement = engine.getEPAdministrator().createEPL(SettingsUpdated.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_ShowRecieptAndPaymentOptions() {
        EPStatement statement = engine.getEPAdministrator().createEPL(ShowRecieptAndPaymentOptions.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_UpdateSettings() {
        EPStatement statement = engine.getEPAdministrator().createEPL(UpdateSettings.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_payClicked() {
         EPStatement statement = engine.getEPAdministrator().createEPL(payClicked.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_pickPizza() {
         EPStatement statement = engine.getEPAdministrator().createEPL(pickPizza.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }

    private void createEPL_setToIdle() {
         EPStatement statement = engine.getEPAdministrator().createEPL(setToIdle.getStatement());
       // statement.setSubscriber(new DoorClosedEventHandler(PVM));
    }



}
