public class MercedesFabriek implements CarFabriek {

    @Override
    public Chassis BouwChassis(){
        return new C63();
    }

    @Override
    public Velgen InstalleerVelgen(){
        return new VossenVelgen();
    }

    @Override
    public Engine InstalleerEngine(){
        return new StandaardEngine();
    }

}
