package de.shd.schulung1;

import de.shd.java.course.util.ConsoleHelper;

import java.io.Console;

public class Wahrheitswerte {

    public static void main(String[] args) {

        //Deklaration und Initialisierung eines Wahrheitswerts
        boolean benIstCool = true;
        boolean benIstNichtCool = !benIstCool;

        //Abfrage vom User-Alter
        int alterVomUser = ConsoleHelper.readInt("Bitte gib dein Alter ein:");

        if(alterVomUser > 25 && alterVomUser % 2 == 0) {
            System.out.println("Du bist zu alt.");
        }
        else if (alterVomUser > 10) {
            System.out.println("Du bist verdammt jung.");
        }
        else {
            System.out.println("Du viel zu jung.");
        }

        if(alterVomUser > 25) {
            System.out.println("Du bist zu alt.");
        }
        if(alterVomUser > 10) {
            System.out.println("Du bist verdammt jung.");
        }
    }

}
