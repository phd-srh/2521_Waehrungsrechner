import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Währungsrechner dollarRechner = new Währungsrechner(0.91, "Dollar");
        Währungsrechner rubelRechner = new Währungsrechner(0.0101, "Rubel");
        Währungsrechner yenRechner = new Währungsrechner(0.0065, "Yen");

        /* Feature Requests:
         * a) Eine Schleife im Hauptprogramm, um mehrere Beträge umrechnen zu können
         *    Bei Eingabe von 0 wird die Schleife verlassen.
         *    => erledigt
         * b) Die Währungsbezeichnung soll als weiteres Attribut zum Währungsrechner
         *    ergänzt werden, damit in der Methode ausgabeWährung der Parameter weg-
         *    gelassen werden kann und durch den Aufruf von getWährungsbezeichnung()
         *    angefragt werden kann.
         *    => erledigt
         */

        Scanner eingabe = new Scanner(System.in);
        while (true) {
            System.out.print("Bitte Betrag eingeben (mit 0 beenden): ");
            double betrag = eingabe.nextDouble();
            if (Math.abs(betrag) < 0.000001) break;

            ausgabeWährung(dollarRechner, betrag);
            ausgabeWährung(rubelRechner, betrag);
            ausgabeWährung(yenRechner, betrag);
        }
    }

    private static void ausgabeWährung(Währungsrechner währungsrechner,
                                       double betrag) {
        double dollarBetrag = währungsrechner.inFremd(betrag);
        double euroBetrag   = währungsrechner.inEuro(betrag);

        String währungsname = währungsrechner.getWährungsbezeichnung();
        System.out.println(betrag + " Euro sind " + dollarBetrag + " " + währungsname);
        System.out.println(betrag + " " + währungsname + " sind " + euroBetrag + " Euro");
    }
}
