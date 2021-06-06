import java.util.ArrayList;

public class BankAccountLijst {
    private BankAccount account;
    private static ArrayList<BankAccount> accountlijst =new ArrayList<>();

    public BankAccountLijst(BankAccount account){
        this.account=account;
        accountlijst.add(account);
    }

    public static BankAccount getAccount(int AccountNummer) {
        for (BankAccount t : accountlijst) {
            if (t.getAccountNR() == AccountNummer) {
                return t;
            }
        }
        return null;
    }
}

