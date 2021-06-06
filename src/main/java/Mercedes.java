import java.util.Scanner;

public class Mercedes extends Car{
    public Mercedes(){
        super("WitteBrug Den Haag", new MercedesFabriek());
    }
    @Override
    public boolean startCar() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Druk de rem en koppeling in");
        System.out.println("Draai de sleutel om");
        System.out.println("Haal de handrem eraf");
        System.out.println("Laat de koppeling opkomen");
        System.out.println("geef gas");
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
    public boolean stopCar() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        if (isAutoAanofUit()) {
            System.out.println("Druk de rem in");
            System.out.println("Druk de koppeling in");
            System.out.println("Zet de auto in z'n vrij");
            System.out.println("Handrem erop");
            System.out.println("Haal de sleutel eruit");
            System.out.println("");
            System.out.println("Druk S op de auto te stoppen: ");
            String stop = sc.next();
            if (stop.equalsIgnoreCase("S")){
                System.out.println("De auto is gestopt!");
                return true;
            }
        } else {
            System.out.println("De rijdt nog niet!");
            return false;
        }
        return false;
    }
}
