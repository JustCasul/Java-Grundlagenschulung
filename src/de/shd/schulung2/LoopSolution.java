package de.shd.java.course.modules.strings_arrays_loops.solutions;

public class LoopSolution
{
   public static void main(String[] args)
   {
      //Aufgabe 9
      int numberOfPrim = 0;
      int numberToCheck = 1;
      while(numberOfPrim < 100)
      {
         boolean isPrimNumber = true;
         for(int i = 2; i < numberToCheck/ 2 + 1; i++)
         {
            if(numberToCheck % i == 0)
            {
               isPrimNumber = false;
               break;
            }
         }
         if(isPrimNumber)
         {
            System.out.println(numberToCheck);
            numberOfPrim++;
         }
         numberToCheck++;
      }
   }

}
