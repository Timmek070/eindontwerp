import java.util.Scanner;

public class Tesla extends Car{

    public Tesla(){
        super("Tesla Den Haag",new TeslaFabriek());
    }

    @Override
    public boolean startCar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Druk de rem in");
        System.out.println("Draai de sleutel om");
        System.out.println("Zet de auto in drive");
        System.out.println("Laat de rem los");
        System.out.println("");
        System.out.println("Druk G om weg te rijden: ");
        String Wegrijden = sc.next();
        if (Wegrijden.equalsIgnoreCase("G")) {
            setAan();
            System.out.println("De auto rijdt!");
            return true;
        }
        return false;
    }


    @Override
    public boolean stopCar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        if (isAutoAanofUit()) {
            System.out.println("Druk de rem in");
            System.out.println("Zet de auto in z'n P");
            System.out.println("Haal de sleutel eruit");
            System.out.println("");
            System.out.println("Druk S op de auto te stoppen: ");
            String stop = sc.next();
            if (stop.equalsIgnoreCase("S")){
                System.out.println("De auto is gestopt!");
                return true;
            }
        } else {
            System.out.println("De auto rijdt nog niet!");
            return false;
        }
        return false;
    }
}
