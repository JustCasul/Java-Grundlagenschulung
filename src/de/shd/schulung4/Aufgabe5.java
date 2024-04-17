package de.shd.schulung4;

public class Aufgabe5 {

    static int num1 = 0;
    static int num2 = 1;

    public static void main(String[] args) {

        System.out.println(alphabet("aabbccddeeff"));

    }

    public static String alphabet(String soup){

        if (soup.length() > 0){

            String letter1 = soup.substring(num1, num2);
            String soupLeftovers = soup.substring(num2);


            if (soupLeftovers.contains(letter1)){

                return alphabet(soupLeftovers);

            }else {

                return letter1 + alphabet(soupLeftovers);

            }

        }

        return "";

    }

}
