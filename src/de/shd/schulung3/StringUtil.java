package de.shd.schulung3;

public class StringUtil {

    static String text =
            """
            Ich habe dich,
            Lotte, so lieb.
            Hast auch du mich
            Lieb? Nein, vergib.

            Nah oder fern,
            Gott sei dir gut.
            Mein Herz hat gern
            An dir geruht.
            """;

    public static void main(String[] args) {

        System.out.println(biSprache());

    }

    public static String biSprache() {

        String newText1 = text.replaceAll("i", "ibi");
        String newText2 = newText1.replaceAll("I", "Ibi");
        String newText3 = newText2.replaceAll("A", "Abi");
        String newText4 = newText3.replaceAll("a", "abi");
        String newText5 = newText4.replaceAll("E", "Ebi");
        String newText6 = newText5.replaceAll("e", "ebi");
        String newText7 = newText6.replaceAll("O", "Obi");
        String newText8 = newText7.replaceAll("o", "obi");
        String newText9 = newText8.replaceAll("U", "Ubi");

        return newText9.replaceAll("u", "ubi");
    }

}
