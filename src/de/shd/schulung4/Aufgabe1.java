package de.shd.schulung4;

public class Aufgabe1 {

    static int counter = 0;

    public static void main(String[] args) {
        System.out.println(countSeven(5876787));
    }

    public static int countSeven(int number) {
        if (number <= 0) return 0;

        if (number % 10 == 7) {
            number = number / 10;
            return 1 + countSeven(number);
        } else {
            return 0 + countSeven(number / 10);
        }
    }

}
