package de.shd.schulung2;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        char[] buchstaben = new char [5];
        String[] texte = new String[20];

        numbers[0] = -10;
        numbers[9] = 15;

        System.out.println(numbers[0]);
        System.out.println(numbers[9]);

        int[] numbers2 = new int[]{1, 2, 3, 4, 5};

        String text = "Hello World!";
        char[] buchstaben2 = text.toCharArray();

        System.out.println(buchstaben[0]);
        System.out.println(buchstaben[11]);

    }

}
