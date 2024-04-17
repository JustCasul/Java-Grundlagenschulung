package de.shd.schulung3;

public class ConsolePrinter {

    static String text = "League of Legends";
    static int textLength = text.length() + 6;

    public static void main(String[] args) {

        textFrame();
        textMid();
        textFrame();

    }

    public static void textFrame(){

        System.out.print("+");
        for (int i = textLength; i > 0 ; i--) {

            System.out.print("-");

        }
        System.out.println("+");

    }

    public static void textMid(){

        System.out.println("|" + "   " + text + "   " + "|");

    }

}
