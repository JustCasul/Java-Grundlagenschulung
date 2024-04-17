package schulung3;

import static java.lang.Math.*;

public class RückgabewertAufgabe {

    public static void main(String[] args) {

        // Aufgabe 2.1
        String FitnessGramPacerTestText = FitnessGramPacerTest();

        //Aufgabe 2.2
        int number = randomNumber();

    }

    //Aufgabe 2.1
    public static String FitnessGramPacerTest(){

        return "The FitnessGram Pacer Test is a multiple stage aerobic capacity test that gets progressively harder as it continues.";

    }


    //Aufgabe 2.2
    public static int randomNumber(){

        int[] randomNumbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            randomNumbers[i] =(int)(Math.random()*1000);
        }

        return randomNumbers[1];

    }

    public static int getRandomNumber() {
        return (int)(Math.random()*1000);
    }

}
