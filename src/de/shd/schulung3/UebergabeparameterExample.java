package schulung3;

public class UebergabeparameterExample {

    public static void main(String[] args) {

        String nichtName = "Struppi";

        begruessePerson(nichtName);
        System.out.println(addition(2,3));

    }

    //Begruessung Name
    public static void begruessePerson(String name) {

        System.out.println("Hallo " + name);

        System.out.println(addition(2,3));

    }

    //Addition
    public static int addition(int zahlEins, int zahlZwei) {

        int ergebnis = zahlEins + zahlZwei;
        return ergebnis;

    }


}
