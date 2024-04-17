package de.shd.schulung2;

import de.shd.java.course.util.ConsoleHelper;

public class String_Aufgaben {

    public static void main(String[] args) {

        //////////////////////
        ///// Aufgabe: 1 /////
        //////////////////////

        //Name bekommen
        String name = ConsoleHelper.readString("Gib deinen Namen ein: ");

        //Begrüßung ausgeben
        System.out.println("Hallo " + name);


        //////////////////////
        ///// Aufgabe: 2 /////
        //////////////////////

        //Wort bekommen
        String word1 = ConsoleHelper.readString("Gib mir ein Wort: ");

        //Länge bekommen
        int length1 = word1.length();

        //Substring bekommen
        String substring1 = word1.substring(length1 - 2);

        //Verdreifachung ausgeben
        System.out.println(substring1 + substring1 + substring1);


        //////////////////////
        ///// Aufgabe: 3 /////
        //////////////////////

        //Wort bekommen
        String word2 = ConsoleHelper.readString("Gib mir ein weiteres Wort: ");

        //Länge bekommen
        int length2 = word2.length();

        //Hälfte bekommen
        int mitte = length2 / 2;

        //Substring bekommen
        String substring2 = word2.substring(mitte);

        //String ab Hälfte ausgeben
        System.out.println(substring2);

    }

}

