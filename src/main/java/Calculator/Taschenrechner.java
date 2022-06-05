package Calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double zahl1, zahl2;

        char operator;

        System.out.println("Geben Sie bitte Ihre erste Zahl ein: ");
        zahl1 = userInput.nextDouble();

        System.out.println("Geben Sie einen Rechenoperator ein: (+, *, -, /)");
        operator = userInput.next().charAt(0);

        System.out.println("Geben Sie bitte Ihre zweite Zahl ein: ");
        zahl2 = userInput.nextDouble();

        if (operator == '+'){
            System.out.println("Die Ergbenis der Addition von " +  zahl1 + " und " + zahl2 + " ist " + (zahl1 + zahl2));
        } else if (operator == '-') {
            System.out.println("Die Ergbenis der Substraktion von " +  zahl1 + " und " + zahl2 + " ist " + (zahl1 - zahl2));

        }else if (operator == '*'){
            System.out.println("Die Ergbenis der Multiplikation von " +  zahl1 + " und " + zahl2 + " ist " + (zahl1 * zahl2));
        }
        else if(operator == '/') {
            System.out.println("Die Ergbenis der Division von " +  zahl1 + " und " + zahl2 + " ist " + (zahl1 / zahl2));
        }
        else {
            System.out.println(" Sie haben einen ungültigen Rechenoperator eingegeben");
        }

    }
}
