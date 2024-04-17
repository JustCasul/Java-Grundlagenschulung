package not.my.work.pki;

import de.shd.java.course.util.ConsoleHelper;

public class LoopExample {
   public static void main(String[] args) {
      //Einfache For-Schliefe

      for(int i = 0; i < 10; i++){
         System.out.println("Durchlauf: " + (i+1));
      }

      //Erweiterte For-Schleife
      int[]  numbers = new int[]{6,7,8,9,10};
      int summe=0;
      for(int element : numbers){
         summe += element;
         System.out.println(summe);
      }

      //While-Schleife (Kopfgesteuert)
      int input = 5;
      while (input < 10){
         System.out.println("running...");
         input++;
      }

      //While-Schleife (Fußgesteuert)

      do {
         System.out.println("running ....");
         input++;
      }while(input < 10);

      for (int i = 0; i <10; i++){
         continue;   //spring in den nächsten durchlauf
        // break;      //Bricht schleife ab
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 7. Jeder 2. Durchlauf
       *
       */

      for(int i = 0; i < 10; i++){
         if((i%2) == 1){
            System.out.println(" Hervorgehoben");
            continue;
         }
         System.out.println(i);
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 8. fizzbuzz
       *
       */

      for(int i = 1; i <= 100; i++){
         if (((i % 3) == 0) && ((i % 5) == 0)){
            System.out.println("fizzbuzz");
            continue;
         }
         else if((i % 3) == 0) {
            System.out.println("fizz");
            continue;
         }
         else if ((i % 5) == 0) {
            System.out.println("buzz");
            continue;
         }

         System.out.println(i);
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 9. Primzahlen
       *
       */
      int primzahlenAusgegeben = 0;
      int testIfPrime = 2;
      while (primzahlenAusgegeben < 100){
         //System.out.println("Teste " + testIfPrime);
         for(int i = (testIfPrime-1); i >= 1; i--){
            if(i == 1){
               System.out.println(testIfPrime);
               primzahlenAusgegeben++;
               break;
            }
            if((testIfPrime % i) == 0){
               //System.out.println("no prime");
               break;
            }
         }
         testIfPrime++;
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 10. Wiederhole den Anfang des Texts
       *
       */
      System.out.println("Aufgabe 10");

      String repShortenText = ConsoleHelper.readString("Gebe einen text ein:");

      int charCountToRep = ConsoleHelper.readInt("Gebe ein wie viele der " + repShortenText.length() + " Stellen du wiederholt ausgeben willst:");

      String substringRepShortenText;

      for(; charCountToRep > 0; charCountToRep--){
         substringRepShortenText = repShortenText.substring(0, charCountToRep);

         if(charCountToRep > 1){
            System.out.print(substringRepShortenText);
         }
         else{
            System.out.println(substringRepShortenText);
         }
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 11. Erstezen durch +
       *
       */
      System.out.println("Aufgabe 11");

      String baseText = ConsoleHelper.readString("Schreibe einen Text auf dessen basis gearbeitet werden soll:");
      String keepLetters = ConsoleHelper.readString("Schreibe eine Zeichenkette aus allen Zeichen die erhalten bleiben sollen:");

      char[] baseTextChars = baseText.toCharArray();
      char[] keepLettersChars = keepLetters.toCharArray();

      for(int i = 0; i < baseTextChars.length; i++){
         for (int j = 0; j < keepLettersChars.length; j++){
            if(j == keepLettersChars.length - 1 && baseTextChars[i] != keepLettersChars[j]){
               baseTextChars[i] = '+';
            }
            else if(baseTextChars[i] == keepLettersChars[j]){
               break;
            }
         }//j
      }//i

      for(int i = 0; i < baseTextChars.length; i++){
         if(i == baseTextChars.length - 1){
            System.out.println(baseTextChars[i]);
            break;
         }
         System.out.print(baseTextChars[i]);
      }

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 12. Summe 67
       *
       */
      System.out.println("Aufgabe 12");

      int[] summe67IntArray = new int[ConsoleHelper.readInt("Wie viele Zahlen wollen Sie eingeben?")];

      for(int i = 0; i < summe67IntArray.length; i++){
         summe67IntArray[i] = ConsoleHelper.readInt("Geben sie die " + (i+1) + ". Zahl ein:");
      }
      boolean exclude = false;
      int arraySum = 0;

      for(int i = 0; i < summe67IntArray.length; i++){
         if(summe67IntArray[i] == 6){
            for(int j = i+1; j < summe67IntArray.length; j++){
               if (summe67IntArray[j] == 7){
                  exclude = true;
               }
            }
         }
         if(!exclude) arraySum += summe67IntArray[i];
         else if(summe67IntArray[i] == 7) exclude = false;
      }

      System.out.println(arraySum);

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 13. Mittelwert
       *
       */
      System.out.println("Aufgabe 13");

      int[] mittelwertIntArray = new int[ConsoleHelper.readInt("Wie viele Zahlen wollen Sie eingeben?")];

      for(int i = 0; i < mittelwertIntArray.length; i++){
         mittelwertIntArray[i] = ConsoleHelper.readInt("Geben sie die " + (i+1) + ". Zahl ein:");
      }

      boolean maxExcluded = false, minExcluded = false;
      int mittelwertMax = 0, mittelwertMin = 0, mittelwert = 0;

      if(mittelwertIntArray.length > 0){
         mittelwertMax = mittelwertIntArray[0];
         mittelwertMin = mittelwertIntArray[0];
      }

      for(int i = 0; i < mittelwertIntArray.length; i++){
         if(mittelwertIntArray[i] < mittelwertMin) mittelwertMin = mittelwertIntArray[i];
         else if(mittelwertIntArray[i] > mittelwertMax) mittelwertMax = mittelwertIntArray[i];
      }
      System.out.println("min:" + mittelwertMin + " max:" + mittelwertMax);

      for(int i = 0; i < mittelwertIntArray.length; i++){
         if(mittelwertIntArray[i] == mittelwertMin && !minExcluded){
            minExcluded = true;
         }else if(mittelwertIntArray[i] == mittelwertMax && !maxExcluded){
            maxExcluded = true;
         }else{
            mittelwert += mittelwertIntArray[i];
         }
      }
      mittelwert = mittelwert/(mittelwertIntArray.length - 2);
      System.out.println(mittelwert);

      /*
       *
       * 3.Schleifen - Aufgaben
       *
       * 14. Maximale Spannweite
       *
       */
      System.out.println("Aufgabe 14");

      int[] maxSpannweiteIntArray = new int[ConsoleHelper.readInt("Wie viele Zahlen wollen Sie eingeben?")];

      for(int i = 0; i < maxSpannweiteIntArray.length; i++){
         maxSpannweiteIntArray[i] = ConsoleHelper.readInt("Geben sie die " + (i+1) + ". Zahl ein:");
      }

      int spannweite = 0,tempSpannweite;

      for(int i = 0; i < maxSpannweiteIntArray.length; i++){
         tempSpannweite = 0;
         for(int j = i; j < maxSpannweiteIntArray.length; j++){
            tempSpannweite++;
            if(maxSpannweiteIntArray[i] == maxSpannweiteIntArray[j] && tempSpannweite > spannweite) spannweite = tempSpannweite;
         }
      }
      System.out.println(spannweite);

   }

}
