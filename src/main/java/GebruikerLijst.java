import java.util.ArrayList;

public class GebruikerLijst {
        private static ArrayList<Gebruiker> gebruikerslijst = new ArrayList<>();

        public void newGebruiker(Gebruiker gebruiker){
            gebruikerslijst.add(gebruiker);
        }

    public static Gebruiker getGebruiker(String naam) {
        System.out.println("Geef uw Naam: ");
        for (Gebruiker g : gebruikerslijst) {
            if (naam.equals(g.getNaam())) {
                return g;
            }
        }
        return null;
    }

}
