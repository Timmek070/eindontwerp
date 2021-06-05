import java.util.Scanner;

public abstract class Car {
    private String Dealer;
    private Engine engine;
    private Chassis chassis;
    private Velgen velgen;
    private boolean AutoAanofUit;



    public Car(String Dealer,CarFabriek fabriek) {
        this.Dealer=Dealer;
        this.chassis=fabriek.BouwChassis();
        this.engine=fabriek.InstalleerEngine();
        this.velgen=fabriek.InstalleerVelgen();
    }

    public void Print(){
        System.out.println("Te koop bij dealer: "+ Dealer + ", Model auto: "+ chassis.getModel() +", Pk: "+ engine.getPk()+", Brandstof: "+ engine.getTypeEngine()+", Merk velgen: "+ velgen.getMerkVelgen() + ", Inch velgen: " + velgen.getInchVelgen());
        System.out.println("------------------------------------------------------");
        System.out.println("Totaal prijs auto: " + chassis.getPrijs());
    }



    public double getPrijs(){
        return chassis.getPrijs();
    }
    public String getMerk(){
        return chassis.getMerk();
    }

    public String getModel(){
        return chassis.getModel();
    }

    public boolean isAutoAanofUit() {
        return AutoAanofUit;
    }
    public void setAan(){
        AutoAanofUit= true;
    }

    public String getDealer(){
        return Dealer;
    }
    public void rij(){
        startCar();
        if (AutoAanofUit) {
            stopCar();
        }
    }
    public abstract void startCar();
    public abstract void stopCar();
}
