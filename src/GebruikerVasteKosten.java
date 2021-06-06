public class GebruikerVasteKosten {
    Gebruiker gebruiker;

    public GebruikerVasteKosten(Gebruiker gebruiker){
        this.gebruiker=gebruiker;
    }

    public double VerzekeringKostenFormule(Car a) {
        if ( gebruiker.getLeeftijd() > 65) {
            return a.getPrijs() * 0.15;
        } else if (gebruiker.getLeeftijd() >= 24) {
            return a.getPrijs() * 0.05;
        } else if (gebruiker.getLeeftijd() <= 23) {
            return a.getPrijs() * 0.13;
        }
        return 0.0;

    }

    public double WegenBelastingFormule(Integer bouwjaar, Integer gewicht, boolean elektrisch) {
        double wegenB;
        if (bouwjaar > 2010) {
            wegenB = 750;

        } else if (bouwjaar > 1990) {
            wegenB = 1000;
        } else {
            wegenB = 2000;
        }

        if (gewicht > 3000) {
            wegenB *= 1.10;
        }

        if (gebruiker.getAantalAutos() >= 2) {
            wegenB = wegenB * 1.20;
        } else {
            wegenB *= 1.10;
        }

        if (elektrisch) {
            wegenB = 0;
        }
        return wegenB;
    }


}
