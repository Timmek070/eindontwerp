public class TeslaFabriek implements CarFabriek{

    @Override
    public Chassis BouwChassis(){
        return new ModelS();
    }

    @Override
    public Velgen InstalleerVelgen(){
        return new StandaardVelgen();
    }

    @Override
    public Engine InstalleerEngine(){
        return new RaceEngine();
    }
}
