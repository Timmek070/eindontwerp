import java.awt.dnd.DragGestureEvent;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gebruiker Tim  =new Gebruiker("Tim",19);
        BankAccount b= new BankAccount(50000,105,Tim);
        Gebruiker Peter= new Gebruiker("Peter",48);
        new BankAccount(50000,106,Peter);



        int verder = 1;
        Menu m =new Menu();
        while (verder !=0){
            m.printMenu();
            System.out.println("Wilt u doorgaan");
            System.out.println("0) nee");
            System.out.println("1) ja");

            verder = scanner.nextInt();
        }

    }
}
