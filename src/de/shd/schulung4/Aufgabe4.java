package de.shd.schulung4;

public class Aufgabe4 {

    public static void main(String[] args) {

        System.out.println(favouriteLetter("teebeutel" , "e"));

    }

    private static String favouriteLetter(String soup, String letter){


        if (soup.length() > 0){

            String currentLetter = soup.substring(0, 1);
            String soupRest = soup.substring(1);

            if (letter.equals(currentLetter)){
                return favouriteLetter(soupRest,letter) + currentLetter;

            }else {
                return currentLetter + favouriteLetter(soupRest,letter);

            }

        }

        return "";

    }

}
