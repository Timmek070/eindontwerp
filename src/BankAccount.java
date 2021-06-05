import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private Gebruiker gebruiker;
    private int accountNR;
    private static ArrayList<BankAccount> accountlijst = new ArrayList<>();


    public BankAccount(double balance, int AccountNR, Gebruiker gebruiker) {
        this.balance = balance;
        this.gebruiker = gebruiker;
        this.accountNR = AccountNR;
        accountlijst.add(this);
    }


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public String getNaamBalance() {
        return gebruiker.getNaam();
    }

    public static BankAccount getAccount(int AccountNummer) {
        for (BankAccount t : accountlijst) {
            if (t.getAccountNR() == AccountNummer) {
                return t;
            }
        }
        return null;
    }
    public Gebruiker getGebruikerAccount(){
        return gebruiker;
    }

    public int getAccountNR() {
        return accountNR;
    }

}
