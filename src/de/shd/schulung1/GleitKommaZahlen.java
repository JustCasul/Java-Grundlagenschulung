package de.shd.schulung1;

public class GleitKommaZahlen {

    public static void main(String[] args) {

        // Deklarierung einer Variable
        double eineGleitKommaZahl;

        // Initialisierung einer Variable
        eineGleitKommaZahl = 8.5;

        // Deklarierung und Initialisierung einer Variable
        double eineAndereGleitKommaZahl = 9.3;

        //Summe der Variablen
        double summe = eineGleitKommaZahl + eineAndereGleitKommaZahl;

        //Differenz der Variablen
        double differenz = eineGleitKommaZahl - eineAndereGleitKommaZahl;

        //Division der Variablen
        double division = eineGleitKommaZahl / eineAndereGleitKommaZahl;

        //Multiplikation der Variablen
        double multiplikation = eineGleitKommaZahl * eineAndereGleitKommaZahl;

        //Restwertteilung der Variablen
        double restWertTeilung = eineGleitKommaZahl % eineAndereGleitKommaZahl;

        //Ergebnisse ausgeben
        System.out.println("Die Summe ist : " + summe);
        System.out.println("Die Differenz ist : " + differenz);
        System.out.println("Die Division ergibt : " + division);
        System.out.println("Die Multiplikation ergibt : " + multiplikation);
        System.out.println("Der Restwert der Variablen ist : " + restWertTeilung);

    }

}
