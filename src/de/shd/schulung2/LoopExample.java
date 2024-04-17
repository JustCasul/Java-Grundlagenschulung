package de.shd.schulung2;

public class LoopExample {

    public static void main(String[] args) {

        //In/Dekrement
        int y = 0;
        y++; //Inkrement
        y--; //Dekrement

        //Einfache For-Schleife
        for (int i = 0; i < 10; i++) {
            System.out.println("Durchlauf " + (i + 1));
        }

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int summe = 0;
        for (int i = 0; i < numbers.length; i++) {
            summe = summe + numbers[i];
        }
        System.out.println(summe);

        //Erweiterte For-Schleife
        int[] numbers2 = new int[]{6, 7, 8, 9, 10};
        summe = 0;
        for (int element : numbers2) {
            summe = summe + element;
        }

        //Endlose for Schleife
        /* for (;;){

        }
        */


        //While-Schleife (Kopfgesteuert)
        int input = 5;
        while (input < 10) {
            System.out.println("Still running...");
            input++;
        }

        //While-Schleife (Fußgesteuert)
        do {
            System.out.println("Still running...");
            input++;
        } while (input < 10);

        for (int i = 0; i < 10; i++) {
            if (i != 0 && i % 3 == 0) {
                continue;
            }
            System.out.println("Durchlauf: " + i);
        }

        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            if (i != 0 && i % 3 == 0) {
                break;
            }
            System.out.println("Durchlauf: " + i);
        }

        for (int f = 0; f < 100; f++) {
            System.out.println("Fortnite");
            f++;
        }

        int g = 300;
        while (g > 50){
            System.out.println();
            g--;
        }
        
        do {
            System.out.println("I love Renegade Raider");
            g--;
        } while (g > 100);
    }

}
