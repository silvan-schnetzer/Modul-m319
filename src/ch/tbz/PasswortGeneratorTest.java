package ch.tbz;

import java.util.Random;
import static ch.tbz.lib.Input.*;

/**
 * Generiert sichere Passwörter mit optionalen Sonderzeichen basierend auf Benutzereingaben.
 *
 * Silvan Schnetzer
 * version 1.0
 */
public class PasswortGeneratorTest {

    private static final int MAX_LAENGE = 128;
    private static final String ZEICHEN_STANDARD = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String ZEICHEN_SONDER = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!?#$%&*+-_";

    /**
     * Startpunkt der Anwendung. Steuert den Generierungs- und Wiederholungs-Workflow.
     *
     * @param args Kommandozeilenargumente (wird nicht verwendet)
     */
    public static void main(String[] args) {
        char wiederholen;
        do {
            // Eingabe: erst fragen, Werte in Variablen speichern
            int laenge = anzahlZeichen();
            boolean sonderzeichen = sonderZeichenJN();

            // Verarbeitung
            String passwort = erzeugePasswort(laenge, sonderzeichen);

            // Ausgabe
            ausgabe(passwort);

            wiederholen = inputChar("Möchtest du nochmals generieren (j oder n): ");
        } while (wiederholen == 'j');
    }

    /**
     * Fragt die gewünschte Passwortlänge ab und validiert sie im erlaubten Bereich.
     *
     * @return die gültige Passwortlänge als Integer
     */
    public static int anzahlZeichen() {
        int anzahl;
        do {
            anzahl = inputInt("Wie viele Zeichen soll dein Passwort haben (1-" + MAX_LAENGE + "): ");
        } while (anzahl < 1 || anzahl > MAX_LAENGE);
        return anzahl;
    }

    /**
     * Fragt ab, ob das Passwort Sonderzeichen enthalten soll.
     *
     * @return true, wenn Sonderzeichen erwünscht sind, sonst false
     */
    public static boolean sonderZeichenJN() {
        return inputBoolean("Soll dein Passwort Sonderzeichen haben (ja, nein): ");
    }

    /**
     * Wählt je nach Parameter den passenden Zeichenvorrat für das Passwort aus.
     *
     * @param anzahl die Länge des zu generierenden Passworts
     * @param mitSonder Flag, ob Sonderzeichen verwendet werden sollen
     * @return das generierte Passwort als String
     */
    public static String erzeugePasswort(int anzahl, boolean mitSonder) {
        if (mitSonder) {
            return mitSonderzeichen(anzahl);
        } else {
            return ohneSonderzeichen(anzahl);
        }
    }

    /**
     * Gibt das generierte Passwort formatiert auf der Konsole aus.
     *
     * @param passwort das auszugebende Passwort
     */
    public static void ausgabe(String passwort) {
        System.out.println("Dein Passwort ist: " + passwort);
    }

    /**
     * Generiert ein Passwort ohne Sonderzeichen.
     *
     * @param anzahlZeichen die Länge des Passworts
     * @return das Passwort ohne Sonderzeichen
     */
    public static String ohneSonderzeichen(int anzahlZeichen) {
        return zufallspasswort(ZEICHEN_STANDARD, anzahlZeichen);
    }

    /**
     * Generiert ein Passwort mit Sonderzeichen.
     *
     * @param anzahlZeichen die Länge des Passworts
     * @return das Passwort mit Sonderzeichen
     */
    public static String mitSonderzeichen(int anzahlZeichen) {
        return zufallspasswort(ZEICHEN_SONDER, anzahlZeichen);
    }

    /**
     * Baut das Passwort effizient aus zufälligen Zeichen des übergebenen Vorrats auf.
     *
     * @param zeichen der zur Verfügung stehende Zeichenvorrat
     * @param anzahlZeichen die Anzahl der zu generierenden Zeichen
     * @return das fertige Zufallspasswort als String
     */
    public static String zufallspasswort(String zeichen, int anzahlZeichen) {
        Random random = new Random();
        StringBuilder passwort = new StringBuilder();
        for (int i = 0; i < anzahlZeichen; i++) {
            int pw = random.nextInt(zeichen.length());
            passwort.append(zeichen.charAt(pw));
        }
        return passwort.toString();
    }
}