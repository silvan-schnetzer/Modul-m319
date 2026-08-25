package ch.tbz;

/*
Programm: Taschenrechner
Autor: Silvan Schnetzer
Datum: 25.08.2026
Beschreibung: Taschenrechner
 */

// Imports libraries
import static java.lang.System.*;   // System-IO Library for abbreviation purpose to static functions
import static java.lang.Math.*;     // Mathematics Library for abbreviation purpose to static functions
import java.util.*;

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the input-functions can be used now!

public class Taschenrechner {

    public static void main(String[] args ) {

        out.println("Taschenrechner");

        int zahl1 = inputInt("Was ist deine erste Zahl: ");

        int zahl2 = inputInt("Was ist deine zweite Zahl: ");

        char operator = inputChar("Welchen Operator willst du nutzen: ");

        int resultat1 = zahl1 + zahl2;

        int resultat2 = zahl1 - zahl2;

        int resultat3 = zahl1 * zahl2;

        int resultat4 = zahl1 / zahl2;

        if (operator == '+') {
            System.out.println("Deine Lösung ist: " + resultat1);

        }

        if (operator == '-') {
            System.out.println("Deine Lösung ist: " + resultat2);

        }

        if (operator == '*') {
            System.out.println("Deine Lösung ist: " + resultat3);

        }

        if (operator == '/') {
            System.out.println("Deine Lösung ist: " + resultat4);

        }
    }



}
