package schulung3;

public class UebergabeparameterAufgabe {

    public static void main(String[] args) {

        //Aufgabe 3
        System.out.println(addition(5,5));
        System.out.println(subtraktion(5,5));
        System.out.println(division(5,5));
        System.out.println(multiplikation(5,5));
        System.out.println(modulo(5,5));


    }

    //a
    public static int addition(int zahlEins, int zahlZwei){

        return zahlEins + zahlZwei;

    }

    //b
    public static int subtraktion(int zahlEins, int zahlZwei){

        return zahlEins - zahlZwei;

    }

    //c
    public static int division(int zahlEins, int zahlZwei){

        return zahlEins / zahlZwei;

    }

    //d
    public static int multiplikation(int zahlEins, int zahlZwei){

        return zahlEins * zahlZwei;

    }

    //e
    public static int modulo(int zahlEins, int zahlZwei){

        return zahlEins % zahlZwei;

    }
}
