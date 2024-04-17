package de.shd.schulung3;

public class MathUtil {

    public static void main(String[] args) {

        /**
         * Von oben bis unten:
         *
         * Addition zweier Zahlen
         * Subtraktion zweier Zahlen
         * Division zweier Zahlen
         * Multiplikation zweier Zahlen
         * Restwert zweier Zahlen
         *
         */
        System.out.println(addition(5,5));
        System.out.println(subtraktion(5,5));
        System.out.println(division(5,5));
        System.out.println(multiplikation(5,5));
        System.out.println(modulo(5,5));

        //Hausaufgabe:
        /**
         * a) Mittelwert einer Zahl
         * b) Absoluter Abstand zwischen zweier Zahlen
         */

        //a
        System.out.println(mittelwert(new double[] {1,4,6,8}));

        //b
        System.out.println(absoluterAbstand(9, 5));


    }

    public static int addition(int zahlEins, int zahlZwei){

        return zahlEins + zahlZwei;

    }

    public static int subtraktion(int zahlEins, int zahlZwei){

        return zahlEins - zahlZwei;

    }

    public static int division(int zahlEins, int zahlZwei){

        return zahlEins / zahlZwei;

    }

    public static int multiplikation(int zahlEins, int zahlZwei){

        return zahlEins * zahlZwei;

    }

    public static int modulo(int zahlEins, int zahlZwei){

        return zahlEins % zahlZwei;

    }

    //a
    public static double mittelwert (double[] zahlen){

        int doubleLength = zahlen.length;
        double summe = 0;
        for (int i = 0; i < doubleLength; i++) {
            summe = summe + zahlen[i];
        }


        return summe / doubleLength;

    }

    //b
    public static int absoluterAbstand (int zahlEins, int zahlZwei){

        return Math.abs(zahlEins - zahlZwei);

    }

}
