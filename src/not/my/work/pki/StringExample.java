package de.shd.schulung;

import de.shd.java.course.util.ConsoleHelper;

public class StringExample {

   public static void main(String[] args) {

      String textHello = "Hello ";
      String textWorld = "World!";

      String text = textHello + textWorld;
      System.out.println(text);

      int length = text.length();
      System.out.println("Länge von text: " + length);

      if (text.isEmpty()) {
         System.out.println("Text empty");
      }
      //Fängt der Text mit "Hello" an?
      boolean startsWithHello = text.startsWith("Hello");
      System.out.println(startsWithHello);

      //Endet der Text mit "Hello"?
      boolean endsWithHello = text.endsWith("Hello");
      System.out.println(endsWithHello);

      //Sind die Texte gleich ?
      boolean equals = text.equals("Hello World!");
      System.out.println(equals);

      String lowerCaseText = text.toLowerCase();
      System.out.println(lowerCaseText);

      String upperCaseText = text.toUpperCase();
      System.out.println(upperCaseText);

      boolean containsEllo = text.contains("ello");
      System.out.println(containsEllo);

      String substring = text.substring(0, 5);
      System.out.println(substring);

      String textblock = """
            Ich kann hier einen
            formatierten Text
            schreiben!
            """;




      /*
      *
      * 1.Strings - Aufgaben
      *
      * 1. Begrüßung
      *
       */
      System.out.println("Aufgabe String 1.1 Begrüßung");
      String name = ConsoleHelper.readString("Gib deinen Namen ein:");

      System.out.println("Hallo " + name);

      /*
       *
       * 1.Strings - Aufgaben
       *
       * 2. Verdreifachung
       *
       */
      System.out.println("Aufgabe String 1.2 Verdreifachung");

      String toTriple = ConsoleHelper.readString();
      int lengthOfToTripple = toTriple.length();
      String substringToTripple = toTriple.substring( lengthOfToTripple-2);
      System.out.println(substringToTripple + substringToTripple + substringToTripple);

      /*
       *
       * 1.Strings - Aufgaben
       *
       * 3. Erste Hälfte
       *
       */
      System.out.println("Aufgabe String 1.3 erste Hälfte");

      String toHalf = ConsoleHelper.readString();
      int lenghtOfToHalf = toHalf.length();
      String substringToHalf = toHalf.substring(0, lenghtOfToHalf/2);
      System.out.println(substringToHalf);

   }



}
