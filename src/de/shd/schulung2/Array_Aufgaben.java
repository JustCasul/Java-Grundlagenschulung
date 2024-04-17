package de.shd.schulung2;

public class Array_Aufgaben {

    public static void main(String[] args) {

        //////////////////////
        ///// Aufgabe: 4 /////
        //////////////////////

        //Array erstellen
        int[] intArray1 = new int[2];
        int[] intArray2 = new int[2];

        //Arrays Werte zuweisen
        intArray1[0] = 12;
        intArray1[1] = 22;

        intArray2[0] = 19;
        intArray2[1] = 99;

        //neuen Array erstellen
        int[] intArray12 = new int[4];

        //Array Werte zuweisen
        intArray12[0] = intArray1[0];
        intArray12[1] = intArray1[1];
        intArray12[2] = intArray2[0];
        intArray12[3] = intArray2[1];

        //Array Werte ausgeben
        System.out.println(intArray12[0]);
        System.out.println(intArray12[1]);
        System.out.println(intArray12[2]);
        System.out.println(intArray12[3]);


        //////////////////////
        ///// Aufgabe: 5 /////
        //////////////////////

        //Array erstellen
        int[] newIntArray = new int[9];

        //Array Werte zuweisen
        newIntArray[0] = 3;
        newIntArray[1] = 6;
        newIntArray[2] = 9;
        newIntArray[3] = 12;
        newIntArray[4] = 15;
        newIntArray[5] = 18;
        newIntArray[6] = 21;
        newIntArray[7] = 24;
        newIntArray[8] = 27;

        //Array length bekommen
        int arrayLength = newIntArray.length;

        //Array mitte berechnen
        int arrayMitte = arrayLength / 2;

        //mittlere 3 Arraywerte ausgeben
        System.out.println(newIntArray[arrayMitte - 1]);
        System.out.println(newIntArray[arrayMitte]);
        System.out.println(newIntArray[arrayMitte + 1]);


        //////////////////////
        ///// Aufgabe: 6 /////
        //////////////////////

        //"Unlucky"-Array erstellen
        int[] unlucky = new int[3];

        //"Unlucky" Werte zuweisen
        unlucky[0] = 1;
        unlucky[1] = 3;
        unlucky[2] = 7;
        unlucky[3] = 8;

    }

}
