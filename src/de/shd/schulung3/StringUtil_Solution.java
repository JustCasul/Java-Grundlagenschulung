package de.shd.schulung3;

public class StringUtil_Solution {

    public static void main(String[] args) {

        System.out.println(translateToBonnerBi("Kaffeemaschine"));

    }

    private static String translateToBonnerBi(String text)
    {
        String rueckgabeGedicht = "";
        boolean doppelVokal = false;
        for( int i = 0; i < text.length(); i++ )
        {
            final String buchstabe = text.substring(i, i + 1);
            rueckgabeGedicht = rueckgabeGedicht + buchstabe;
            if( isVokal(buchstabe) )
            {
                final String naechsterBuchstabe = getNaechsterBuchstabe(text, i);
                if( !doppelVokal && isVokal(naechsterBuchstabe) )
                {
                    doppelVokal = true;
                    continue;
                }
                doppelVokal = false;
                rueckgabeGedicht = rueckgabeGedicht + "bi";
            }
        }
        return rueckgabeGedicht;
    }

    private static String getNaechsterBuchstabe(String text, int i)
    {
        if( i + 1 < text.length() )
        {
            return text.substring(i + 1, i + 2);
        }
        return "";
    }

    private static boolean isVokal(String buchstabe)
    {
        return "a".equalsIgnoreCase(buchstabe) ||
                "e".equalsIgnoreCase(buchstabe) ||
                "i".equalsIgnoreCase(buchstabe) ||
                "o".equalsIgnoreCase(buchstabe) ||
                "u".equalsIgnoreCase(buchstabe);
    }


}
