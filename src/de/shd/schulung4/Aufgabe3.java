package de.shd.schulung4;

public class Aufgabe3 {

    static int number1 = 0;
    static int number2 = 1;
    static int numberTemp = 0;

    public static void main(String[] args) {

        System.out.println(calculateFibonacci(13));
        System.out.println(calculateFibonacci(13));
        System.out.println(calculateFibonacci(13));

    }

    private static int calculateFibonacci(int n){
        if (n <= 1){
            number1 = 0;
            number2 = 1;
            return numberTemp;

        }else{

            numberTemp = number1 + number2;
            number1 = number2;
            number2 = numberTemp;
            return calculateFibonacci(n - 1);

        }
    }

}
