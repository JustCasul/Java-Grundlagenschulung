package schulung3;

import de.shd.java.course.util.ConsoleHelper;

public class MethodenExample {

    public static void main(String[] args) {

        begruessung();

        // Strg + Alt + M = markierten code auslagern
        begruessungTeam();


    }

    private static void begruessungTeam() {
        System.out.println("Hallo Tim");
        System.out.println("Hallo Tim");
        System.out.println("Hallo Tim");
        System.out.println("Hallo Tim");
        System.out.println("Hallo Tim");
    }

    public static void begruessung(){

        System.out.println("Hallo");

    }

}
