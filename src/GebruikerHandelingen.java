public class GebruikerHandelingen {
    private Gebruiker gebruiker;
    private GebruikerBezittingen bezittingen;

    public GebruikerHandelingen(Gebruiker gebruiker,GebruikerBezittingen bezittingen){
        this.gebruiker=gebruiker;
        this.bezittingen=bezittingen;
    }

    public boolean koopAuto(Car c, int accountnummer) {
        BankAccount search = BankAccountLijst.getAccount(accountnummer);
        if (gebruiker.checkconnectie(search)) {
            if (search.getBalance() >= c.getPrijs()) {
                double newBalance = search.getBalance() - c.getPrijs();
                search.setBalance(newBalance);
                bezittingen.addCar(c);
                System.out.println("De auto is succesvol gekocht");
                return true;
            } else {
                System.out.println("U heeft niet genoeg saldo!");
                return false;
            }

        }else {
            System.out.println("Dit is niet uw BankAccountnummer!");
            return false;
        }
    }
    public boolean checkofJuisteAccountIs(BankAccount b){
        return b.getGebruikerAccount().equals(gebruiker) ;
    }

    public boolean verkoopAuto(Car c,int accountnr) {
        BankAccount search = BankAccountLijst.getAccount(accountnr);
        if (gebruiker.checkconnectie(search)) {
            if (bezittingen.zoekBezit(c)) {
                search.setBalance(search.getBalance() + c.getPrijs() * 0.85);
                bezittingen.removeCar(c);
                System.out.println("De auto is succesvol verkocht");
                return true;
            } else {
                System.out.println("U bezit deze auto niet!");
                return false;
            }
        }
        System.out.println("Dit is niet uw BankAccountnummer!");
        return false;
    }
}