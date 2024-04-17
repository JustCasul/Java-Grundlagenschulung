package de.shd.schulung2;

import de.shd.java.course.util.ConsoleHelper;

public class Loop_Aufgaben {

    public static void main(String[] args) {

        //////////////////////
        ///// Aufgabe: 7 /////
        //////////////////////

        for (int i = 0; i <= 10; i++) {
            if (i != 0 && i % 2 == 0) {
                System.out.println("Durchlauf: " + i + " //hervorgehoben//");
                continue;
            }
            System.out.println("Durchlauf: " + i);
        }


        //////////////////////
        ///// Aufgabe: 8 /////
        //////////////////////

        for (int i = 0; i < 100; i++) {
            if (i != 0 && i % 5 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
                continue;
            } else if (i != 0 && i % 3 == 0) {
                System.out.println("buzz");
                continue;
            } else if (i != 0 && i % 5 == 0) {
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }


        //////////////////////
        ///// Aufgabe: 9 /////
        //////////////////////
        int zaehler = 2;
        int primzahlen = 1;
        while (primzahlen <= 100){
            boolean primzahl = true;
            for (int i = 2; i < zaehler; i++){
                if (zaehler % i == 0) {
                    primzahl = false;
                    break;
                }
            }
            if (primzahl){
                System.out.println(zaehler);
                primzahlen++;
            }
            zaehler++;

        }


        //////////////////////
        ////  Aufgabe: 10 ////
        //////////////////////

        //Text einlesen
        String text = ConsoleHelper.readString("Gib einen Text ein: ");

        //Text-Anfangs-Länge bestimmen
        int textAnfangsLaenge = ConsoleHelper.readInt("Wie lang soll der Anfang des Textes sein?");


        //Text ausgeben im loop
        for (int i = textAnfangsLaenge; i > 0; i--) {
            //Substring anlegen
            String textAnfang = text.substring(0, textAnfangsLaenge);

            System.out.print(textAnfang);
            textAnfangsLaenge--;
        }





    }

}
