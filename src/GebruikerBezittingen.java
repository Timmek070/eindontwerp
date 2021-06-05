import java.util.ArrayList;

public class GebruikerBezittingen {

    private ArrayList<Car> bezit = new ArrayList<>();

    public Car vindCar(String modelnaam) {
        for (Car b : bezit) {
            if (b.getModel().equals(modelnaam)) {
                return b;
            }
        }
        return null;
    }

    public String printBezit() {
        String autos = "";
        for (Car d : bezit) {
            autos +=  d.getMerk() +" "+d.getModel() + "," ;
        }
        return autos;
    }

    public void addCar(Car c) {
        bezit.add(c);
    }

    public void removeCar(Car c) {
        bezit.remove(c);
    }

    public boolean zoekbezit(Car c) {
        for (Car d : bezit) {
            if (d.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public Integer aantalAutos(){
        return bezit.size();
    }
}
