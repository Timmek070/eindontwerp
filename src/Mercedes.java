public class Mercedes extends Car{
    public Mercedes(){
        super("WitteBrug Den Haag", new MercedesFabriek());
    }
        @Override
        public void startCar() {
            System.out.println("Druk de rem en koppeling in");
            System.out.println("Draai de sleutel om");
            System.out.println("Haal de handrem eraf");
            System.out.println("Laat de koppeling opkomen");
            System.out.println("geef gas");
            System.out.println("");
            setAan();

        }

        @Override
        public void stopCar() {
            System.out.println("");
            if (isAutoAanofUit()) {
                System.out.println("Druk de rem in");
                System.out.println("Druk de koppeling in");
                System.out.println("Zet de auto in z'n vrij");
                System.out.println("Handrem erop");
                System.out.println("Haal de sleutel eruit");
            } else {
                System.out.println("De auto is nog niet gestart!");
            }
        }
}
