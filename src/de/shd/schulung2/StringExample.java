package de.shd.schulung2;

public class StringExample {

    public static void main(String[] args) {

        String textHello = "Hello ";
        String textWorld = "World!";

        String text = textHello + textWorld;
        System.out.println(text);

        //Länge ausgeben
        int length = text.length();
        System.out.println("Länge: " + length);

        if (text.isEmpty()) {

        }

        //Fängt der Text mit "Hello" an?
        boolean startsWithHello = text.startsWith("Hello");

        //Endet der Text mit "Hello"?
        boolean endsWithHello = text.endsWith("Hello");

        //Sind die Texte gleich?
        boolean equals = text.equals("Hello World!");

        //Text in Lower Case
        String lowerCaseText = text.toLowerCase();
        System.out.println(lowerCaseText);

        //Text in Upper Case
        String upperCaseText = text.toUpperCase();
        System.out.println(upperCaseText);

        //Enthält der Text "ello"?
        boolean containsEllo = text.contains("ello");

        //Substring
        String substring = text.substring(0, 5);
        System.out.println(substring);

        //Textblock
        String textblock = """
                Ich kann hier einen
                formatierten Text 
                schreiben!
                """;
        System.out.println(textblock);


    }

}
