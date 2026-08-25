package ch.tbz;

/*
Programm: Stundenlohnrechner
Autor: Silvan Schnetzer
Datum: 25.08.2026
Beschreibung: Wie viel Geld man pro stunde verdient
 */

// Imports libraries

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the input-functions can be used now!


public class Stundenlohnrechner {

    public static void main(String[] args ) {

        char nochmals;

        do {
            double lohn = inputDouble("Wie viel Geld verdienst du pro Stunde: ");

            double arbeitszeit = inputDouble("Wie viele Stunden musst du pro Woche arbeiten: ");

            double arbeit = inputDouble("Wie viele Stunden hast du diese Woche gearbeitet: ");

            //wie viel Geld man verdient ohne den überstunden


            if (arbeit <= arbeitszeit) {
                double verdientes;
                verdientes = lohn * arbeit;
                System.out.println("Du hast diese Woche: " + verdientes + "CHF verdient");
            }

            if (arbeit > arbeitszeit) {
                double überstunden = (double) ((arbeit - arbeitszeit) * lohn * 1.5);
                double verdienteü = arbeitszeit * lohn + überstunden;
                System.out.println("Du hast diese Woche: " + verdienteü + "CHF verdient");
            }
            System.out.println();
            nochmals = inputChar("möchtest du nochmals rechnen: (j oder n)");
        } while (nochmals == 'j');
    }
}
