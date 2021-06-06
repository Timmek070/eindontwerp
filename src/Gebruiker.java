

public class Gebruiker {
    private String Naam;
    private Integer Leeftijd;
    private GebruikerVasteKosten vasteKosten;
    private GebruikerLijst lijst;
    private GebruikerBezittingen bezittingen;
    private GebruikerHandelingen handelingen;


    public Gebruiker(String naam,Integer Leeftijd) {
        this.lijst=new GebruikerLijst();
        this.vasteKosten=new GebruikerVasteKosten(this);
        this.bezittingen=new GebruikerBezittingen();
        this.Naam = naam;
        this.Leeftijd=Leeftijd;
        this.handelingen=new GebruikerHandelingen(this,bezittingen);
        lijst.newGebruiker(this);

    }

    public String getNaam() {
        return this.Naam;
    }
    public Integer getLeeftijd(){
        return this.Leeftijd;
    }

    public boolean checkconnectie(BankAccount b){
        return handelingen.checkofJuisteAccountIs(b) ;
    }


    public boolean AanKoopAuto(Car c,int accountnummer){
        return handelingen.koopAuto(c,accountnummer);
    }

    public boolean VerKoopAuto(Car c,int accountnummer){
        return handelingen.verkoopAuto(c,accountnummer);
    }


    public double VerzekeringsKosten(Car a){
        return vasteKosten.VerzekeringKostenFormule(a);
    }
    public boolean checkEmptyBezit(){
        return bezittingen.aantalAutos() != 0;
    }

    public double WegenbelastingKosten(Integer bouwjaar,Integer gewicht,boolean elektrisch){
        return vasteKosten.WegenBelastingFormule(bouwjaar,gewicht,elektrisch);
    }

    public Integer getAantalAutos(){
        return bezittingen.aantalAutos();
    }



    public String PrintBezittingen(){
        return bezittingen.printBezit();
    }

    public Car getCarGebruiker(String search){
        return bezittingen.vindCar(search);
    }





}
