import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private Gebruiker gebruiker;
    private int accountNR;
    private BankAccountLijst lijst;



    public BankAccount(double balance, int AccountNR, Gebruiker gebruiker) {

        this.balance = balance;
        this.gebruiker = gebruiker;
        this.accountNR = AccountNR;
        this.lijst=new BankAccountLijst(this);

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


    public Gebruiker getGebruikerAccount(){
        return gebruiker;
    }

    public int getAccountNR() {
        return accountNR;
    }

}
