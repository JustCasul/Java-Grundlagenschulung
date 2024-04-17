package de.shd.schulung1;

public class DeklarierungInitialisierung {

    public static void main(String[] args) {

        // Deklarierung einer Variable
        int eineGanzzahligeZahl;

        // Initialisierung einer Variable
        eineGanzzahligeZahl = 8;

        // Deklarierung und Initialisierung einer Variable
        int eineAndereGanzzahligeZahl = 9;

        //Summe der Variablen
        int summe = eineGanzzahligeZahl + eineAndereGanzzahligeZahl;

        //Differenz der Variablen
        int differenz = eineGanzzahligeZahl - eineAndereGanzzahligeZahl;

        //Division der Variablen
        int division = eineGanzzahligeZahl / eineAndereGanzzahligeZahl;

        //Multiplikation der Variablen
        int multiplikation = eineGanzzahligeZahl * eineAndereGanzzahligeZahl;

        //Restwertteilung der Variablen
        int restWertTeilung = eineGanzzahligeZahl % eineAndereGanzzahligeZahl;

        //Ergebnisse ausgeben
        System.out.println("Die Summe ist : " + summe);
        System.out.println("Die Differenz ist : " + differenz);
        System.out.println("Die Division ergibt : " + division);
        System.out.println("Die Multiplikation ergibt : " + multiplikation);
        System.out.println("Der Restwert der Variablen ist : " + restWertTeilung);

    }

}
