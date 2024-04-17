package schulung3;

import java.sql.SQLOutput;

public class RückgabewertExample {

    public static void main(String[] args) {

        String name = "Tim";

        String nameEins = rueckgabeName();

        int zahl = getFive();




    }

    public static int getFive(){

        return 5;

    }


    //Rückgabe Name
    public static String rueckgabeName(){

        String name = "Tim";
        return "Tim";
    }


}
