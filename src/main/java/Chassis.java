public abstract class Chassis {
    private String Merk;
    private String Model;
    private double Prijs;

    public Chassis(String Merk,String model, double prijs){
        this.Merk =Merk;
        this.Model=model;
        this.Prijs=prijs;
    }

    public String getModel() {
        return Model;
    }

    public double getPrijs() {
        return Prijs;
    }
    public String getMerk(){
        return Merk;
    }

    public void PrintChassis(){

    }

}
