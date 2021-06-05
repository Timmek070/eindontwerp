import java.util.Scanner;

public class Tesla extends Car{

    public Tesla(){
        super("Tesla Den Haag",new TeslaFabriek());
    }

        @Override
        public void startCar(){

            System.out.println("Druk de rem in");
            System.out.println("Draai de sleutel om");
            System.out.println("Zet de auto in drive");
            System.out.println("Laat de rem los");
            System.out.println("");
            setAan();
        }


    @Override
    public void stopCar(){
        if (isAutoAanofUit()) {
            System.out.println("");
            System.out.println("Druk de rem in");
            System.out.println("Rem tot stilstand");
            System.out.println("Zet de auto in P");
            System.out.println("Haal de sleutel eruit");
            System.out.println(" ");
        }else {
            System.out.println("De auto is nog niet gestart!");
        }
    }
}
