import java.util.Scanner;

class Menu {
    public static int printKeuzes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1) Saldo en Accountgegevens");
        System.out.println("2) Auto kopen");
        System.out.println("3) Auto verkopen");
        System.out.println("4) wegenbelasting berekenen");
        System.out.println("5) Uw bezit aan autos");
        System.out.println("6) Auto rijden");
        System.out.println("0) Exit");

        int choice = scanner.nextInt();
        return choice;
    }


    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String naam="";
        Integer accountnummer;
        String keuze = "";

        switch (printKeuzes()) {
            case 0:
                return;
            case 1:

                System.out.println("Saldo en Accountgegevens");
                System.out.print("Geef uw Accountnummer: ");
                accountnummer = scanner.nextInt();
                BankAccount search = BankAccount.getAccount(accountnummer);
                System.out.println("Uw Naam: " + search.getNaamBalance());
                System.out.println("Uw accountnummer: " + search.getAccountNR());
                System.out.println("Uw balance:" + search.getBalance());

                break;

            case 2:
                System.out.println("Geef uw BankAccountnummer:");
                accountnummer = scanner.nextInt();
                System.out.println("Geef uw Naam: ");
                naam = scanner.next();
                Gebruiker klant = GebruikerLijst.getGebruiker(naam);
                System.out.println("Welke Auto wilt u kopen? Tesla/Mercedes?");
                keuze = scanner.next();
                if (keuze.equals("Tesla")) {
                    Tesla tesla = new Tesla();
                    tesla.Print();
                    System.out.println("");
                    System.out.println("Wilt uw de auto kopen? ja/nee");
                    keuze = scanner.next();
                    if (keuze.equals("ja")) {
                        klant.AanKoopAuto(tesla, accountnummer);
                        break;
                    }
                } else {
                    Mercedes c63 = new Mercedes();
                    c63.Print();
                    System.out.println("");
                    System.out.println("Wilt uw de auto kopen? ja/nee");
                    keuze = scanner.next();
                    if (keuze.equals("ja")) {
                        klant.AanKoopAuto(c63, accountnummer);
                    }
                }
                break;

            case 3:
                System.out.println("Verkoop Auto");
                    System.out.println("Geef uw Naam: ");
                    naam = scanner.next();
                    Gebruiker Verkoper = GebruikerLijst.getGebruiker(naam);
                    System.out.println("Uw bezit aan auto's: ");
                    System.out.println();
                    System.out.println(Verkoper.PrintBezittingen());
                    System.out.println("------------------------------------------------");
                    System.out.println("Welke auto wilt uw verkopen? Geef het ModelNaam:");
                    String ModelNaam = scanner.next();
                    Car c = Verkoper.getCarGebruiker(ModelNaam);
                    System.out.println("Geef uw BankAccountNummer:");
                    accountnummer = scanner.nextInt();
                    Verkoper.VerKoopAuto(c,accountnummer);
                break;

            case 4:
                System.out.println("Wilt u uw wegenbelasting berekenen? ja/nee");
                keuze = scanner.next();
                if (keuze.equals("ja")) {
                    System.out.println("Wat is uw naam?");
                    naam= scanner.next();
                    Gebruiker gebruiker = GebruikerLijst.getGebruiker(naam);
                    System.out.println("Wat is het bouwjaar van uw auto: ");
                    Integer bouwjaar = scanner.nextInt();
                    System.out.println("Wat is het gewicht van uw auto: ");
                    Integer gewicht = scanner.nextInt();
                    System.out.println("Is uw auto elektrisch? ja/nee ");
                    String elektrisch = scanner.next();
                    boolean brandstof =false;
                    if (elektrisch.equals("ja")){
                        brandstof =true;
                    }
                    System.out.println(gebruiker.WegenbelastingKosten(bouwjaar, gewicht, brandstof));
                }
                break;

            case 5:
                System.out.println("Wat is uw naam:");
                String uwnaam = scanner.next();
                Gebruiker zoek = GebruikerLijst.getGebruiker(uwnaam);
                System.out.println(zoek.PrintBezittingen());
                break;

            case 6:
                System.out.println("Geef uw Naam: ");
                naam = scanner.next();
                Gebruiker gebruiker = GebruikerLijst.getGebruiker(naam);
                System.out.println(gebruiker.PrintBezittingen());
                System.out.println("Geef het model van de auto waarmee u wilt rijden: ");
                String model = scanner.next();
                Car auto = gebruiker.getCarGebruiker(model);
                auto.rij();
                break;
        }

    }

}
