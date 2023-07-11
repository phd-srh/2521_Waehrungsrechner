import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Währungsrechner dollarRechner = new Währungsrechner(0.91);
        Währungsrechner rubelRechner = new Währungsrechner(0.0101);
        Währungsrechner yenRechner = new Währungsrechner(0.0065);

        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Betrag eingeben: ");
        double betrag = eingabe.nextDouble();

        ausgabeWährung(dollarRechner, betrag, "Dollar");
        ausgabeWährung(rubelRechner, betrag, "Rubel");
        ausgabeWährung(yenRechner, betrag, "Yen");
    }

    private static void ausgabeWährung(Währungsrechner währungsrechner,
                                       double betrag, String währungsname) {
        double dollarBetrag = währungsrechner.inFremd(betrag);
        double euroBetrag   = währungsrechner.inEuro(betrag);

        System.out.println(betrag + " Euro sind " + dollarBetrag + " " + währungsname);
        System.out.println(betrag + " " + währungsname + " sind " + euroBetrag + " Euro");
    }
}
