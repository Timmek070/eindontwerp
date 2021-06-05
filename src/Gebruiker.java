

public class Gebruiker {
    private String Naam;
    private Integer Leeftijd;
    private String Password;
    private GebruikerVasteKosten vasteKosten;
    private GebruikerLijst lijst;
    private GebruikerBezittingen bezittingen;
    private GebruikerHandelingen handelingen;


    public Gebruiker(String naam, String password,Integer Leeftijd) {
        this.lijst=new GebruikerLijst();
        this.vasteKosten=new GebruikerVasteKosten();
        this.bezittingen=new GebruikerBezittingen();
        this.Naam = naam;
        this.Password = password;
        this.Leeftijd=Leeftijd;
        this.handelingen=new GebruikerHandelingen(this,bezittingen);
        lijst.newGebruiker(this);

    }

    public boolean checkconnectie(BankAccount b){
        return handelingen.checkofJuisteAccountIs(b) ;
    }

    public void AanKoopAuto(Car c,int accountnummer){
       handelingen.koopAuto(c,accountnummer);
    }

    public boolean VerKoopAuto(Car c,int accountnummer){
        return handelingen.verkoopAuto(c,accountnummer);
    }

    public Integer getLeeftijd() {
        return Leeftijd;
    }

    public double VerzekeringsKosten(Car a){
        return vasteKosten.VerzekeringKostenFormule(a);
    }
    public boolean checkEmptyBezit(){
        return bezittingen.aantalAutos() != 0;
    }

    public double WegenbelastingKosten(Integer bouwjaar,Integer gewicht,boolean elektrisch){
        return vasteKosten.WegenBelastingCalculator(bouwjaar,gewicht,elektrisch);
    }

    public Integer getAantalAutos(){
        return bezittingen.aantalAutos();
    }

    public String getNaam() {
        return this.Naam;
    }

    public String PrintBezittingen(){
        return bezittingen.printBezit();
    }

    public Car getCarGebruiker(String gezochteAuto){
        return bezittingen.vindCar(gezochteAuto);
    }





}
