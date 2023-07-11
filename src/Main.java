import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Währungsrechner dollarRechner = new Währungsrechner(0.91);

        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Betrag eingeben: ");
        double betrag = eingabe.nextDouble();

        double dollarBetrag = dollarRechner.inFremd(betrag);
        double euroBetrag   = dollarRechner.inEuro(betrag);

        System.out.println(betrag + " Euro sind " + dollarBetrag + " Dollar");
        System.out.println(betrag + " Dollar sind " + euroBetrag + " Euro");
    }
}
