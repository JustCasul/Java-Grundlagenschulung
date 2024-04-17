package de.shd.schulung;

import java.util.Random;

public class ArrayExample {
   public static void main(String[] args) {

      Random rand = new Random();

      int[] numbers = new int[10];
      char[] buchstaben = new char[5];
      String[] texte = new String[20];

      numbers[0] = -10;
      numbers[9] = 15;

      System.out.println(numbers[0]);
      System.out.println(numbers[9]);

      int[] numbers2 = new int[]{1,2,3,4,5};

      String text = "Hello World!";
      char[] buchstabenAusText = text.toCharArray();
      System.out.println(buchstabenAusText[0]);
      System.out.println(buchstabenAusText[11]);

      /*
       *
       * 2.Arrays - Aufgaben
       *
       * 4. Addiere 2 Arrays
       *
       */

      int[] iarr1 = new int[]{1,2};
      int[] iarr2 = new int[2];
      iarr2[0] = 3;
      iarr2[1] = 4;

      int[] iarrSum = new int[4];

      iarrSum[0] = iarr1[0];
      iarrSum[1] = iarr1[1];
      iarrSum[2] = iarr2[0];
      iarrSum[3] = iarr2[1];

      for(int i = 0; i < 4; i++){
         System.out.println(iarrSum[i]);
      }

      /*
       *
       * 2.Arrays - Aufgaben
       *
       * 5. Die 3 mittleren Elemente
       *
       */
      System.out.println("Aufgabe 5");

      int[] middleThree = new int[5];

      for(int i = 0; i < middleThree.length; i++){
         middleThree[i] = i+1;
      }
   /*    //Arrayausgabe in einer Zeile
      for (int i = 0; i < middleThree.length; i++){
         if(i == 0){
            System.out.print(middleThree[i] + ", ");
         }else if (i < (middleThree.length - 1)){
            System.out.print(middleThree[i] + ", ");
         }else if(i == (middleThree.length - 1)){
            System.out.println(middleThree[i]);
         }
      }
   */
      for(int i = (middleThree.length / 2) -1; i <= (middleThree.length / 2) + 1; i++){
         System.out.println(middleThree[i]);
      }

      /*
       *
       * 2.Arrays - Aufgaben
       *
       * 6. "Unlucky"
       *
       */
      System.out.println("Aufgabe 6");

      int[] unluckyIntArray = new int[10];
      //int[] unluckyIntArray = new int[]{1,1,3,5,5,5,5,5,5,5};

      while(true){
         for (int i = 0; i < unluckyIntArray.length; i++) {
            unluckyIntArray[i] = rand.nextInt(10 + 1);
         }

         for (int i = 0; i < unluckyIntArray.length; i++){     // ausgabe des Aktuellen Arrays in einer Zeile
            if (i < (unluckyIntArray.length - 1)) System.out.print(unluckyIntArray[i] + ", ");
            else if(i == (unluckyIntArray.length - 1)) System.out.println(unluckyIntArray[i]);
         }

         if(unluckyIntArray[0] == 1 || unluckyIntArray[1] == 1 || unluckyIntArray[unluckyIntArray.length - 2] == 1){
            if(unluckyIntArray[0] == 1 && unluckyIntArray[1] == 3){
               System.out.println("unlucky");
               break;
            }
            else if(unluckyIntArray[1] == 1 && unluckyIntArray[2] == 3){
               System.out.println("unlucky");
               break;
            }
            else if(unluckyIntArray[unluckyIntArray.length - 2] == 1 && unluckyIntArray[unluckyIntArray.length - 1] == 3){
               System.out.println("unlucky");
               break;
            }

         }

      }



   }
}
